package data;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageProducer;
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
	private JTextField txtSender1;
//	private JTextField txtSender2;
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
		
		JLabel lblSender1 = new JLabel("Sender 1:");
		lblSender1.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		lblSender1.setBounds(32, 27, 62, 14);
		frame.getContentPane().add(lblSender1);
		
//		JLabel lblSender2 = new JLabel("Sender 2:");
//		lblSender2.setBounds(32, 107, 62, 14);
//		frame.getContentPane().add(lblSender2);
		
		txtSender1 = new JTextField();
		txtSender1.setBounds(105, 24, 280, 20);
		frame.getContentPane().add(txtSender1);
		txtSender1.setColumns(10);
		
//		txtSender2 = new JTextField();
//		txtSender2.setBounds(105, 104, 280, 20);
//		frame.getContentPane().add(txtSender2);
//		txtSender2.setColumns(10);
		
		btnSend = new JButton("SEND");
		btnSend.setBounds(180, 200, 89, 23);
		frame.getContentPane().add(btnSend);
		
		txtSender1.addActionListener(this);
//		txtSender2.addActionListener(this);
		btnSend.addActionListener(this);
		
	}
	
	public void sendData(String txtData) throws NamingException, JMSException, JAXBException {
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
		//create text message
		Message msg=session.createTextMessage(""+txtData);
		producer.send(msg);
//		Person p=new Person(1001, "Thân Thị Đẹt", new Date());
//		String xml=new XMLConvert<Person>(p).object2XML(p);
//		msg=session.createTextMessage(xml);
//		producer.send(msg);
//		//shutdown connection
//		session.close();con.close();
////		System.out.println("Finished sender"); 
	}

	@SuppressWarnings("static-access")
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(btnSend)) {
			if(txtSender1.getText().equals(""))
				JOptionPane.showMessageDialog(frame, "Vui lòng nhập thông tin!", "Thông báo", JOptionPane.WARNING_MESSAGE);
			else {
				try {
					sendData(txtSender1.getText());
					System.out.println("Mess is sent: " +txtSender1.getText());
					
//					sendData(txtSender2.getText());
//					System.out.println("\nMess 2 is sent!");
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
