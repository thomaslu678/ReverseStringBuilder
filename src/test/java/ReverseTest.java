package test.java;

import main.java.ReverseTester;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReverseTest {

    @Test
    public void testReverse() {

        ReverseTester myReverseTester = new ReverseTester();

        // Expected output: 321
        assertEquals("abc", myReverseTester.reverse("cba"));

    }

}