package 限流算法;


/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/4/15 10:34
 * @updateDate 2021/4/15 10:34
 **/
public class WindowTime {
    private Integer solt;
    private Integer limit;
    private TimeUnit timeUnit;
    private Node lastNode;
    private long soltTime;

    public WindowTime(Integer solt, Integer limit, TimeUnit timeUnit) {
        this.solt = solt;
        this.limit = limit;
        this.timeUnit = timeUnit;
    }
    public void init()
    {
        Node currentNode=null;
        long current=System.currentTimeMillis();
        for (int i=0;i<solt;i++)
        {
            if (lastNode==null)
            {
                lastNode=new Node(current,i+1);
                currentNode=lastNode;
            }
            else
            {
                lastNode.setNext(new Node(current,i+1));
                lastNode=lastNode.getNext();
            }
        }
        lastNode.setNext(currentNode);
        soltTime=timeUnit.getValue()/solt;
    }
    public synchronized boolean  checkAndAdd()
    {
        reset();
        lastNode.addCount();
        int num=0;
        Node current=lastNode;
        for (int i=0;i<solt;i++)
        {
            num+=current.getCount();
            current=current.getNext();
        }
        if (num>limit)
        {
            return false;
        }
        return true;
    }

    private void reset() {
        long current=System.currentTimeMillis();
        long num=(current-lastNode.getTime())/soltTime;
        if (num>solt)
        {
            num=solt;
        }
        reset(num,current);
    }

    private void reset(long num, long current) {
        if (num<=0)
        {
            return;
        }
        Node currentNode=lastNode;
        for (int i=0;i<num;i++)
        {
            currentNode=currentNode.getNext();
        }
        currentNode.setCount(0);
        currentNode.setTime(current);
        lastNode=currentNode;
    }
}
