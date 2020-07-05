package algorithms.implementation;


import java.util.Scanner;

public class TreeManager {

    static Scanner scanner = new Scanner(System.in);

    static class Node {
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value) {
            this.value = value;
            this.leftChild = null;
            this.rightChild = null;
        }
    }

    Node root;

    public TreeManager(int key) {
        this.root = new Node(key);
    }

    public TreeManager() {
        this.root = new Node(0);
    }

    public void insertLeft(int value) {

        TreeManager treeManager = new TreeManager();

        treeManager.root.leftChild = new Node(value);
    }

    public void insertRight(int value) {

        TreeManager treeManager = new TreeManager();

        treeManager.root.rightChild = new Node(value);
    }





    public static void main(String[] args) {


    }
}
