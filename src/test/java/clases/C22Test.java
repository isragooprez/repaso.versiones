package clases;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Before;;

public class C22Test {
    
    @Before
    public void Before() {
        new C22();
    }
    @Test
    public void testMA() {
        assertEquals("mA",C22.mA());
    }

}
