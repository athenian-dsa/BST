import org.junit.jupiter.api.Test;
import java.util.LinkedList;

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
        integerBST.recursiveInsert(4);
        integerBST.recursiveInsert(7);
        integerBST.recursiveInsert(3);
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

    @Test
    public void testBSTSetBasics() {
        BSTSet set1 = new BSTSet();
        set1.setInsert(1);
        set1.setInsert(2);
        set1.setInsert(3);
        set1.setInsert(4);
        set1.setInsert(5);

        LinkedList<Integer> expected = new LinkedList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        assertEquals(expected, set1.inOrderList());

        assertTrue(set1.setSearch(4));
        assertFalse(set1.setSearch(6));

        set1.setRemove(3);
        expected.remove(Integer.valueOf(3));
        assertEquals(expected, set1.inOrderList());
    }

    @Test
    public void testBSTSetUnion() {
        BSTSet set1 = new BSTSet();
        set1.setInsert(1);
        set1.setInsert(2);
        set1.setInsert(4);
        set1.setInsert(5);

        BSTSet set2 = new BSTSet();
        set2.setInsert(4);
        set2.setInsert(5);
        set2.setInsert(6);
        set2.setInsert(7);
        set2.setInsert(8);

        set1.setUnion(set2);

        LinkedList<Integer> expected = new LinkedList<>();
        expected.add(1);
        expected.add(2);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(7);
        expected.add(8);
        assertEquals(expected, set1.inOrderList());
    }

    @Test
    public void testBSTSetDifference() {
        BSTSet set1 = new BSTSet();
        set1.setInsert(1);
        set1.setInsert(2);
        set1.setInsert(4);
        set1.setInsert(5);

        BSTSet set2 = new BSTSet();
        set2.setInsert(4);
        set2.setInsert(5);
        set2.setInsert(6);
        set2.setInsert(7);
        set2.setInsert(8);

        set1.setUnion(set2);
        set1.setDifference(set2);

        LinkedList<Integer> expected = new LinkedList<>();
        expected.add(1);
        expected.add(2);
        assertEquals(expected, set1.inOrderList());
    }

    @Test
    public void testBSTSetIntersection() {
        BSTSet set1 = new BSTSet();
        set1.setInsert(1);
        set1.setInsert(2);
        set1.setInsert(4);
        set1.setInsert(5);

        BSTSet set2 = new BSTSet();
        set2.setInsert(4);
        set2.setInsert(5);
        set2.setInsert(6);
        set2.setInsert(7);
        set2.setInsert(8);

        set1.setIntersection(set2);

        LinkedList<Integer> expected = new LinkedList<>();
        expected.add(4);
        expected.add(5);
        assertEquals(expected, set1.inOrderList());
    }

    @Test
    public void testBSTDictionaryInsert() {
        BSTDictionary dict = new BSTDictionary();
        dict.dictionaryInsert(3, "Apple");
        dict.dictionaryInsert(2, "Orange");
        dict.dictionaryInsert(4, "Banana");
        dict.dictionaryInsert(11, "Fig");
        dict.dictionaryInsert(13, "Dragonfruit");
        dict.dictionaryInsert(1, "Pineapple");
        dict.dictionaryInsert(24, "Lemon");
        dict.dictionaryInsert(21, "Lime");

        String expected = "INDEX | DATA\n" +
                "------------\n" +
                "    1 | Pineapple\n" +
                "    2 | Orange\n" +
                "    3 | Apple\n" +
                "    4 | Banana\n" +
                "   11 | Fig\n" +
                "   13 | Dragonfruit\n" +
                "   21 | Lime\n" +
                "   24 | Lemon\n";

        assertEquals(expected, dict.toString());
    }

    @Test
    public void testBSTDictionaryContainsKey() {
        BSTDictionary dict = new BSTDictionary();
        dict.dictionaryInsert(3, "Apple");
        dict.dictionaryInsert(11, "Fig");
        dict.dictionaryInsert(24, "Lemon");

        assertTrue(dict.dictionaryContainsKey(3));
        assertTrue(dict.dictionaryContainsKey(11));
        assertTrue(dict.dictionaryContainsKey(24));
        assertFalse(dict.dictionaryContainsKey(0));
        assertFalse(dict.dictionaryContainsKey(5));
        assertFalse(dict.dictionaryContainsKey(18));
    }

    @Test
    public void testBSTDictionaryGet() {
        BSTDictionary dict = new BSTDictionary();
        dict.dictionaryInsert(3, "Apple");
        dict.dictionaryInsert(11, "Fig");
        dict.dictionaryInsert(24, "Lemon");

        assertEquals("Apple", dict.dictionaryGet(3));
        assertEquals("Fig", dict.dictionaryGet(11));
        assertEquals("Lemon", dict.dictionaryGet(24));
        assertNull(dict.dictionaryGet(0));
        assertNull(dict.dictionaryGet(5));
        assertNull(dict.dictionaryGet(18));
    }

    @Test
    public void testBSTDictionaryRemove() {
        BSTDictionary dict = new BSTDictionary();
        dict.dictionaryInsert(3, "Apple");
        dict.dictionaryInsert(2, "Orange");
        dict.dictionaryInsert(4, "Banana");
        dict.dictionaryInsert(11, "Fig");
        dict.dictionaryInsert(13, "Dragonfruit");
        dict.dictionaryInsert(1, "Pineapple");
        dict.dictionaryInsert(24, "Lemon");
        dict.dictionaryInsert(21, "Lime");

        dict.dictionaryRemove(3);
        dict.dictionaryRemove(11);
        dict.dictionaryRemove(24);

        String expected = "INDEX | DATA\n" +
                "------------\n" +
                "    1 | Pineapple\n" +
                "    2 | Orange\n" +
                "    4 | Banana\n" +
                "   13 | Dragonfruit\n" +
                "   21 | Lime\n";

        assertEquals(expected, dict.toString());
    }
}