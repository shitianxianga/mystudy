/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/12/9 16:52
 * @updateDate 2020/12/9 16:52
 **/
public  class MyParent {

    public  void  delOne(Integer num)
    {
        num--;
        System.out.println(num);
        onSaySome(num);

    }
    public void  onSaySome(Integer word)
    {
        System.out.println("pOn");
    }




}
