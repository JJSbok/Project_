import java.io.*;
import java.net.URL;


public class Main {
    public static void main(String[] args) throws IOException {

        URL url = new URL("https://img.megabox.co.kr/SharedImg/2023/03/17/GAxEUFAGtnYagesWNyGG9E2JRXwbIOh2_420.jpg");

        InputStream fin = url.openStream();



//        FileInputStream fin = new FileInputStream("/Users/jsj/zzz/1.jpeg");

        FileOutputStream fos = new FileOutputStream("/Users/jsj/zzz/copy.jpeg");

        System.out.println(fin);


        while(true){
            int data = fin.read();
            if(data== -1){
                break;
            }
            fos.write(data);
        }
    }
}