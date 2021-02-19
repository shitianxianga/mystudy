/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/12/9 16:53
 * @updateDate 2020/12/9 16:53
 **/
public class MyChild extends MyParent {

    public void  onSaySome(Integer word)
    {

        System.out.println(++word);
    }

    public static void main(String[] args) {
        MyChild child=new MyChild();
        child.delOne(2);
    }
}
