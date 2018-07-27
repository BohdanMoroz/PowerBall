//package com.PowerBall;
//
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//import static org.hamcrest.core.Is.*;
//
//public class BallMachineTest {
//
//    final BallMachine ballMachine = new BallMachine();
//
//    @Test
//    public void test(){
//        final int value = ballMachine.generateBallValue(0);
//        assertTrue(value >= 1 && value <= 26);
//    }
//
//    @Test
//    public void test2(){
//        for (int i = 1; i < 6; i++) {
//            final int value = ballMachine.generateBallValue(i);
//            assertTrue(value >= 1 && value <= 69);
//        }
//    }
//
//    @Test
//    public void test3(){
//        final int value = ballMachine.generateBallValue(6);
//        assertThat(value, is(-1));
//    }
//}
