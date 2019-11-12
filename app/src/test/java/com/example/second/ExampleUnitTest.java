package com.example.second;

import org.junit.Test;

import static org.junit.Assert.*;


public class ExampleUnitTest {

    MainActivity ma = new MainActivity();

    @Test
    public void convertation_is_correct() {
        assertEquals(32.0f, ma.celstofor(0f), 0.0f);
    }
}