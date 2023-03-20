package Tests;
import MergeSort.MergeSort;
import org.junit.Test;

import java.util.Vector;

import static org.junit.jupiter.api.Assertions.*;

public class MergeSortTest {

    @Test
    public void testMergeSort() {
        Vector<Integer> v = new Vector<>();
        Vector<Integer> w = new Vector<>();
        for(int i = 0; i < 10; i++){
            v.add(2*i);
        }
        for(int i = 0; i < 10; i++){
            w.add(2*i + 1);
        }
        Vector<Integer> expected = new Vector<>();
        for(int i = 0; i < 20; i++){
            expected.add(i);
        }
        Vector<Integer> actual = MergeSort.mergeSort(v, w);
        assertEquals(expected, actual);
    }

    //Unit test to check with empty vectors
    @Test
    public void testMergeSortEmpty() {
        Vector<Integer> v = new Vector<>();
        Vector<Integer> w = new Vector<>();
        Vector<Integer> expected = new Vector<>();
        Vector<Integer> actual = MergeSort.mergeSort(v, w);
        assertEquals(expected, actual);
    }

    //Unit test to check with vectors of size 1
    @Test
    public void testMergeSortSize1() {
        Vector<Integer> v = new Vector<>();
        Vector<Integer> w = new Vector<>();
        v.add(1);
        w.add(2);
        Vector<Integer> expected = new Vector<>();
        expected.add(1);
        expected.add(2);
        Vector<Integer> actual = MergeSort.mergeSort(v, w);
        assertEquals(expected, actual);
    }

    //Unit test to check with vectors of size 2
    @Test
    public void testMergeSortSize2() {
        Vector<Integer> v = new Vector<>();
        Vector<Integer> w = new Vector<>();
        v.add(1);
        v.add(2);
        w.add(3);
        w.add(4);
        Vector<Integer> expected = new Vector<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        Vector<Integer> actual = MergeSort.mergeSort(v, w);
        assertEquals(expected, actual);
    }

    //Unit test to check with vectors of different sizes
    @Test
    public void testMergeSortDiffSize() {
        Vector<Integer> v = new Vector<>();
        Vector<Integer> w = new Vector<>();
        v.add(1);
        v.add(2);
        v.add(3);
        w.add(4);
        w.add(5);
        Vector<Integer> expected = new Vector<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        Vector<Integer> actual = MergeSort.mergeSort(v, w);
        assertEquals(expected, actual);
    }

    //Unit test to check with repeated values
    @Test
    public void testMergeSortRepeated() {
        Vector<Integer> v = new Vector<>();
        Vector<Integer> w = new Vector<>();
        v.add(1);
        v.add(2);
        v.add(3);
        w.add(1);
        w.add(2);
        w.add(3);
        Vector<Integer> expected = new Vector<>();
        expected.add(1);
        expected.add(1);
        expected.add(2);
        expected.add(2);
        expected.add(3);
        expected.add(3);
        Vector<Integer> actual = MergeSort.mergeSort(v, w);
        assertEquals(expected, actual);
    }

    //Test with a list of size n where n is odd
    @Test
    public void testMergeSortOdd() {
        Vector<Integer> v = new Vector<>();
        Vector<Integer> w = new Vector<>();
        for(int i = 0; i < 5; i++){
            v.add(2*i);
        }
        for(int i = 0; i < 5; i++){
            w.add(2*i + 1);
        }
        Vector<Integer> expected = new Vector<>();
        for(int i = 0; i < 10; i++){
            expected.add(i);
        }
        Vector<Integer> actual = MergeSort.mergeSort(v, w);
        assertEquals(expected, actual);
    }

    //Test with a list of size n where n is even
    @Test
    public void testMergeSortEven() {
        Vector<Integer> v = new Vector<>();
        Vector<Integer> w = new Vector<>();
        for(int i = 0; i < 10; i++){
            v.add(2*i);
        }
        for(int i = 0; i < 10; i++){
            w.add(2*i + 1);
        }
        Vector<Integer> expected = new Vector<>();
        for(int i = 0; i < 20; i++){
            expected.add(i);
        }
        Vector<Integer> actual = MergeSort.mergeSort(v, w);
        assertEquals(expected, actual);
    }

    //Test with a list that is already sorted
    @Test
    public void testMergeSortSorted() {
        Vector<Integer> v = new Vector<>();
        Vector<Integer> w = new Vector<>();
        for(int i = 0; i < 10; i++){
            v.add(i);
        }
        for(int i = 10; i < 20; i++){
            w.add(i);
        }
        Vector<Integer> expected = new Vector<>();
        for(int i = 0; i < 20; i++){
            expected.add(i);
        }
        Vector<Integer> actual = MergeSort.mergeSort(v, w);
        assertEquals(expected, actual);
    }

    //Test with a list that is sorted in reverse order
    @Test
    public void testMergeSortReverse() {
        Vector<Integer> v = new Vector<>();
        Vector<Integer> w = new Vector<>();
        for(int i = 9; i >= 0; i--){
            v.add(i);
        }
        for(int i = 19; i >= 10; i--){
            w.add(i);
        }
        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class,
                () -> MergeSort.mergeSort(v, w),
                "Expected IllegalArgumentException, but it didn't throw one"
        );
    }

    //Test with a list where all elements are the same
    @Test
    public void testMergeSortSame() {
        Vector<Integer> v = new Vector<>();
        Vector<Integer> w = new Vector<>();
        for(int i = 0; i < 10; i++){
            v.add(1);
        }
        for(int i = 0; i < 10; i++){
            w.add(1);
        }
        Vector<Integer> expected = new Vector<>();
        for(int i = 0; i < 20; i++){
            expected.add(1);
        }
        Vector<Integer> actual = MergeSort.mergeSort(v, w);
        assertEquals(expected, actual);
    }

}
