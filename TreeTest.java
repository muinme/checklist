
public class TreeTest {
    public static class Tree {
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

    public static class TreeNode {
        int data;
        TreeNode leftNode, rightNode;
        public TreeNode( int nodeData )
        {
            data = nodeData;
            leftNode = rightNode = null;
        }
        public void insert( int value )
        { if ( value < data )
        {
            if (leftNode == null) leftNode = new TreeNode(value);
            else leftNode.insert( value );
        } else
        if ( value > data )
        {
            if ( rightNode == null ) rightNode = new TreeNode(value);
            else rightNode.insert( value );
        }
        }
        public void insert2( int value )
        {
            TreeNode treeNode = this;

            while(true) {
                if(value < treeNode.data) {
                    if(treeNode.leftNode == null) {
                        treeNode.leftNode = new TreeNode(value);
                        return;
                    }
                    else
                        treeNode = treeNode.leftNode;

                }

                else {
                    if(treeNode.rightNode == null)
                    {
                        treeNode.rightNode = new TreeNode(value);
                        return;

                    }else
                        treeNode = treeNode.rightNode;

                }

            }
        }
        public TreeNode searchNode(TreeNode treeNode, int key)
        {

            // Trường hợp gốc : nếu node null hoặc là node root
            if (treeNode==null || treeNode.data==key)
                return treeNode;

            // gia trị lớn hơn giá trị code node root
            if (treeNode.data > key)
                return searchNode(treeNode.leftNode, key);

            // giá trị bé hơn giá trị của node root
            return searchNode(treeNode.rightNode, key);
        }

        public TreeNode searchNode2(TreeNode treeNode, int key)
        {
            if (treeNode==null)return treeNode;
            while(true)
            {
                if(treeNode.data==key)
                {
                    return treeNode;
                }
                if(key < treeNode.data) {
                    if(treeNode.leftNode == null)
                    {
                        return null;
                    }
                    else
                        treeNode = treeNode.leftNode;
                }
                else {
                    if(treeNode.rightNode == null) {
                        return null;
                    }
                    else
                        treeNode = treeNode.rightNode;
                }
            }
        }
    }

    public static void main( String[] args )
    {
        Tree tree = new Tree();

        tree.insertNode(8);
        tree.insertNode(11);
        tree.insertNode(24);
        tree.insertNode(2);
        tree.insertNode(3);
        tree.insertNode(10);
        tree.insertNode(15);
        tree.insertNode(18);
        tree.insertNode(7);
        tree.insertNode(20);

        System.out.print(tree.search(tree, 20));
        System.out.println ( "\n\nPreorder traversal" );
        tree.preorderTraversal();
        System.out.println ( "\n\nInorder traversal" );
        tree.inorderTraversal();
        System.out.println ( "\n\nPostorder traversal" );
        tree.postorderTraversal();
    }


}
