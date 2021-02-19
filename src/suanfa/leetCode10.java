package suanfa;

/**
 * 实现一个 Trie (前缀树)，包含 insert, search, 和 startsWith 这三个操作。
 *
 * 示例:
 *
 * Trie trie = new Trie();
 *
 * trie.insert("apple");
 * trie.search("apple");   // 返回 true
 * trie.search("app");     // 返回 false
 * trie.startsWith("app"); // 返回 true
 * trie.insert("app");
 * trie.search("app");     // 返回 true
 */
public class leetCode10 {
    class Trie {
        public TreeNode root=new TreeNode();
        /** Initialize your data structure here. */
        public Trie() {

        }


        public void insert(String s)
        {
            TreeNode node =root;
            int charNo=0;
            String n="";
            for (int i=0;i<s.length();i++)
            {
                charNo=s.charAt(i)-'a';
                n+=s.charAt(i);
                if (node.children[charNo]==null)
                {
                    node.children[charNo]=new TreeNode();
                    node.children[charNo].word=n;
                }
                node=node.children[charNo];

            }
            node.end=true;
            node.word=s;
        }

        /** Returns if the word is in the trie. */
        public boolean search(String word)
        {
            TreeNode node=root;
            int charNo=0;
            for (int i=0;i<word.length();i++)
            {
                charNo=word.charAt(i)-'a';
                if (node.children[charNo]==null)
                {
                    return false;
                }
                node=node.children[charNo];

            }
            if(node.end)
            {
                return true;
            }
            return false;
        }

        /** Returns if there is any word in the trie that starts with the given prefix. */
        public boolean startsWith(String prefix)
        {
            TreeNode node=root;
            int charNo=0;
            for (int i=0;i<prefix.length();i++)
            {
                charNo=prefix.charAt(i)-'a';

                if (node.children[charNo]==null)
                {
                    return false;
                }
                if (node.children[charNo].word.equals(prefix))
                {
                    return true;
                }
                node=node.children[charNo];

            }
            return false;
        }
    }
    class TreeNode
    {
        public TreeNode[] children=new TreeNode[26];
        public String word;
        public  boolean end=false;
    }

}
