package NiuKe;

/**
 * 题目：操作给定的二叉树，将其变换为源二叉树的镜像。
 */
public class P157_Mirror {
    public static void Mirror(TreeNode root){
        if (root == null) {
            return;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        Mirror(root.left);
        Mirror(root.right);


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

        P157_Mirror test = new P157_Mirror();

        test.Mirror(root);

        System.out.print(root.left.val);
    }
}
