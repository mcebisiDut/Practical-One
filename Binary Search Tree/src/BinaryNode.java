public class BinaryNode<T> {
    T value;
    BinaryNode<T> left;
    BinaryNode<T> right;
 
    BinaryNode (T value) {
        this.value = value;
        right = null;
        left = null;
    }
}