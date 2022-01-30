package org.bluej.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalcEngineTest {

    @Test
    public void testNumberInput(){
        CalcEngine calcEngine = new CalcEngine();

        // Test at bruker trykker tallene 1 2 og 3
        // som skal resultere i at displayet viser
        // tallet 123
        calcEngine.numberPressed(1);
        calcEngine.numberPressed(2);
        calcEngine.numberPressed(3);

        assertEquals(123, calcEngine.getDisplayValue());
    }

    @Test
    public void testAdditionOfTwoNumbers(){
        CalcEngine calcEngine = new CalcEngine();

        // Input the number 25
        calcEngine.numberPressed(2);
        calcEngine.numberPressed(5);

        calcEngine.plus();

        // Input the number 13
        calcEngine.numberPressed(1);
        calcEngine.numberPressed(3);

        // Calculate result
        calcEngine.equals();

        assertEquals(38, calcEngine.getDisplayValue());
    }
}
