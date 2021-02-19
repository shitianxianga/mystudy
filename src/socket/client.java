package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/12/24 16:46
 * @updateDate 2020/12/24 16:46
 **/
public class client {
    public static void main(String[] args) throws IOException {
        Socket socket=null;
        try {
            socket=new Socket("localhost",8080);
            BufferedReader reader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedReader sin=new BufferedReader(new InputStreamReader(System.in));
            PrintWriter writer=new PrintWriter(socket.getOutputStream(),true);
            String lin=sin.readLine();
            while (!lin.equals("bye"))
            {
                writer.println(lin);
                System.out.println(reader.readLine());
                lin=sin.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            socket.close();
        }

    }
}
