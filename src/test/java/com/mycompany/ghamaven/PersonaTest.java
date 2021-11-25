/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ghamaven;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author pablo
 */
public class PersonaTest {
    
    public PersonaTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
    //@BeforeAll
    //public static void setUpClass() {
    //}
    
    //@AfterAll
    //public static void tearDownClass() {
    //}
    
    //@BeforeEach
    //public void setUp() {
    //}
    
    //@AfterEach
    //public void tearDown() {
    //}

    /**
     * Test of hBirthday method, of class Persona.
     */
    @org.junit.jupiter.api.Test
    public void testHBirthday() {
        System.out.println("hBirthday");
        Persona instance = new Persona("a","b",15,false);
        instance.hBirthday();
        // TODO review the generated test code and remove the default call to fail.
        if(instance.getAge()!=15)
        {
            fail("The test case is a prototype.");
        }

    }

    /**
     * Test of getId method, of class Persona.
     */
    @org.junit.jupiter.api.Test
    public void testGetId() {
        System.out.println("getId");
        Persona instance = new Persona("a","b",2);
        String expResult = "b";
        String result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Persona.
     */
    @org.junit.jupiter.api.Test
    public void testSetId() {
        System.out.println("setId");
        String id = "";
        Persona instance = null;
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Persona.
     */
    @org.junit.jupiter.api.Test
    public void testGetName() {
        System.out.println("getName");
        Persona instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Persona.
     */
    @org.junit.jupiter.api.Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Persona instance = null;
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAge method, of class Persona.
     */
    @org.junit.jupiter.api.Test
    public void testGetAge() {
        System.out.println("getAge");
        Persona instance = null;
        int expResult = 0;
        int result = instance.getAge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAlive method, of class Persona.
     */
    @org.junit.jupiter.api.Test
    public void testIsAlive() {
        System.out.println("isAlive");
        Persona instance = null;
        boolean expResult = false;
        boolean result = instance.isAlive();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAlive method, of class Persona.
     */
    @org.junit.jupiter.api.Test
    public void testSetAlive() {
        System.out.println("setAlive");
        boolean alive = false;
        Persona instance = null;
        instance.setAlive(alive);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
