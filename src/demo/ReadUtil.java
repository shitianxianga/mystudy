package demo;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/4/8 9:37
 * @updateDate 2021/4/8 9:37
 **/
public class ReadUtil {
    public  static  String read(String s,Read r)
    {
        return r.read(s);
    }
    public static void main(String[] args) {
        read("123", new Read() {
            @Override
            public String read(String a) {
                return a.substring(0,a.length()/2);
            }
        });
    }
}
