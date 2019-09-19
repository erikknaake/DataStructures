package nl.knaake.erik.datastructures.trees;

/**
 * Not encapsulated with getters and setters since that will cause too much overhead (in creating stackframes)
 * when creating large trees
 * @param <T> Type of objects to store inside the tree.
 */
public class Tree<T> {
    public TreeNode<T> root;

    @Override
    public String toString() {
        return "Tree{root=" + root + "}";
    }

    public Tree() {
        root = new TreeNode<>(null);
    }

    public Tree(T rootValue) {
        root = new TreeNode<>(rootValue);
    }

    public Tree(TreeNode<T> root) {
        this.root = root;
    }
}
