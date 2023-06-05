import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx1 {

    //예외처리가 없기 때문에 bad code
    public static void main(String[] args) throws Exception{

        // 서버 소켓준비 포트 필요
        ServerSocket serverSocket = new ServerSocket(8080);

        System.out.println("server ready....");


        for (int i = 0; i < 100; i++){
            Socket clientSocket = serverSocket.accept();
            System.out.println(clientSocket);

            // 읽기 위한 InputStream 필요
            InputStream in = clientSocket.getInputStream();
            FileOutputStream fos = new FileOutputStream("/Users/jsj/zzz/client"+i+".jpeg");

            // 읽고 쓰기
            while(true){
                int data = in.read();
                if(data == -1){
                    break;
                }
                fos.write(data);
            }
            in.close();
            fos.close();
            clientSocket.close();
            // 3번 읽기
//            System.out.println(in.read());
//            System.out.println(in.read());
//            System.out.println(in.read());
        }
        // 연결 확인


    }
}
