//package ru.netology.service;
//
//import org.testng.annotations.Test;
//import static org.testng.Assert.*;
//
//public class CashbackHackServiceTestNGTest {
//    private final CashbackHackService service = new CashbackHackService();
//
//    @Test
//    public void shouldReturn100IfAmountIs900() {
//        int amount = 900;
//        int expected = 100;
//        int actual = service.remain(amount);
//        assertEquals(actual, expected);
//    }
//
//    @Test
//    public void shouldReturn0IfAmountIs1000() {
//        int amount = 1000;
//        int expected = 0;
//        int actual = service.remain(amount);
//        assertEquals(actual, expected);
//    }
//
//    @Test
//    public void shouldReturn900IfAmountIs1100() {
//        int amount = 1100;
//        int expected = 900;
//        int actual = service.remain(amount);
//        assertEquals(actual, expected);
//    }
//}