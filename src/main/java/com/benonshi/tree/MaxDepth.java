package com.benonshi.tree;

import com.benonshi.model.Node;

/**
 * 559. N 叉树的最大深度
 * <p>
 * 给定一个 N 叉树，找到其最大深度。
 * <p>
 * 最大深度是指从根节点到最远叶子节点的最长路径上的节点总数。
 * <p>
 * N 叉树输入按层序遍历序列化表示，每组子节点由空值分隔。
 *
 * @author BenOniShi
 * @date 2021/6/9 22:09
 */
public class MaxDepth {
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int max = 0;
        for (Node node : root.children) {
            max = Math.max(max, maxDepth(node));
        }
        return max + 1;
    }
}
