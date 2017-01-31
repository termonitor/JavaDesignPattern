package com.study.struct;

/**
 * Created by panxiaoming on 17/1/31.
 */
public class Node {
    Node leftChild;
    Node rightChild;
    int data;

    public Node(int data) {
        this.data = data;
        leftChild = null;
        rightChild = null;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
