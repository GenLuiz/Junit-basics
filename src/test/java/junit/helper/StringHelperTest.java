package junit.helper;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringHelperTest {

    private StringHelper helper = new StringHelper();
    private String expected;
    private String actual;

    @Test
    public void testTruncateAInFirst2Positions_AInFirst2Positions(){
        // AACD => CD
        expected = "CD";
        actual = "AACD";
        assertEquals(expected, helper.truncateAInFirst2Positions(actual));
    }

    @Test
    public void testTruncateAInFirst2Positions_AInFirstPositions(){
        // ACD => CD
        expected = "CD";
        actual = "ACD";
        assertEquals(expected, helper.truncateAInFirst2Positions(actual));
    }

    @Test
    public void testTruncateAInFirst2Positions_WithOutA(){
        // CDEF => CDEF
        expected = "CDEF";
        actual = "CDEF";
        assertEquals(expected, helper.truncateAInFirst2Positions(actual));
    }

    @Test
    public void testTruncateAInFirst2Positions_AInLast2Positions(){
        // CDAA => CDAA
        expected = "CDAA";
        actual = "CDAA";
        assertEquals(expected, helper.truncateAInFirst2Positions(actual));
    }


    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_BasicNegative(){
        //ABCD => false
        assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_Negative(){
        //A => false
        assertFalse(helper.areFirstAndLastTwoCharactersTheSame("A"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_BasicPositive(){
        //ABAB => true
        assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_Positive(){
        //AB => true
        assertTrue(helper.areFirstAndLastTwoCharactersTheSame("AB"));
    }



}
