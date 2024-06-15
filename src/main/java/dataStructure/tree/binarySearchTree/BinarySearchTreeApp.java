package dataStructure.tree.binarySearchTree;

public class BinarySearchTreeApp {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(37);
        tree.insert(66);
        tree.insert(42);
        tree.insert(11);
        tree.insert(72);
        tree.insert(8);
        tree.insert(17);

        tree.deleteNode(66);
        tree.inOrder();
//        System.out.println(tree.contains(11));
//        System.out.println(tree.contains(99));

//        tree.inOrder();
//        tree.insert(2);
//        tree.insert(1);
//        tree.insert(3);


    }
}
