package clases;

import org.junit.Test;

import clases.C11;

import static org.junit.Assert.*;

import org.junit.Before;;

public class C11Test {

    @Before
    public void Before() {
        new C11();
    }

    @Test
    public void M1() {
        assertEquals("m1", C11.m1());
    }

    @Test
    public void M2() {
        assertEquals("m2", C11.m2());
    }

}
