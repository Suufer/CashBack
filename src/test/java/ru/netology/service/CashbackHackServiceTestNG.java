package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTestNG {

    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(700);
        Assert.assertEquals(300, result);
    }

    @Test(enabled = false)
    public void testSomeDefect() {
        Assert.fail("Тест временно отключен из-за дефекта");
    }
}




