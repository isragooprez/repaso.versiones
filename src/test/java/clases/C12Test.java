package clases;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C12Test {

    @Before
    public void Before() {
        new C12();
    }

    @Test
    public void MA() {
        assertEquals("mA", C12.mA());
    }
}
