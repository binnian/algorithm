package com.benonshi.node;

import com.benonshi.model.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * 589. N 叉树的前序遍历
 * 给定一个 N 叉树，返回其节点值的 前序遍历 。
 * <p>
 * N 叉树 在输入中按层序遍历进行序列化表示，每组子节点由空值 null 分隔。
 *
 * @author BenOniShi
 * @date 2021/6/4 23:13
 */
public class Preorder {

    List<Integer> list = new ArrayList<Integer>();

    public List<Integer> preorder(Node root) {
        if (root == null) {
            return list;
        }
        list.add(root.val);
        for (Node node : root.children) {
            preorder(node);
        }
        return list;
    }
}
