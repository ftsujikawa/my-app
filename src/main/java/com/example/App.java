package com.example;

/**
 * 四則演算を行うアプリケーション
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        // 四則演算のテスト
        System.out.println( "10 + 5 = " + add(10, 5) );
        System.out.println( "10 - 5 = " + subtract(10, 5) );
        System.out.println( "10 * 5 = " + multiply(10, 5) );
        System.out.println( "10 / 5 = " + divide(10, 5) );
    }
    
    /**
     * 加算を行う
     * @param a 第1引数
     * @param b 第2引数
     * @return 加算結果
     */
    public static double add(double a, double b) {
        return a + b;
    }
    
    /**
     * 減算を行う
     * @param a 第1引数
     * @param b 第2引数
     * @return 減算結果
     */
    public static double subtract(double a, double b) {
        return a - b;
    }
    
    /**
     * 乗算を行う
     * @param a 第1引数
     * @param b 第2引数
     * @return 乗算結果
     */
    public static double multiply(double a, double b) {
        return a * b;
    }
    
    /**
     * 除算を行う
     * @param a 第1引数（被除数）
     * @param b 第2引数（除数）
     * @return 除算結果
     * @throws ArithmeticException bが0の場合
     */
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("0で除算することはできません");
        }
        return a / b;
    }
}
