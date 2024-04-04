
public class tree {
	int countNodes(TNode root) {
        if (root == null) {
            return 0;
        }

        int leftCount = countNodes(root.left);
        int rightCount = countNodes(root.right);

        return 1 + leftCount + rightCount;
    }

    int countNodes() {
        return countNodes(root);
    }

    int sumNodes(TNode root) {      
        if (root == null) {
            return 0;
        }       
        int leftSum = sumNodes(root.left);
        int rightSum = sumNodes(root.right);
        return root.data + leftSum + rightSum;
    }   
    int sumNodes() {
        return sumNodes(root);
    }

}
