package socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/12/24 16:41
 * @updateDate 2020/12/24 16:41
 **/
public class server {
    public static void main(String[] args) {
        ServerSocket serverSocket=null;
        try {
            serverSocket=new ServerSocket(8080);
                Socket socket = serverSocket.accept();
                PrintWriter writer = new PrintWriter(socket.getOutputStream());
                BufferedReader reader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
                BufferedReader sin=new BufferedReader(new InputStreamReader(System.in));
                String lin=sin.readLine();
                while (!lin.equals("bye"))
                {
                    writer.println(lin);
                    writer.flush();
                    System.out.println(reader.readLine());
                    lin=sin.readLine();
                }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
