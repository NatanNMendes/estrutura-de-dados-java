package dataStructure.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Tree {
    public Node root;
    public class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int value) {
            this.value = value;
        }

        public boolean isLeaf() {
            return (this.left == null) && (this.right == null);
        }

    }

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
        } else {
            Node newNode = new Node(value);
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            while (queue.size() > 0) {
                Node currentNode = queue.remove();
                if (currentNode.left == null) {
                    currentNode.left = newNode;
                    break;
                } else {
                    queue.add(currentNode.left);
                }
                if (currentNode.right == null) {
                    currentNode.right = newNode;
                    break;
                } else {
                    queue.add(currentNode.right);
                }
            }
        }
    }

    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(final Node node) {
        // R E D
        if (node == null) return;
        System.out.println(node.value);
        preOrder(node.left);
        preOrder(node.right);
    }

//    public void preOrder() {
//        if (root == null) return;
//        Stack<Node> stack = new Stack<>();
//        stack.push(root);
//        while (!stack.isEmpty()) {
//            Node node = stack.pop();
//            System.out.println(node.value);
//            if (node.right != null) stack.push(node.right);
//            if (node.left != null) stack.push(node.left);
//        }
//    }

    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(final Node node) {
        // E R D
        if (node == null) return;
        inOrder(node.left);
        System.out.println(node.value);
        inOrder(node.right);
    }

//    public void inOrder() {
//        if (root == null) return;
//        Stack<Node> stack = new Stack<>();
//        Node current = root;
//        while (current != null || !stack.isEmpty()) {
//            while (current != null) {
//                stack.push(current);
//                current = current.left;
//            }
//            current = stack.pop();
//            System.out.println(current.value);
//            current = current.right;
//        }
//    }

    public void posOrder() {
        posOrder(root);
    }

    private void posOrder(final Node node) {
        // E D R
        if (node == null) return;
        posOrder(node.left);
        posOrder(node.right);
        System.out.println(node.value);
    }

//    public void posOrder() {
//        if (root == null) return;
//        Stack<Node> stack1 = new Stack<>();
//        Stack<Node> stack2 = new Stack<>();
//        stack1.push(root);
//        while (!stack1.isEmpty()) {
//            Node node = stack1.pop();
//            stack2.push(node);
//            if (node.left != null) stack1.push(node.left);
//            if (node.right != null) stack1.push(node.right);
//        }
//        while (!stack2.isEmpty()) {
//            System.out.println(stack2.pop().value);
//        }
//    }

    public void BFS() {
        if (root == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node node = queue.remove();
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
            System.out.println(node.value);
        }
    }

//    public void BFS() {
//        if (root == null) return;
//        Queue<Node> queue = new LinkedList<>();
//        queue.add(root);
//        while (!queue.isEmpty()) {
//            Node node = queue.remove();
//            if (node.left != null) queue.add(node.left);
//            if (node.right != null) queue.add(node.right);
//            System.out.println(node.value);
//        }
//    }

    public void DFS() {DFS(root);}
    private void DFS(final Node node) {
        if (node == null) return;
        System.out.println(node.value);
        DFS(node.left);
        DFS(node.right);
    }

//    public void DFS() {
//        if (root == null) return;
//        Stack<Node> stack = new Stack<>();
//        stack.push(root);
//        while (!stack.isEmpty()) {
//            Node node = stack.pop();
//            System.out.println(node.value);
//            if (node.right != null) stack.push(node.right);
//            if (node.left != null) stack.push(node.left);
//        }
//    }
}
