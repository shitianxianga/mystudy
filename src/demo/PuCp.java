package demo;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/4/8 10:12
 * @updateDate 2021/4/8 10:12
 **/
public class PuCp implements Pu {
    private Pu pu;
    public PuCp(Pu pu) {
        this.pu=pu;
    }
    @Override
    public void sayHello() {
        //..
        pu.sayHello();
    }
}
