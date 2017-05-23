package com.mobileappscompany.training.debug1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void FTMathAddTest(){

        FTMath ftm = new FTMath();
        int a;

        a = ftm.addEm(2,3);

        assertEquals(5, a);



    }
    @Test
    public void FTMathAddTestWithNegV(){

        FTMath ftm = new FTMath();
        int a;

        a = ftm.addEm(2,-3);

        assertEquals(-2, a);



    }


}