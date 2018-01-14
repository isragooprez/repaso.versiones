package clases;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Before;

public class C51Test {

    @Before
    public void Before() {
        new C51();
    }

    @Test
    public void testM1() {
        assertEquals("m1", C51.m1());
    }

    @Test
    public void testM2() {
        assertEquals("m2", C51.m2());
    }

}
