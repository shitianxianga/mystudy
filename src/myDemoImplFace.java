/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/11/13 10:04
 * @updateDate 2020/11/13 10:04
 **/
public class myDemoImplFace implements myDemo{
    private myDemoImpl myDemo;

    public myDemoImplFace(myDemoImpl myDemo) {
        this.myDemo = myDemo;
    }

    @Override
    public void add() {
        this.myDemo.add();
    }

    @Override
    public void edit() {
        this.myDemo.edit();
    }

    @Override
    public void del() {
        this.myDemo.del();
    }

    @Override
    public void get() {
        this.myDemo.del();
    }
}
