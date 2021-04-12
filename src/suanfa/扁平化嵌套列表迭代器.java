package suanfa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/3/23 9:00
 * @updateDate 2021/3/23 9:00
 **/
public class 扁平化嵌套列表迭代器 {
     class NestedIterator implements Iterator<Integer> {
         List<NestedInteger>list;
         List<Integer> next=new ArrayList<>();
         int index=0;
         int length=0;
        public NestedIterator(List<NestedInteger> nestedList) {
            list=nestedList;
            for (NestedInteger a:nestedList)
            {
                dl(a);
            }
            length=next.size();
        }

        @Override
        public Integer next() {
            return next.get(index++);
        }

        public void dl(NestedInteger a)
        {
            if (a.isInteger())
            {
                next.add(a.getInteger());
            }
            else
            {
                List<NestedInteger> ns=a.getList();
                for (NestedInteger n:ns)
                {
                    dl(n);
                }
            }
        }

        @Override
        public boolean hasNext() {
            return index<length;
        }
    }
    interface NestedInteger {
        public boolean isInteger();
        public List<NestedInteger> getList();
        public Integer getInteger();
    }


}
