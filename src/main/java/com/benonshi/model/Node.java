package com.benonshi.model;

import java.util.List;

/**
 * @author BenOniShi
 * @date 2021/6/4 23:11
 */
public class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int val) {
        this.val = val;
    }

    public Node(int val, List<Node> children) {
        this.val = val;
        this.children = children;
    }
}
