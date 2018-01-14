package clases;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Before;

public class C32Test {
    
    @Before
    public void Before() {
        new C32();
    }

    @Test
    public void testMA() {
        assertEquals("mA", C32.mA());
    }

}
