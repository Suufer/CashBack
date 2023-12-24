package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(700);
        Assert.assertEquals(result, 300);
    }

    // Добавьте еще тесты по необходимости
}



