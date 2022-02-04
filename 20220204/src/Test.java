import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * User: 12629
 * Date: 2022/1/17
 * Time: 8:28
 * Description:
 */
public class Test {

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        TreeNode root = binaryTree.createTree();
        binaryTree.preOrder(root);
        System.out.println();
        binaryTree.inOrder(root);
        System.out.println();
        binaryTree.postOrder(root);
        System.out.println();
        System.out.println(binaryTree.size1(root));
        System.out.println(binaryTree.size(root));
        System.out.println("=========叶子节点的个数===========");
        binaryTree.getLeafNodeCount(root);
        System.out.println(BinaryTree.leafCount);
        System.out.println("============叶子节点个数===========");
        System.out.println(binaryTree.getKLevelNodeCount(root,3));
        System.out.println("==============树的高度======");
        System.out.println(binaryTree.getHeight(root));
        System.out.println("=====查找节点=======");
        try {
            TreeNode ret = binaryTree.find(root,'E');
            System.out.println(ret.val);
        }catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("没有这个节点！");
        }
        System.out.println("============是否是完全二叉树==============");
        System.out.println(binaryTree.isCompleteTree(root));

        System.out.println("=============层序遍历的结果===========");
        binaryTree.levelOrder(root);

       /* Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(null);
        queue.offer(null);
        queue.offer(null);
        queue.offer(null);
        System.out.println(queue.size());*/
    }
}
