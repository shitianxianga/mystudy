package suanfa;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2021/4/14 9:12
 * @updateDate 2021/4/14 9:12
 **/
public class 前缀树实现 {
    class Trie {
        Node node=new Node(' ',false);
        /** Initialize your data structure here. */
        public Trie() {

        }

        /** Inserts a word into the trie. */
        public void insert(String word) {
            Node head=node;
            for (int i=0;i<word.length();i++)
            {
                if (head.nodes[word.charAt(i)-'a']==null) {
                    head.nodes[word.charAt(i) - 'a'] = new Node(word.charAt(i), false);
                }
                head = head.nodes[word.charAt(i) - 'a'];

            }
             head.flag=true;
        }

        /** Returns if the word is in the trie. */
        public boolean search(String word) {
            Node head=node;
            for (int i=0;i<word.length();i++)
            {
                if (head.nodes[word.charAt(i)-'a']==null)
                {
                    return false;
                }
                head=head.nodes[word.charAt(i)-'a'];
            }
            return head.flag;
        }

        /** Returns if there is any word in the trie that starts with the given prefix. */
        public boolean startsWith(String prefix) {
            Node head=node;
            for (int i=0;i<prefix.length();i++)
            {
                if (head.nodes[prefix.charAt(i)-'a']==null)
                {
                    return false;
                }
                head=head.nodes[prefix.charAt(i)-'a'];
            }
            return true;
        }
    }
    class Node{
        char val;
        Node[] nodes=new Node[26];
        boolean flag;
        public Node(char val,boolean flag) {
            this.val = val;
            this.flag=flag;
        }
    }

}
