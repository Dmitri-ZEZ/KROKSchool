package com.company;

import org.junit.Assert;
import org.junit.Test;

public class TestNormalization { //тестирование метода
    @Test
    public void testPathNormalization1(){
        String s = "КРОК/task_6_2/src/./../../task_6_1/../../../мемы/котики";
        Assert.assertEquals("../мемы/котики", Normalization.pathNormalization(s));
    }

    @Test
    public void testPathNormalization2(){
        String s = "КРОК/./task_6_2/src/./../././src";
        Assert.assertEquals("КРОК/task_6_2/src", Normalization.pathNormalization(s));
    }

    @Test
    public void testPathNormalization3(){
        String s = "КРОК/task_6_2/src/./../src/.././";
        Assert.assertEquals("КРОК/task_6_2", Normalization.pathNormalization(s));
    }

    @Test
    public void testPathNormalization4(){
        String s = "КРОК/task_6_2/src/./../src/../..";
        Assert.assertNotEquals("КРОК/task_6_2", Normalization.pathNormalization(s));
    }
}
