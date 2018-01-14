package clases;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Before;

public class C31Test {
    @Before
    public void Before() {
        new C31();
    }

    @Test
    public void testM1() {
        assertEquals("m1", C31.m1());
    }

    @Test
    public void testM2() {
        assertEquals("m2", C31.m2());
    }

}
