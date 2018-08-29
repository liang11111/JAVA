package NiuKe;

/**题目：
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 */


public class P148_HasSubtree {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        //如果roo2为空，返回false;如果root1为空，root2肯定不是root1的子树
        if (root2 == null || root1 == null) {
            return false;
        }
        boolean result =false;

        //如果root1和root2的值相等，接着判断左子树和右子树是否相等
        if (root1.val == root2.val) {
            result = DoseHasSubtree(root1,root2);
        }

        //如果root1和root2不相等，判断root1.left和root2是否相等
        if (!result) {
            result = DoseHasSubtree(root1.left, root2);
        }

        //如果root1.left和root2不相等，判断root1.right和root2是否相等
        if (!result) {
            result = DoseHasSubtree(root1.right, root2);
        }
        return result;
    }

    public boolean DoseHasSubtree(TreeNode root1,TreeNode root2) {
        if(root2==null){
            return true;
        }
        if (root1 == null) {
            return false;
        }
        if (root1.val != root2.val) {
            return false;
        }
        return DoseHasSubtree(root1.left, root2.left) && DoseHasSubtree(root1.right, root2.right);
    }

    public static void main(String[] args){
        TreeNode root1=new TreeNode(8);

        TreeNode node1 = new TreeNode(8);
        root1.left = node1;

        TreeNode node2 = new TreeNode(7);
        root1.right = node2;

        TreeNode node3 = new TreeNode(9);
        node1.left = node3; // 不能写成node3 = node1.left;

        TreeNode node4 = new TreeNode(2);
        node1.right = node4;

        TreeNode node5 = new TreeNode(4);
        node4.left = node5;

        TreeNode node6 = new TreeNode(7);
        node4.right = node6;

        TreeNode root2 = new TreeNode(8);

        TreeNode node7 = new TreeNode(9);
        root2.left = node7;

        TreeNode node8 = new TreeNode(3);
        root2.right = node8;

        boolean result;

        P148_HasSubtree test = new P148_HasSubtree();
        result = test.HasSubtree(root1, root2);

        System.out.println(result);
    }
}
