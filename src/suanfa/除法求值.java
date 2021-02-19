package suanfa;

import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

import java.util.*;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/1/6 9:22
 * @updateDate 2021/1/6 9:22
 **/
public class 除法求值 {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        double[] doubles=new double[queries.size()];
        Map<String,Map<String,Double>> map=new HashMap<>();
        for (int i=0;i<equations.size();i++)
        {
            if (map.containsKey(equations.get(i).get(0)))
            {
                Map<String,Double> m=map.get(equations.get(i).get(0));
                if (!m.containsKey(equations.get(i).get(1)))
                {
                    m.put(equations.get(i).get(1),values[i]);
                }
            }
            else {
              Map<String,Double> m=  new HashMap<String, Double>();
                      m.put(equations.get(i).get(1),values[i]);
                map.put(equations.get(i).get(0),m );
            }
            if (map.containsKey(equations.get(i).get(1)))
            {
                Map<String,Double> m=map.get(equations.get(i).get(1));
                if (!m.containsKey(equations.get(i).get(0)))
                {
                    m.put(equations.get(i).get(0),1/values[i]);
                }
            }
            else {
                Map<String,Double> m=  new HashMap<String, Double>();
                m.put(equations.get(i).get(0),1/values[i]);
                map.put(equations.get(i).get(1),m );
            }
        }
        for (int i=0;i<queries.size();i++)
        {
            Queue queue=new LinkedList();
            String start=queries.get(i).get(0);
            String end=queries.get(i).get(1);
            int count=1;
            if (map.containsKey(start))
            {
                queue.offer(start);
                while (!queue.isEmpty())
                {
                    Map<String,Double> map1=map.get(queue.poll());
                    if (map1.containsKey(end))
                    {
                        doubles[i]=count*map1.get(end);
                        break;
                    }

                }
                continue;
            }
            doubles[i]=-1;
        }

        return  null;
    }
}
