package test.java;

import main.java.ReverseTester;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReverseTest {

    @Test
    public void testReverse() {

        ReverseTester myReverseTester = new ReverseTester();

        // Test the reverse method
        assertEquals("samohT", myReverseTester.reverse("Thomas"));

    }

}