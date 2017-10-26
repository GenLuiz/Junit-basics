package junit.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class StringHelperParametrizedBooleanTest {

    private StringHelper helper = new StringHelper();
    private String input;
    private boolean expectedOutput;

    public StringHelperParametrizedBooleanTest(String input, boolean expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    // ABCD => false, ABAB => true, AB => true, A => false
    @Parameterized.Parameters
    public static Collection<Object[]> testConditions(){
        Object expectedOutputs[][] = {
                {"ABCD", false},
                {"ABAB", true},
                {"AB", true},
                {"A", false}
        };
        return Arrays.asList(expectedOutputs);
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame(){
        assertEquals(expectedOutput, helper.areFirstAndLastTwoCharactersTheSame(input));
    }
}
