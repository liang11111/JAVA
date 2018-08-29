package NiuKe;

import java.util.ArrayList;

/**
 * 题目：从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 */
public class P171_PrintFromTopToBottom {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root){
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        ArrayList<TreeNode> temp = new ArrayList<>();
        temp.add(root);
        while (temp.size() != 0) {
            TreeNode node = temp.remove(0);

            if (node.left != null) {
                temp.add(node.left);
            }
            if (node.right != null) {
                temp.add(node.right);
            }

            result.add(node.val);
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);

        TreeNode node1 = new TreeNode(6);
        root.left = node1;

        TreeNode node2 = new TreeNode(10);
        root.right = node2;

        TreeNode node3 = new TreeNode(5);
        node1.left = node3;

        TreeNode node4 = new TreeNode(7);
        node1.right = node4;

        TreeNode node5 = new TreeNode(9);
        node2.left = node5;

        TreeNode node6 = new TreeNode(11);
        node2.right = node6;

        P171_PrintFromTopToBottom test = new P171_PrintFromTopToBottom();
        ArrayList<Integer> result = new ArrayList<>();
        result = test.PrintFromTopToBottom(root);

        System.out.println(result);
    }
}
