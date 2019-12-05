package java_20191205.multicast.client;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MulticastClient implements ActionListener{
	private JFrame jframe;
	private JTextArea jta;
	private JButton jbtn;
	private JTextField jtf;
	private String id;
	private String ip;
	private int port;
	private BufferedReader br;
	private BufferedWriter bw;
	public MulticastClient(String id, String ip, int port){
		this.id = id;
		this.ip = ip;
		this.port = port;
		jframe = new JFrame("Unicast Chatting");
		/*******************북쪽시작*********************/
		JPanel j1 = new JPanel();
		JLabel jl1 = new JLabel("User ID : ["+ id +"]");
		JLabel jl2 = new JLabel("Server IP : "+ ip );
		j1.setLayout(new BorderLayout());
		j1.add(jl1, BorderLayout.CENTER);
		j1.add(jl2, BorderLayout.EAST);		
		/*******************북쪽끝**********************/
		/*******************중앙시작*********************/
		jta = new JTextArea("",20,50);
		JScrollPane jsp = new JScrollPane(jta, 
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		jta.setBackground(new Color(253,245,230));
		jta.setEditable(false);
		/********************중앙끝*********************/
		/********************남쪽시작*******************/
		JPanel j2 = new JPanel();
		jtf = new JTextField(30);
		jbtn = new JButton("SEND");
		j2.setLayout(new BorderLayout());
		j2.add(jtf, BorderLayout.CENTER);
		j2.add(jbtn, BorderLayout.EAST);
		/********************남쪽끝********************/
		jframe.add(j1, BorderLayout.NORTH);
		jframe.add(jsp, BorderLayout.CENTER); //center는 생략 가능
		jframe.add(j2, BorderLayout.SOUTH);
		
		jframe.pack();
		jframe.setResizable(false);
		jframe.setVisible(true); //창을 닫아도 꺼지지 않는다.
		
		jbtn.addActionListener(this);
		jtf.addActionListener(this);
		
		jframe.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				try {
					bw.write("exit");
					bw.newLine();
					bw.flush();
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.exit(0);
			}
			public void windowOpened(WindowEvent e){
				jtf.requestFocus();
			}
		});
	}
	
	
	
	
	public void connect(){
		try {
			Socket socket = new Socket(ip,port);
			//쓰고 읽고
			bw = new BufferedWriter(
					new OutputStreamWriter(
							socket.getOutputStream()));
			/*OutputStream out = socket.getOutputStream(); //하수
			OutputStreamWriter osw = new OutputStreamWriter(out);
			BufferedWriter bw = new BufferedWriter(osw);*/
			
			br = new BufferedReader(
					new InputStreamReader(
							socket.getInputStream()));
			
			MultiClientThread mct = new MultiClientThread(br, jta);
			//MultiClientThread mct = new MultiClientThread(this); //여러개 넘길경우에 편리
			Thread t = new Thread(mct);
			t.start();
			/*InputStream in = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(in);
			BufferedReader br = new BufferedReader(isr);*/
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		new MulticastClient("yiy829", "192.168.0.203", 3000).connect();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		String message = jtf.getText();
		if(obj == jbtn){
			try {
				bw.write(id + " : " + message);
				bw.newLine();
				bw.flush();
				
				jtf.setText("");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		} else if(obj == jtf){
			try {
				bw.write(id + " : " + message);
				bw.newLine();
				bw.flush();
				
				jtf.setText("");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}
