package suanfa;

public class leetCode6 {
    public static boolean isPalindrome(String s) {
        if (s == "") {
            return  true;
        }
        String a=change(s);
        int i,j=a.length()-1;
        for (i=0;i<j;i++)
        {
            if (a.charAt(i)!=a.charAt(j))
            {
                return false;
            }
            j--;
        }
        return  true;
    }
  static   String  change(String s)
    {
        String a="";
        for (int i=0;i<s.length();i++)
        {
            if ((s.charAt(i)<='Z'&&s.charAt(i)>='A')||(s.charAt(i)<='z'&&s.charAt(i)>='a')
            ||(s.charAt(i)<='9'&&s.charAt(i)>=0))
            {
                a+=s.charAt(i);
            }
        }
        return  a.toLowerCase();
    }

    public static void main(String[] args) {
        String s="race a car";
        System.out.println(isPalindrome(s));
    }
}
