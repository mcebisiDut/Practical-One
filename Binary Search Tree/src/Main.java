class Main {
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<Integer>();
 
        tree.push(6);
        tree.push(4);
        tree.push(8);
        tree.push(3);
        tree.push(5);
        tree.push(7);
        tree.push(9);
        tree.push(1);
        tree.pop(1);
        System.out.println("-----------------------------------------");
        boolean contains = tree.search(7);
        System.out.println(contains);
        System.out.println("-----------------------------------------");
        contains = tree.search(10);
        System.out.println(contains);
        System.out.println("-----------------------------------------");
        tree.inOrder(tree.root);
        System.out.println();
        System.out.println("-----------------------------------------");
        tree.preOrder(tree.root);
        System.out.println();
        System.out.println("-----------------------------------------");
        tree.postOrder(tree.root);
    }
}