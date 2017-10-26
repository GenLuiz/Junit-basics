package junit.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class StringHelperParametrizedTest {

    private StringHelper helper = new StringHelper();
    private String input;
    private String expectedOutput;

    public StringHelperParametrizedTest(String input, String expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    // AACD => CD, ACD => CD, CDEF => CDEF, CDAA => CDAA
    @Parameterized.Parameters
    public static Collection<String[]> testConditions(){
        String expectedOutputs[][]= {
                {"AACD","CD"},
                {"ACD","CD"},
                {"CDEF","CDEF"},
                {"CDAA","CDAA"}
        };
        return Arrays.asList(expectedOutputs);
    }

    @Test
    public void testTruncateAInFirst2Positions(){
        assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));
    }

}
