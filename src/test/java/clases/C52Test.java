package clases;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Before;

public class C52Test {
    @Before
    public void Before() {
        new C52();
    }

    @Test
    public void testMA() {
        assertEquals("mA", C52.mA());
    }
}
