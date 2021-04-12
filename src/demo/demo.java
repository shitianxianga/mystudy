package demo;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/4/8 10:06
 * @updateDate 2021/4/8 10:06
 **/
public class demo {
    public static void main(String[] args) {
        Sub sub=new Sub();
        Pub pub=new Pub();
        Pub pub1=new Pub();
        sub.addLisener(pub);
        sub.addLisener(pub1);


        Pu pu=new PuCp(new PuSimple());
    }
}
