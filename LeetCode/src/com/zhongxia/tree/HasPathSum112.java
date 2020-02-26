package com.zhongxia.tree;

import java.util.ArrayList;
import java.util.List;

public class HasPathSum112 {
    class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;
    }
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null)
            return false;
        if(root.val==sum&&root.left==null&&root.right==null)
            return true;
        return hasPathSum(root.left,sum-root.val)||hasPathSum(root.right,sum-root.val);


    }
}
