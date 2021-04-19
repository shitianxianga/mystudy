package 限流算法;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/4/15 16:27
 * @updateDate 2021/4/15 16:27
 **/
public class TimeUnit {
    long value;
    public TimeUnit(long value) {
        this.value = value*1000;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }
}
