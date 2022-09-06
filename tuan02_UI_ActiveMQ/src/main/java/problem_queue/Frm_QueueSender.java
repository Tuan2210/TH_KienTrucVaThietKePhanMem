package problem_queue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
//import javax.jms.Message;
import javax.jms.MessageProducer;
import javax.jms.ObjectMessage;
import javax.jms.Session;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.swing.*;
import javax.xml.bind.JAXBException;

import org.apache.log4j.BasicConfigurator;

import java.awt.*;

public class Frm_QueueSender extends JPanel implements ActionListener{
	private static final long serialVersionUID = 1L;

	private JFrame frame;
	private JTextField txtMSSV, txtHoTen, txtNgaySinh;
	private JButton btnSend;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frm_QueueSender window = new Frm_QueueSender();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frm_QueueSender() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Send Messages");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.cyan);
		frame.getContentPane().setLayout(null);
		
		JLabel lblMSSV = new JLabel("MSSV:");
		lblMSSV.setBounds(32, 27, 62, 14);
		frame.getContentPane().add(lblMSSV);
		
		txtMSSV = new JTextField();
		txtMSSV.setBounds(105, 24, 280, 20);
		frame.getContentPane().add(txtMSSV);
		txtMSSV.setColumns(10);
		
		JLabel lblHoTen = new JLabel("Họ tên:");
		lblHoTen.setBounds(32, 70, 62, 14);
		frame.getContentPane().add(lblHoTen);

		txtHoTen = new JTextField();
		txtHoTen.setBounds(105, 67, 280, 20);
		frame.getContentPane().add(txtHoTen);
		txtHoTen.setColumns(10);
		
		JLabel lblNgaySinh = new JLabel("Ngày sinh:");
		lblNgaySinh.setBounds(32, 118, 62, 14);
		frame.getContentPane().add(lblNgaySinh);
		
		txtNgaySinh = new JTextField();
		txtNgaySinh.setColumns(10);
		txtNgaySinh.setBounds(105, 115, 280, 20);
		frame.getContentPane().add(txtNgaySinh);
		
		btnSend = new JButton("GỬI");
		btnSend.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSend.setBounds(180, 200, 89, 23);
		frame.getContentPane().add(btnSend);
		
		txtMSSV.addActionListener(this);
		txtHoTen.addActionListener(this);
		txtNgaySinh.addActionListener(this);
		btnSend.addActionListener(this);
		
	}
	
	public void sendData(String txtMSSV, String txtHoTen, String txtNgaySinh) throws NamingException, JMSException, JAXBException {
		//config environment for JMS
		BasicConfigurator.configure();
		//config environment for JNDI
		Properties settings=new Properties();
		settings.setProperty(Context.INITIAL_CONTEXT_FACTORY, 
		"org.apache.activemq.jndi.ActiveMQInitialContextFactory");
		settings.setProperty(Context.PROVIDER_URL, "tcp://localhost:61616");
		//create context
		Context ctx=new InitialContext(settings);
		//lookup JMS connection factory
		ConnectionFactory factory=
		(ConnectionFactory)ctx.lookup("ConnectionFactory");
		//lookup destination. (If not exist-->ActiveMQ create once)
		Destination destination=
		(Destination) ctx.lookup("dynamicQueues/thanthidet");
		//get connection using credential
		Connection con=factory.createConnection("admin","admin");
		//connect to MOM
		con.start();
		//create session
		Session session=con.createSession(
		/*transaction*/false,
		/*ACK*/Session.AUTO_ACKNOWLEDGE
		);
		
		//create producer
		MessageProducer producer = session.createProducer(destination);
//		//create text message
//		Message msg=session.createTextMessage(""+txtData);
//		producer.send(msg);
		
		Student s=new Student(txtMSSV, txtHoTen, txtNgaySinh);
		
		//send text mess
//		String xml=new XMLConvert<Student>(s).object2XML(s);
//		Message msg=session.createTextMessage(xml);
//		producer.send(msg);
		
		//sned obj mess
		ObjectMessage objectMessage = session.createObjectMessage(s);
		producer.send(objectMessage);
		
		//shutdown connection
		session.close();con.close();
		System.out.println("Đã gửi: " +s.getMssv() +", " +s.getHoTen() +", " +s.getNgaySinh());
	}

	@SuppressWarnings("static-access")
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(btnSend)) {
			if(txtMSSV.getText().equals("") || txtHoTen.getText().equals("") || txtNgaySinh.getText().equals(""))
				JOptionPane.showMessageDialog(frame, "Vui lòng nhập thông tin!", "Thông báo", JOptionPane.WARNING_MESSAGE);
			else {
				try {
					sendData(txtMSSV.getText(), txtHoTen.getText(), txtNgaySinh.getText());
				} catch (NamingException e1) {
					e1.printStackTrace();
				} catch (JMSException e1) {
					e1.printStackTrace();
				} catch (JAXBException e1) {
					e1.printStackTrace();
				}
				
				this.setVisible(false);
				new Frm_QueueReceiver().main(null);
			}

		}
	}
}
