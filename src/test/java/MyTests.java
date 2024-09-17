import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyTests {
    @Test
    public void testInsert() {
        BST integerBST = new BST();
        integerBST.insert(4);
        integerBST.insert(7);
        integerBST.insert(3);
        integerBST.insert(8);

        assertEquals(4, integerBST.root.data);
        assertEquals(3, integerBST.root.left.data);
        assertEquals(7, integerBST.root.right.data);
        assertEquals(8, integerBST.root.right.right.data);
    }

    @Test
    public void testInsertRec() {
        BST integerBST = new BST();
        integerBST.insert(4);
        integerBST.insert(7);
        integerBST.insert(3);
        integerBST.insert(8);

        assertEquals(4, integerBST.root.data);
        assertEquals(3, integerBST.root.left.data);
        assertEquals(7, integerBST.root.right.data);
        assertEquals(8, integerBST.root.right.right.data);
    }

    @Test
    public void testDeleteRecLeaf() {
        BST integerBST = new BST();
        integerBST.insert(4);
        integerBST.insert(7);
        integerBST.insert(3);
        integerBST.insert(8);
        integerBST.insert(9);

        integerBST.recursiveDelete(9);

        assertEquals(4, integerBST.root.data);
        assertEquals(3, integerBST.root.left.data);
        assertEquals(7, integerBST.root.right.data);
        assertEquals(8, integerBST.root.right.right.data);
    }

    @Test
    public void testDeleteRecOneChild() {
        BST integerBST = new BST();
        integerBST.insert(4);
        integerBST.insert(7);
        integerBST.insert(3);
        integerBST.insert(8);
        integerBST.insert(9);

        integerBST.recursiveDelete(8);

        assertEquals(4, integerBST.root.data);
        assertEquals(3, integerBST.root.left.data);
        assertEquals(7, integerBST.root.right.data);
        assertEquals(9, integerBST.root.right.right.data);
    }

    @Test
    public void testDeleteRecTwoChildren() {
        BST integerBST = new BST();
        integerBST.insert(4);
        integerBST.insert(7);
        integerBST.insert(3);
        integerBST.insert(9);
        integerBST.insert(6);

        integerBST.recursiveDelete(7);

        assertEquals(4, integerBST.root.data);
        assertEquals(3, integerBST.root.left.data);
        assertEquals(9, integerBST.root.right.data);
        assertEquals(6, integerBST.root.right.left.data);
    }
}