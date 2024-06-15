package dataStructure.tree;

public class TreeApp {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insert(37);
        tree.insert(11);
        tree.insert(66);
        tree.insert(8);
        tree.insert(17);
        tree.insert(42);
        tree.insert(72);

        System.out.println("----------");
//        tree.preOrder();
//        tree.inOrder();
//        tree.posOrder();
        tree.BFS();
//        tree.DFS();
        System.out.println("----------");
//        tree.insert(1);
//        tree.insert(2);
//        tree.insert(3);
//        System.out.println(tree.root.value);
//        System.out.println(tree.root.left.value);
//        System.out.println(tree.root.right.value);
//
//        System.out.println(tree.root.isLeaf());
//        System.out.println(tree.root.right.isLeaf());
    }
}
