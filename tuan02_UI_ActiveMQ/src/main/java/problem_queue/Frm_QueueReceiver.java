package problem_queue;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.swing.*;

import org.apache.log4j.BasicConfigurator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

public class Frm_QueueReceiver extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;

	private JFrame frame;
	private JTextField txtReceiver1;
//	private JTextField txtReceiver2;
	private JButton btnReceive;
	
	private String txt1;
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
		
		JLabel lblSender1 = new JLabel("Receiver 1:");
		lblSender1.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		lblSender1.setBounds(32, 27, 67, 14);
		frame.getContentPane().add(lblSender1);
		
//		JLabel lblSender2 = new JLabel("Receiver 2:");
//		lblSender2.setBounds(32, 107, 67, 14);
//		frame.getContentPane().add(lblSender2);
		
		txtReceiver1 = new JTextField();
		txtReceiver1.setEditable(false);
		txtReceiver1.setBounds(105, 24, 280, 20);
		frame.getContentPane().add(txtReceiver1);
		txtReceiver1.setColumns(10);
		
//		txtReceiver2 = new JTextField();
//		txtReceiver2.setEditable(false);
//		txtReceiver2.setBounds(105, 104, 280, 20);
//		frame.getContentPane().add(txtReceiver2);
//		txtReceiver2.setColumns(10);
		
		btnReceive = new JButton("RECEIVE");
		btnReceive.setBounds(180, 200, 89, 23);
		frame.getContentPane().add(btnReceive);
		
		txtReceiver1.addActionListener(this);
//		txtReceiver2.addActionListener(this);
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
				MessageConsumer receiver1 = session.createConsumer(destination);
				// blocked-method for receiving message - sync
				// receiver.receive();
				// Cho receiver lắng nghe trên queue, chừng có message thì notify - async
//				System.out.println("Tý was listened on queue...");
				receiver1.setMessageListener(new MessageListener() {
					
					// có message đến queue, phương thức này được thực thi
					public void onMessage(Message msg) {// msg là message nhận được
						try {
							if (msg instanceof TextMessage) {
								TextMessage tm = (TextMessage) msg;
								txt1 = tm.getText();
								System.out.println("Mess is received: " +txt1);
								txtReceiver1.setText(txt1);
								msg.acknowledge();// gửi tín hiệu ack
								
							} else if (msg instanceof ObjectMessage) {
								ObjectMessage om = (ObjectMessage) msg;
								System.out.println(om);
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
//			receiveData(txtReceiver1);
//			txtReceiver1.setText(txt1);
			if(!txtReceiver1.equals("")) {
				try {
					receiveData();
				} catch (NamingException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (JMSException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
//		if(e.getSource().equals(txtReceiver2))
//			txtReceiver2.setText(txt2);
	}

}
