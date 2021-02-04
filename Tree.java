
public class Tree {
    private TreeNode root;

    public Tree() {
        root = null;
    }

    public Tree(TreeNode root) {
        this.root = root;
    }

    public void insertNode(int insertValue) {
        if (root == null)
            root = new TreeNode(insertValue);
        else
            root.insert(insertValue);
    }

    public TreeNode search(Tree a, int searchValue) {
        return root.searchNode2(a.root, searchValue);
    }

    public void preorderTraversal() {
        preorder(root);
    }

    public void inorderTraversal() {
        inorder(root);
    }

    public void postorderTraversal() {
        postorder(root);
    }

    private void preorder(TreeNode node) {
        if (node == null)
            return;
        System.out.print(node.data + " ");
        preorder(node.leftNode);
        preorder(node.rightNode);
    }

    private void inorder(TreeNode node) {
        if (node == null)
            return;
        inorder(node.leftNode);
        System.out.print(node.data + " ");
        inorder(node.rightNode);
    }

    private void postorder(TreeNode node) {
        if (node == null)
            return;
        postorder(node.leftNode);
        postorder(node.rightNode);
        System.out.print(node.data + " ");
    }

}
