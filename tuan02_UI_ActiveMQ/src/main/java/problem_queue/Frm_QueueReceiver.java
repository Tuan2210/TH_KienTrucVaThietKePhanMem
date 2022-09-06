package problem_queue;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
//import javax.jms.ObjectMessage;
import javax.jms.Session;
//import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.swing.*;

import org.apache.activemq.command.ActiveMQObjectMessage;
import org.apache.log4j.BasicConfigurator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

public class Frm_QueueReceiver extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;

	private JFrame frame;
	private JTextField txtMSSV, txtHoTen, txtNgaySinh;
	private JButton btnReceive;
	
//	private String txt1;
//	private String txt2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frm_QueueReceiver window = new Frm_QueueReceiver();
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
	public Frm_QueueReceiver() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Receive Messages");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.green);
		frame.getContentPane().setLayout(null);
		
		JLabel lblMSSV = new JLabel("MSSV:");
		lblMSSV.setBounds(32, 27, 67, 14);
		frame.getContentPane().add(lblMSSV);
		
		txtMSSV = new JTextField();
		txtMSSV.setEditable(false);
		txtMSSV.setBounds(105, 24, 280, 20);
		frame.getContentPane().add(txtMSSV);
		txtMSSV.setColumns(10);
		
		JLabel lblHoTen = new JLabel("Họ tên:");
		lblHoTen.setBounds(32, 70, 67, 14);
		frame.getContentPane().add(lblHoTen);
		
		txtHoTen = new JTextField();
		txtHoTen.setEditable(false);
		txtHoTen.setBounds(105, 67, 280, 20);
		frame.getContentPane().add(txtHoTen);
		txtHoTen.setColumns(10);
		
		JLabel lblNgaySinh = new JLabel("Ngày sinh:");
		lblNgaySinh.setBounds(32, 116, 67, 14);
		frame.getContentPane().add(lblNgaySinh);
		
		txtNgaySinh = new JTextField();
		txtNgaySinh.setEditable(false);
		txtNgaySinh.setColumns(10);
		txtNgaySinh.setBounds(105, 113, 280, 20);
		frame.getContentPane().add(txtNgaySinh);
		
		btnReceive = new JButton("NHẬN");
		btnReceive.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnReceive.setBounds(180, 200, 89, 23);
		frame.getContentPane().add(btnReceive);
		
		txtMSSV.addActionListener(this);
		txtHoTen.addActionListener(this);
		txtNgaySinh.addActionListener(this);
		btnReceive.addActionListener(this);
	}

	public void receiveData() throws NamingException, JMSException {
		// thiết lập môi trường cho JMS
				BasicConfigurator.configure();
				// thiết lập môi trường cho JJNDI
				Properties settings = new Properties();
				settings.setProperty(Context.INITIAL_CONTEXT_FACTORY, "org.apache.activemq.jndi.ActiveMQInitialContextFactory");
				settings.setProperty(Context.PROVIDER_URL, "tcp://localhost:61616");
				// tạo context
				Context ctx = new InitialContext(settings);
				// lookup JMS connection factory
				Object obj = ctx.lookup("ConnectionFactory");
				ConnectionFactory factory = (ConnectionFactory) obj;
				// lookup destination
				Destination destination = (Destination) ctx.lookup("dynamicQueues/thanthidet");
				// tạo connection
				Connection con = factory.createConnection("admin", "admin");
				// nối đến MOM
				con.start();
				// tạo session
				Session session = con.createSession(/* transaction */false, /* ACK */Session.CLIENT_ACKNOWLEDGE);
				// tạo consumer
				MessageConsumer consumer = session.createConsumer(destination);
				// blocked-method for receiving message - sync
				// receiver.receive();
				// Cho receiver lắng nghe trên queue, chừng có message thì notify - async
				
				consumer.setMessageListener(new MessageListener() {
					// có message đến queue, phương thức này được thực thi
					public void onMessage(Message msg) {// msg là message nhận được
						try {
//							if (msg instanceof TextMessage) {
//								TextMessage tm = (TextMessage) msg;
//								txt1 = tm.getText();
//								msg.acknowledge();// gửi tín hiệu ack
//							} 
							if (msg instanceof ActiveMQObjectMessage) {
//								ObjectMessage om = (ObjectMessage) msg;
//								System.out.println("Đã nhận: " +om.toString());
								
								ActiveMQObjectMessage mess = (ActiveMQObjectMessage) msg;
								if(mess!=null) {
									Student s = (Student) mess.getObject();
									System.out.println(("Đã nhận: " +s.toString()));
									
									txtMSSV.setText(s.getMssv());
									txtHoTen.setText(s.getHoTen());
									txtNgaySinh.setText(s.getNgaySinh());
								}
							}
							// others message type....
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(btnReceive)) {
			try {
				receiveData();
			} catch (NamingException e1) {
				e1.printStackTrace();
			} catch (JMSException e1) {
				e1.printStackTrace();
			}
		}
	}

}
