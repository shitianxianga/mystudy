package 限流算法;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/4/15 10:09
 * @updateDate 2021/4/15 10:09
 **/
public class Node {
    private int count;
    private long  time;
    private Node next;
    private Integer id;
    public Node(long time,int id) {
        this.time = time;
        this.id=id;
    }
    public void addCount()
    {
        this.count++;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
}
