package suanfa;

import java.util.HashMap;
import java.util.Map;

public class leetCode2 {
    public static int majorityElement(int[] nums) {
        if (nums.length==1)
        {
            return nums[0];
        }
        Map<Integer,Integer> map=new HashMap<>();
        for (int i:nums)
        {
            if (!map.containsKey(i))
            {
                map.put(i,1);
            }
            else
            {
                 map.put(i,map.get(i)+1);
                if (map.get(i)>nums.length/2)
                {
                    return i;
                }
            }
        }

        return 0;
    }
    public static void main(String[] args) {

    }
}
