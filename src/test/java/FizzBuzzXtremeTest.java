import com.google.common.collect.ImmutableMap;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by savithak on 6/19/16.
 */
public class FizzBuzzXtremeTest {

    private FizzBuzzXtreme sut;
    @Before
    public void setUp() throws Exception {
        sut = new FizzBuzzXtreme();
    }

    @Test
    public void fizzBuzz15() {
        Map<Integer, String> expected = ImmutableMap.<Integer, String>builder()
                .put(1, "")
                .put(2, "")
                .put(3, "fizz")
                .put(4, "")
                .put(5, "buzz")
                .put(6, "fizz")
                .put(7, "")
                .put(8, "")
                .put(9, "fizz")
                .put(10, "buzz")
                .put(11, "")
                .put(12, "fizz")
                .put(13, "")
                .put(14, "")
                .put(15, "fizzbuzz")
                .build();
        assertEquals(expected, sut.fizzbuzz(15));
    }

}