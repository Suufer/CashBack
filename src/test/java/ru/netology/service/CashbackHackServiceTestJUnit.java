package ru.netology.service;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class CashbackHackServiceTestJUnit {

    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(700);
        Assert.assertEquals(300, result);
    }

    @Test
    @Ignore
    public void testSomeDefect() {
        Assert.fail("Тест временно отключен из-за дефекта");
    }
}


