package com.benonshi.tree;

import com.benonshi.model.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 114. 二叉树展开为链表
 * 给你二叉树的根结点 root ，请你将它展开为一个单链表：
 * <p>
 * 展开后的单链表应该同样使用 TreeNode ，其中 right 子指针指向链表中下一个结点，而左子指针始终为 null 。
 * 展开后的单链表应该与二叉树 先序遍历 顺序相同。
 *
 * @author BenOniShi
 * @date 2021/5/29 0:06
 */
public class Flatten {

    public void flatten(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfs(root, list);
        TreeNode node = root;
        for (int i = 1; i < list.size(); i++) {
            node.right = new TreeNode(list.get(i));
            node.left = null;
            node = node.right;
        }
    }


    public void dfs(TreeNode node, List<Integer> list) {
        if (node != null) {
            list.add(node.val);
            dfs(node.left, list);
            dfs(node.right, list);
        }
    }

}
