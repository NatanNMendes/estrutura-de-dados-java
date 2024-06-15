package dataStructure.tree.binarySearchTree;

import java.util.Stack;

public class BinarySearchTree {
    public Node root;

    public class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
        } else {
            insert(root, value);
        }
    }

    private void insert(final Node root, final int value) {
        if (root == null) return;
        if (value == root.value) return;
        if (value > root.value) {
            if (root.right == null) root.right = new Node(value);
            else insert(root.right, value);
        } else {
            if (root.left == null) root.left = new Node(value);
            else insert(root.left, value);
        }
    }

//    public void insert(int value) {
//        if (root == null) {
//            root = new Node(value);
//            return;
//        }
//
//        Node currentNode = root;
//        while (true) {
//            if (value == currentNode.value) {
//                return; // Value already exists in the tree
//            } else if (value > currentNode.value) {
//                if (currentNode.right == null) {
//                    currentNode.right = new Node(value);
//                    return;
//                }
//                currentNode = currentNode.right;
//            } else {
//                if (currentNode.left == null) {
//                    currentNode.left = new Node(value);
//                    return;
//                }
//                currentNode = currentNode.left;
//            }
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
//
//        Stack<Node> stack = new Stack<>();
//        Node currentNode = root;
//
//        while (currentNode != null || !stack.isEmpty()) {
//            while (currentNode != null) {
//                stack.push(currentNode);
//                currentNode = currentNode.left;
//            }
//            currentNode = stack.pop();
//            System.out.println(currentNode.value);
//            currentNode = currentNode.right;
//        }
//    }

    public boolean contains(int value) {
        return contains(root, value);
    }

    private boolean contains(final Node root, final int value) {
        if (root == null) return false;
        if (root.value == value) return true;
        if (value > root.value) return contains(root.right, value);
        else return contains(root.left, value);
    }

//    public boolean contains(int value) {
//        Node currentNode = root;
//        while (currentNode != null) {
//            if (value == currentNode.value) {
//                return true;
//            } else if (value > currentNode.value) {
//                currentNode = currentNode.right;
//            } else {
//                currentNode = currentNode.left;
//            }
//        }
//        return false;
//    }

    public int minValue(Node currentNode) {
        while (currentNode.left != null) {
            currentNode = currentNode.left;
        }
        return currentNode.value;
    }

    public void deleteNode(int value) {
        root = deleteNode(root, value);
    }

    private Node deleteNode(final Node root, final int value) {
        if (root == null) return null;
        if (value < root.value) {
            return root.left = deleteNode(root.left, value);
        } else if (value > root.value) {
            root.right = deleteNode(root.right, value);
        } else {
            if ((root.left == null) && (root.right == null)) {
                return null;
            } else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                int minValue = minValue(root.right);
                root.value = minValue;
                root.right = deleteNode(root.right, minValue);
                return root;
            }

        }
        return root;
    }

//    public void deleteNode(int value) {
//        Node parent = null;
//        Node currentNode = root;
//
//        while (currentNode != null && currentNode.value != value) {
//            parent = currentNode;
//            if (value < currentNode.value) {
//                currentNode = currentNode.left;
//            } else {
//                currentNode = currentNode.right;
//            }
//        }
//
//        if (currentNode == null) {
//            return; // Node to be deleted not found
//        }
//
//        if (currentNode.left == null && currentNode.right == null) { // Node has no children
//            if (currentNode != root) {
//                if (parent.left == currentNode) {
//                    parent.left = null;
//                } else {
//                    parent.right = null;
//                }
//            } else {
//                root = null;
//            }
//        } else if (currentNode.left == null) { // Node has only right child
//            if (currentNode != root) {
//                if (parent.left == currentNode) {
//                    parent.left = currentNode.right;
//                } else {
//                    parent.right = currentNode.right;
//                }
//            } else {
//                root = currentNode.right;
//            }
//        } else if (currentNode.right == null) { // Node has only left child
//            if (currentNode != root) {
//                if (parent.left == currentNode) {
//                    parent.left = currentNode.left;
//                } else {
//                    parent.right = currentNode.left;
//                }
//            } else {
//                root = currentNode.left;
//            }
//        } else { // Node has two children
//            Node successor = getMinValueNode(currentNode.right);
//            int minValue = successor.value;
//            deleteNode(minValue); // Delete the successor
//            currentNode.value = minValue; // Replace value
//        }
//    }

//    private Node getMinValueNode(Node node) {
//        while (node.left != null) {
//            node = node.left;
//        }
//        return node;
//    }
}


