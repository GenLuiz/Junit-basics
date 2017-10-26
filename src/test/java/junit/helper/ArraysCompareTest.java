package junit.helper;

import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.assertArrayEquals;

public class ArraysCompareTest {

    //Arrays.sort
    @Test
    public void testArraySort_RandomArray(){
        int[] numbers = {10,3,5,8,1};
        int[] expected = {1,3,5,8,10};
        Arrays.sort(numbers);

        assertArrayEquals(expected,numbers);
    }

    @Test(expected = NullPointerException.class)
    public void testArraySort_NullArray(){
        int[] numbers = null;
        Arrays.sort(numbers);
    }

    @Test(timeout = 100)
    public void testSort_Performance(){
        int array[] = {12,3,2};
        for(int i = 1; i<=1000000; i++){
            array[0] = i;
            Arrays.sort(array);
        }
    }
}
