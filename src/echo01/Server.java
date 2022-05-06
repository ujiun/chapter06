package echo01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
   public static void main(String[] args) throws IOException {

      ServerSocket ServerSocket = new ServerSocket();

      
      ServerSocket.bind(new InetSocketAddress("10.118.27.180", 10001));  // port번호 개인설정
      
      //accept() : 허락
      System.out.println("<서버시작>");
      System.out.println("==============================");
      System.out.println("[연결을 기다리고 있습니다.]");
      
      Socket socket = ServerSocket.accept();
      System.out.println("[클라이언트가 연결되었습니다.]");
      
      //메시지 받기용 스트림
      InputStream is = socket.getInputStream();
      InputStreamReader isr = new InputStreamReader(is, "UTF-8");
      BufferedReader br = new BufferedReader(isr);
      
      //메시지 보내기용 스트림
      OutputStream os = socket.getOutputStream();
      OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
      BufferedWriter bw = new BufferedWriter(osw);
      
      //
      while(true) {
         //메시지받기
          String msg = br.readLine();
                    
          if(msg == null) {
        	  break;
          }
          
          System.out.println("받은메시지:" + msg);
          
         //메시지보내기
          bw.write(msg);
          bw.newLine();
          bw.flush();
      }
    
      
      System.out.println("==============================");
      System.out.println("<서버종료>");
      
      br.close();
      socket.close();
      ServerSocket.close();

   }
}