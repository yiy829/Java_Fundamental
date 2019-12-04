package java_20191204.echo.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	private int port;

	public EchoServer(int port) {
		this.port = port;
	}

	public void run() {
		ServerSocket serverSocket = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			// 1. ServerSocket 객체를 생성한다.
			serverSocket = new ServerSocket(port);

			while (true) {
				System.out.println("클라이언트 접속을 기다리고 있습니다.");
				// accept() 메서드는 클라이언트 접속을 기다리다 클라이언트가 접속하면
				// 클라이언트와 통신할 수 있는 Socket 객체를 반환한다.
				// 2. 서버소켓으로 클라이언트의 접속을 기다린다.
				// 5. 클라이언트와 통신할 수 있는 소캣 객체를 반환한다.
				Socket socket = serverSocket.accept();

				System.out.println("클라이언트가 접속했습니다. ip : " + socket.getInetAddress().getHostAddress());

				// 7. 소켓으로 입력스트림을 생성한다.
				InputStream in = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(in);
				br = new BufferedReader(isr);
				String readLine = br.readLine();
				System.out.println(readLine);

				// 8. 소켓으로 출력스트링을 생성한다.
				OutputStream out = socket.getOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(out);
				bw = new BufferedWriter(osw);
				bw.write(readLine);
				bw.newLine();
				bw.flush();

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new EchoServer(3000).run();

	}
}
