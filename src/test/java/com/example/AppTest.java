package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * App クラスの四則演算機能のユニットテスト
 */
public class AppTest 
{
    /**
     * 加算のテスト
     */
    @Test
    public void testAdd()
    {
        assertEquals(15.0, App.add(10, 5), 0.0001);
        assertEquals(0.0, App.add(5, -5), 0.0001);
        assertEquals(-5.0, App.add(-10, 5), 0.0001);
        assertEquals(0.0, App.add(0, 0), 0.0001);
    }
    
    /**
     * 減算のテスト
     */
    @Test
    public void testSubtract()
    {
        assertEquals(5.0, App.subtract(10, 5), 0.0001);
        assertEquals(0.0, App.subtract(5, 5), 0.0001);
        assertEquals(-15.0, App.subtract(-10, 5), 0.0001);
        assertEquals(0.0, App.subtract(0, 0), 0.0001);
    }
    
    /**
     * 乗算のテスト
     */
    @Test
    public void testMultiply()
    {
        assertEquals(50.0, App.multiply(10, 5), 0.0001);
        assertEquals(-50.0, App.multiply(10, -5), 0.0001);
        assertEquals(0.0, App.multiply(0, 5), 0.0001);
        assertEquals(25.0, App.multiply(5, 5), 0.0001);
    }
    
    /**
     * 除算のテスト
     */
    @Test
    public void testDivide()
    {
        assertEquals(2.0, App.divide(10, 5), 0.0001);
        assertEquals(-2.0, App.divide(10, -5), 0.0001);
        assertEquals(1.0, App.divide(5, 5), 0.0001);
        assertEquals(0.5, App.divide(5, 10), 0.0001);
    }
    
    /**
     * 除算で0で割る場合の例外テスト
     */
    @Test(expected = ArithmeticException.class)
    public void testDivideByZero()
    {
        App.divide(10, 0);
    }
}
