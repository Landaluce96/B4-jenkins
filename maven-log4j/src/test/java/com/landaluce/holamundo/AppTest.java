package com.landaluce.holamundo;

import static org.junit.Assert.assertTrue;

import org.apache.logging.log4j.LogManager;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void createClass(){
        new App();
    }
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void encuentraLogger(){
        assertTrue(LogManager.getLogger(AppTest.class)!=null);
    }

    @Test
    public void pruebaMetodoMessages(){
        App.messages();
    }

    @Test
    public void testMainMethod(){
        App.main(null);
    }
}
