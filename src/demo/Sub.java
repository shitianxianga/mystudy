package demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/4/8 10:02
 * @updateDate 2021/4/8 10:02
 **/
public class Sub {
    List<Pub> pubs=new ArrayList<>();
    private  String  info;
    public  void addLisener(Pub pub)
    {
        pubs.add(pub);
    }
    public  void  addInfo(String a)
    {

        for (Pub pub:pubs)
        {
            pub.isChange(a);
        }
    }
}
