// Name: Monisha Jain
// Qualificatin: MCA


import java.util.*;

public class allPathsSum {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<List<Integer>> findPaths(TreeNode root, int sum) {
        List<List<Integer>> allPaths = new ArrayList<>();
        List<Integer> currentPath = new ArrayList<>();

        findRecrusive(root, sum, allPaths, currentPath);
        return allPaths;
    }

    private static void findRecrusive(TreeNode currentNode, int sum, List<List<Integer>> allPaths, List<Integer> currentPath) {
        
        if(currentNode == null) {
            return;
        }

        currentPath.add(currentNode.val);

        if(currentNode.val == sum && currentNode.left == null && currentNode.right == null) {
            allPaths.add(new ArrayList<Integer>(currentPath));
        } else {
            // traverse left sub tree
            findRecrusive(currentNode.left, sum - currentNode.val, allPaths, currentPath);

            // traverse right sub tree

            findRecrusive(currentNode.right, sum - currentNode.val, allPaths, currentPath);
        }

        currentPath.remove(currentPath.size() - 1);
    }

    
    public static void main(String[] args) {
        allPathsSum sol = new allPathsSum();
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);
        int sum = 23;
        List<List<Integer>> result = sol.findPaths(root, sum);
        System.out.println("Tree paths with sum " + sum + ": " + result);
      }
}
