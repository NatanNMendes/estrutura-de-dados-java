package dataStructure.exercises.tree;

import dataStructure.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//Dada uma árvore binária, encontre o maior valor em cada nível
public class LargestTreeValues {
    public static List<Integer> largestValues(Tree tree) {
        var list = new ArrayList<Integer>();
        solveTree(tree.root, 0, list);
        return list;
    }

    private static void solveTree(Tree.Node node, int level, ArrayList<Integer> list) {
        if (node == null) return;

        if (level == list.size()) {
            list.add(node.value);
        } else {
            list.set(level, Math.max(list.get(level), node.value));
        }

        solveTree(node.left, level+1, list);
        solveTree(node.right, level+1, list);

    }

//    public static List<Integer> largestValues(Tree tree) {
//        var list = new ArrayList<Integer>();
//        if (tree.root == null) return list;
//
//        Queue<Tree.Node> queue = new LinkedList<>();
//        queue.add(tree.root);
//
//        while (!queue.isEmpty()) {
//            int levelSize = queue.size();
//            int maxVal = Integer.MIN_VALUE;
//
//            for (int i = 0; i < levelSize; i++) {
//                Tree.Node node = queue.poll();
//                maxVal = Math.max(maxVal, node.value);
//
//                if (node.left != null) queue.add(node.left);
//                if (node.right != null) queue.add(node.right);
//            }
//
//            list.add(maxVal);
//        }
//
//        return list;
//    }


    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(100);
        tree.insert(10);
        tree.insert(5);
        tree.insert(6);
        tree.insert(1);
        tree.insert(7);
        tree.insert(5);

        System.out.println(largestValues(tree));
    }

}
