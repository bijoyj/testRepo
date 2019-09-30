package com.example2.hc_bijoy.myapplication;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void verifyBusinessLogic1() {
        ArrayList a = new ArrayList();
        a.add("One");
        a.add("Two");
        VIewModel vm = new VIewModel(a);
        int size = vm.BusinessLogic1();
        assertEquals(a.size(), size);
    }

    @Test
    public void verifyBusinessLogic2() {
        ArrayList a = new ArrayList();
        a.add("One");
        a.add("Two");
        VIewModel vm = new VIewModel(a);
        String val = vm.BusinessLogic2(1);

        assertEquals("Two", val);
    }
}