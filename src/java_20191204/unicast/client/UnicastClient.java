package java_20191204.unicast.client;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class UnicastClient implements ActionListener{
	private JFrame jframe;
	private JTextArea jta;
	private JButton jbtn;
	private JTextField jtf;
	private String id;
	private String ip;
	private int port;
	public UnicastClient(String id, String ip, int port){
		this.id = id;
		this.ip = ip;
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
				System.exit(0);
			}
			public void windowOpened(WindowEvent e){
				jtf.requestFocus();
			}
		});
	}
	
	
	
	
	
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		new UnicastClient("yiy829", "192.168.0.107", 3000);
	}





	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		String message = jtf.getText();
		if(obj == jbtn){
			jta.append(id + " : " + message +"\n");
			jtf.setText("");
		} else if(obj == jtf){
			jta.append(id + " : " + message +"\n");
			jtf.setText("");
		}
	}
}
