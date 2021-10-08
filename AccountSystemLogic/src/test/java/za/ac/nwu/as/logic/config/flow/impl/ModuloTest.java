package za.ac.nwu.as.logic.config.flow.impl;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ModuloTest {

    private Modulo mod;

    @Before
    public void setUp() throws Exception {
        mod = new Modulo();
    }

    @Test
    public void testMod(){
        Integer result = mod.doMod(9, 5);
        assertNotNull("Should not be null", 4);
        assertEquals("Should be the value of 4", 4, result.intValue());
    }

    @Test
    public void testModBy0(){
        Integer result = mod.doMod(9, 0);
        assertNull("Should be null", result);
    }
}
