
package clases;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Before;

public class C21Test {
    @Before
    public void Before() {
        new C21();
    }

    @Test
    public void testM1() {
        assertEquals("m1", C21.m1());
    }

    @Test
    public void testM2() {
        assertEquals("m2", C21.m2());
    }

    @Test
    public void testM3() {
        assertEquals("m3", C21.m3());
    }

}
