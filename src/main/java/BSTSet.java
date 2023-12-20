import java.util.LinkedList;

/**
 * Name:
 * List Anyone You Collaborated With (if any):
 */

public class BSTSet {
    // The BST keeps track of its root node
    private Node root;

    // At the beginning, there are no nodes
    public BSTSet() {
        this.root = null;
    }

    // Insert an element
    public void setInsert(int value) {
        recursiveInsert(value);
    }

    // Remove an element
    public void setRemove(int value) {
        recursiveDelete(value);
    }

    // Search for element
    public boolean setSearch(int value) {
        return recursiveSearch(value);
    }

    // Returns a LinkedList containing a list of the keys in order
    public LinkedList<Integer> inOrderList() {
        LinkedList<Integer> list = new LinkedList<>();
        inOrderListRec(root, list);
        return list;
    }

    // Uses recursion to create the list for the above method
    public static void inOrderListRec(Node node, LinkedList<Integer> list) {
        // YOUR CODE HERE
        return;
    }

    // Adds a set to the current set
    public void setUnion(BSTSet other) {
        // YOUR CODE HERE
        return;
    }

    // Modifies the current set so that it only contains
    // all values the current set and other set both contain
    public void setIntersection(BSTSet other) {
        // YOUR CODE HERE
        return;
    }

    // Modifies the current set so that it only contains values
    // that the other set does not contain
    public void setDifference(BSTSet other) {
        // YOUR CODE HERE
        return;
    }

    @Override
    public String toString() {
        return "" + this.inOrderList();
    }

    // *************
    // COPY YOUR BST METHODS IN BELOW HERE (insert, search, delete, inorder, etc.)
    // *************

    public static void main(String[] args) {
        // --------------------------
        // Test 1: Set Basics
        // --------------------------
        System.out.println("-------------------");
        System.out.println("Test 1: Set Basics");
        System.out.println("Expected:");
        System.out.println("[1, 2, 3, 4, 5]\n" +
                "true\n" +
                "false\n" +
                "[1, 2, 4, 5]");

        System.out.println("\nGot:");
        BSTSet set1 = new BSTSet();
        set1.setInsert(1);
        set1.setInsert(2);
        set1.setInsert(3);
        set1.setInsert(4);
        set1.setInsert(5);
        System.out.println(set1);

        System.out.println(set1.setSearch(4));
        System.out.println(set1.setSearch(6));

        set1.setRemove(3);
        System.out.println(set1);

        // --------------------------
        // Test 2: Set Methods
        // --------------------------
        System.out.println("-------------------");
        System.out.println("Test 2: Set Methods (union, difference, intersection)");
        System.out.println("Expected:");
        System.out.println("[1, 2, 4, 5, 6, 7, 8]\n" +
                "[1, 2]\n" +
                "[1, 2, 4, 5]");


        System.out.println("\nGot:");
        BSTSet set2 = new BSTSet();
        set2.setInsert(4);
        set2.setInsert(5);
        set2.setInsert(6);
        set2.setInsert(7);
        set2.setInsert(8);

        set1.setUnion(set2);
        System.out.println(set1);

        set1.setDifference(set2);
        System.out.println(set1);

        set1.setInsert(4);
        set1.setInsert(5);
        set1.setIntersection(set2);
        System.out.println(set1);
    }
}

