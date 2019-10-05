public class BinaryTree<T> {
    BinaryNode<T> root;

    public void push(T value) {
        root = add(value, root);
    }

    public boolean search(T value) {
        return contains(value, root);
    }

    public void pop(T value) {
        root = remove(value, root);
    }

    public void inOrder(BinaryNode<T> node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.printf("%s ", node.value);
        inOrder(node.right);
    }

    public void preOrder(BinaryNode<T> node){
        if(node == null){
            return;
        }
        System.out.printf("%s ", node.value);
        preOrder(node.left);
        preOrder(node.right);
    }

    public void postOrder(BinaryNode<T> node){
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.printf("%s ", node.value);
    }
    
    private BinaryNode<T> add(T value, BinaryNode<T> parent) {
        if (isEmpty(parent)) {
            return new BinaryNode<T>(value);
        }

        if (isSmall(value, parent)) {
            parent.left = add(value, parent.left);
        } else if ((Integer) value > ((Integer) parent.value)) {
            parent.right = add(value, parent.right);
        }

        return parent;
    }

    private BinaryNode<T> remove(T value, BinaryNode<T> parent) {
        if (isFound(value, parent)) {
            if (noChildreen(parent)) {
                return null;
            }

            if (noRightChild(parent)) {
                return parent.left;
            }

            if (noLeftChild(parent)) {
                return parent.right;
            }

            T smallestValue = getSmallestValue(parent.right);
            parent.value = smallestValue;
            parent.right = remove(smallestValue, parent.right);

            return parent;
        }
        
        if (isSmall(value, parent)) {
            parent.left = remove(value, parent.left);
            return parent;
        }else{
            parent.right = remove(value, parent.right);
        }

        return parent;
    }

    private boolean noChildreen(BinaryNode<T> parent) {
        return (noLeftChild(parent) && noRightChild(parent));
    }

    private boolean noRightChild(BinaryNode<T> parent) {
        return (parent.right == null);
    }

    private boolean noLeftChild(BinaryNode<T> parent) {
        return (parent.left == null);
    }

    private T getSmallestValue(BinaryNode<T> parent) {
        return noLeftChild(parent) ? 
                                parent.value : 
                                getSmallestValue(parent.left);
    }

    private boolean contains(T value, BinaryNode<T> parent) {
        if (isEmpty(parent)) {
            return false;
        }

        if (isFound(value, parent)) {
            return true;
        }

        return isSmall(value, parent) ? 
                                contains(value, parent.left) :
                                contains(value, parent.right);
    }

    private boolean isSmall(T value, BinaryNode<T> parent) {
        return ((Integer) value < (Integer) parent.value);
    }

    private boolean isFound(T value, BinaryNode<T> parent) {
        return (value == (Integer) parent.value);
    }

    private boolean isEmpty(BinaryNode<T> parent) {
        return (parent == null);
    }
}