package com.benonshi.tree;

import com.benonshi.model.TreeNode;

/**
 * 剑指 Offer 28. 对称的二叉树
 * 请实现一个函数，用来判断一棵二叉树是不是对称的。如果一棵二叉树和它的镜像一样，那么它是对称的。
 * <p>
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 *
 * @author BenOniShi
 * @date 2021/6/13 16:44
 */
public class IsSymmetric {

    public boolean isSymmetric(TreeNode root) {
        return root == null || dfs(root.left, root.right);
    }

    public boolean dfs(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        return left.val == right.val && dfs(left.left, right.right)
                && dfs(left.right, right.left);
    }
}
