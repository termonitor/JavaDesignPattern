package com.study.algorithm.sort;

import com.study.struct.BinaryTree;
import com.study.struct.Node;

import java.util.LinkedList;

/**
 * 二叉树排序
 * 平均时间:O(nlogn) 稳定度:稳定 额外空间:O(n)
 * Created by panxiaoming on 17/1/31.
 */
public class BinTreeSort {

    public static void insertBST(Node node, int v, int i) {
        if(v < node.getData()) {
            if(node.getLeftChild() != null)
                insertBST(node.getLeftChild(), v, i);
            else
                node.setLeftChild(BinaryTree.nodeList.get(i));
        }
        else {
            if(node.getRightChild() != null)
                insertBST(node.getRightChild(), v, i);
            else
                node.setRightChild(BinaryTree.nodeList.get(i));
        }
    }

    public static void createBST(int[] array) {
        BinaryTree.nodeList = new LinkedList<Node>();
        //将一个数组的值依次转换为Node节点
        for(int nodeIndex=0; nodeIndex<array.length; nodeIndex++) {
            BinaryTree.nodeList.add(new Node(array[nodeIndex]));
        }
        Node root = BinaryTree.nodeList.get(0);
        for(int nodeIndex=1; nodeIndex<array.length; nodeIndex++) {
            insertBST(root, array[nodeIndex], nodeIndex);
        }
    }

    public static void main(String[] args) {
//        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] array = {1, -3, 192, 10, 123};
        BinTreeSort.createBST(array);
        Node root = BinaryTree.nodeList.get(0);
        System.out.println("中序遍历：");
        BinaryTree.inOrder(root);
        System.out.println();
    }
}
