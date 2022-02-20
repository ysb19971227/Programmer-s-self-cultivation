import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: 12629
 * Date: 2022/2/19
 * Time: 16:37
 * Description:
 */
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node(int val) {
        this.val = val;
    }
}

public class BinarySearchTree {
    public Node root = null;


    public Node search(int key) {
        Node cur = root;
        while (cur != null) {
            if(cur.val < key) {
                cur = cur.right;
            }else if(cur.val == key) {
                return cur;
            }else {
                cur = cur.left;
            }
        }
        return null;//代表没有这个数据
    }

    public boolean insert(int val) {
        if(root == null) {
            root = new Node(val);
            return true;
        }

        Node cur = root;
        Node parent = null;
        while (cur != null) {
            if(cur.val < val) {
                parent = cur;
                cur = cur.right;
            }else if(cur.val == val) {
                return false;//不能有相同的数据
            }else {
                parent = cur;
                cur = cur.left;
            }
        }
        Node node = new Node(val);
        if(parent.val < val) {
            parent.right = node;
        }else {
            parent.left = node;
        }
        return true;
    }


    public void remove(int key) {
        Node cur = root;
        Node parent = null;
        while (cur != null) {
            if(cur.val == key) {
                //这里开始删除
                removeNode(cur,parent);
                break;
            }else if(cur.val < key) {
                parent = cur;
                cur = cur.right;
            }else {
                parent = cur;
                cur = cur.left;
            }
        }
    }

    public void removeNode(Node cur,Node parent) {
        if(cur.left == null) {
            if(cur == root) {
                root = cur.right;
            }else if(cur == parent.left) {
                parent.left = cur.right;
            }else {
                parent.right = cur.right;
            }
        }else if(cur.right == null) {
            if(cur == root) {
                root = cur.left;
            }else if(cur == parent.left) {
                parent.left = cur.left;
            }else {
                parent.right = cur.left;
            }
        }else {
            Node targetParent = cur;
            Node target = cur.right;
            while (target.left != null) {
                targetParent = target;
                target = target.left;
            }
            cur.val = target.val;
            if(target == targetParent.left) {
                targetParent.left = target.right;
            }else {
                targetParent.right = target.right;
            }
        }
    }

    public void inOrder(Node root) {
        if(root == null) return;
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }



    public static void main(String[] args) {
        int[] array = {10,8,19,3,9,4,7};
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        for (int i = 0; i < array.length; i++) {
            binarySearchTree.insert(array[i]);
        }
        binarySearchTree.inOrder(binarySearchTree.root);
        System.out.println("插入重复的数据");
        System.out.println(binarySearchTree.insert(3));
        System.out.println("删除数据：");
        binarySearchTree.remove(7);
        System.out.println();
        binarySearchTree.inOrder(binarySearchTree.root);

    }
}
