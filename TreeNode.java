
public class TreeNode {
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
