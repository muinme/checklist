
public class TreeTest {
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
