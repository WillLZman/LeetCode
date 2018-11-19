package Easy;

import java.util.List;

/**
https://leetcode.com/problems/n-ary-tree-preorder-traversal/
 */
public class NAryTreePreorderTraversal {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
    public List<Integer> preorder(Node root) {

    }
}
