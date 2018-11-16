package Medium;

import javafx.util.Pair;

import java.util.HashMap;

/**
 * https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/description/
 */

public class ConstructBinaryTrueFromPreorderandInorderTraversal {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val=x;
        }
    }
//    class Solution {
//        public Pair<TreeNode,int []> helper(int[] preorder, int[] inorder){
//            if (inorder.length == 0){
//                return new Pair<>(null,preorder);
//            }
//
//            int rootValue = preorder[0];
//            TreeNode rootNode = new TreeNode(rootValue);
//
//            int preOrderIndex = 0;
//
//
//        }
//
//        public TreeNode buildTree(int[] preorder, int[] inorder) {
//            Pair<Integer,Integer> mappedIndex = new Pair<>(1,1);
//            mappedIndex.getKey();
//        }
//    }
}
