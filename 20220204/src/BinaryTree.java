import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: 12629
 * Date: 2022/1/17
 * Time: 9:51
 * Description: 二叉树的实现
 */
class TreeNode {
    public char val;
    public TreeNode left;//左孩子的引用
    public TreeNode right;//右孩子的引用
    public TreeNode(char val) {
        this.val = val;
    }
}
public class BinaryTree {
    //public BTNode root;//二叉树的根节点

    /**
     * 这种方式 是穷举的方式创建的
     * 但是 这样写不行 太low了。
     * @return
     */
    public TreeNode createTree() {
        TreeNode A = new TreeNode('A');
        TreeNode B = new TreeNode('B');
        TreeNode C = new TreeNode('C');
        TreeNode D = new TreeNode('D');
        TreeNode E = new TreeNode('E');
        TreeNode F = new TreeNode('F');
        TreeNode G = new TreeNode('G');
        TreeNode H = new TreeNode('H');
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        C.left = F;
        C.right = G;
        E.right = H;
        return A;
    }

    /*public static int i = 0 ;
    public static TreeNode createTree(String str) {
        TreeNode root = null;
        if(str.charAt(i) != '#') {
            root = new TreeNode(str.charAt(i));
            i++;
            root.left = createTree(str);
            root.right = createTree(str);
        }else {
            //遇到# 就是空树
            i++;
        }
        return root;
    }

    public static void inorder(TreeNode root) {
        if(root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            String str = in.nextLine();
            TreeNode root = createTree(str);
            inorder(root);
        }
    }*/
    // 前序遍历
    void preOrder(TreeNode root) {
        if(root == null) {
            return;
        }
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    //shift+f6->回车才会生效

    public List<Character> preorderTraversal(TreeNode root) {
        List<Character> retList = new ArrayList<>();
        if (root == null) {
            return retList;
        }
        retList.add(root.val);
        List<Character> leftTree = preorderTraversal(root.left);
        retList.addAll(leftTree);

        List<Character> rightTree =preorderTraversal(root.right);
        retList.addAll(rightTree);
        return retList;
    }

    // 中序遍历
    void inOrder(TreeNode root) {
        if(root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }

    /*public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> retlist = new ArrayList<>();
        if(root == null) {
            return retlist;
        }
        List<Integer> leftTree = inorderTraversal(root.left);
        retlist.addAll(leftTree);

        retlist.add(root.val);


        List<Integer> rightTree =inorderTraversal(root.right);
        retlist.addAll(rightTree);

        return retlist;
    }*/

    // 后序遍历
    void postOrder(TreeNode root) {
        if(root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+" ");
    }

    /*public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> retlist = new ArrayList<>();
        if(root == null) {
            return retlist;
        }
        List<Integer> leftTree = postorderTraversal(root.left);
        retlist.addAll(leftTree);
        List<Integer> rightTree =postorderTraversal(root.right);
        retlist.addAll(rightTree);
        retlist.add(root.val);
        return retlist;
    }*/

    //层序遍历
    public void levelOrder(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print(node.val+ " ");
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
    }

    /**
     *获取树中节点的个数
     */
    int count = 0;
    int size1(TreeNode root) {
        if(root == null) {
            return 0;
        }
        count++;
        size1(root.left);
        size1(root.right);
        return count;
    }

    /**
     * 子问题思路
     * @param root
     * @return
     */
    int size(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return size(root.left) + size(root.right) + 1;
    }

    /**
     * 获取叶子节点的个数
     * 遍历思路：
      */
    static int leafCount = 0;
    void getLeafNodeCount(TreeNode root) {
        if(root == null) {
            return;
        }
        if(root.left == null && root.right == null) {
            leafCount ++;
        }
        getLeafNodeCount(root.left);
        getLeafNodeCount(root.right);
    }

    /**
     * 获取叶子节点的个数
     * 子问题思路
     * @param root
     * @return
     */
    int getLeafNodeCount2(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return getLeafNodeCount2(root.left) + getLeafNodeCount2(root.right);
    }

    /**
     * 获取第K层节点的个数
     * 子问题思路：
     *
     */
    int getKLevelNodeCount(TreeNode root,int k) {
        if (root == null || k == 0) {
            return 0;
        }
        if (k == 1) {
            return 1;
        }
        return getKLevelNodeCount(root.left,k-1) + getKLevelNodeCount(root.right,k-1);
    }

    /**
     * 获取二叉树的高度
     * 时间复杂度：O(n)
     * 空间复杂度：O(log(n))
     */
    int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(getHeight(root.left),getHeight(root.right))+1;
    }

    /**
     * 检测值为value的元素是否存在
     */
    TreeNode find(TreeNode root, char val) {
        if(root == null) return null;
        if(root.val == val) return root;

        TreeNode ret = find(root.left,val);
        if(ret != null) {
            return ret;
        }
        ret = find(root.right,val);
        if(ret != null) {
            return ret;
        }
        return null;
    }

    /**
     * 是不是完全二叉树
     * @param root
     * @return
     */
    boolean isCompleteTree(TreeNode root) {
        if (root == null) return true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node != null) {
                queue.offer(node.left);
                queue.offer(node.right);
            }else {
                break;
            }
        }

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node != null) {
                return false;
            }
        }
        return true;
    }

    //LeetCode617  合并两个二叉树
    class Solution {
        public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
            if (root1 == null) {
                return root2;
            }
            if (root2 == null) {
               return root1;
            }
            root1.val += root2.val;
            root1.left = mergeTrees(root1.left,root2.left);
            root1.right = mergeTrees(root1.right,root2.right);
            return root1;
        }
    }



}



