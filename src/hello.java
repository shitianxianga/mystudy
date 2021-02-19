import java.util.Comparator;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

public class hello {
    public static void main(String[] args) {
        System.out.println("hellWorld");
        TreeSet<myObject> treeSet =new TreeSet<>(new Comparator<myObject>() {
            @Override
            public int compare(myObject o1, myObject o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        myObject myObject01=new myObject("01",1);
        myObject myObject02=new myObject("02",6);
        myObject myObject03=new myObject("03",3);
        myObject myObject04=new myObject("04",4);
        myObject myObject05=new myObject("05",5);
        treeSet.add(myObject01);
        treeSet.add(myObject02);
        treeSet.add(myObject03);
        treeSet.add(myObject04);
        treeSet.add(myObject05);
        System.out.println(treeSet);

        ThreadLocal threadLocal=new ThreadLocal();

    }
}
