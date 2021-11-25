package com.mycompany.ghamaven;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;

public class TrabajadorTest{

    @org.junit.Test
    public void testgetSueldo() {

        Trabajador instance = new Trabajador("a","b",10,"Profesor");
        int expResult = 4;
        int result = instance.getSueldo();

        Trabajdor instance2 = new Trabajador("a","b",10,"c");
        int expResult2 = 3;
        int result2 = instance2.getSueldo();

        assertEquals(expResult2, result2);
        assertEquals(expResult, result);

    }

}