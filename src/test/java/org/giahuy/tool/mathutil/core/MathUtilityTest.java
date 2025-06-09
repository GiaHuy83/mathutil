package org.giahuy.tool.mathutil.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {

    @Test    //@Test mang ý nghĩa biến hàm ở sát dưới thành hàm main() thì mới chạy lệnh test khi run app!!!
        //TEST CASE #1 : VERIFY GETFACTORIAL WITH N = 0
    void testFactorialGivenRightArgument0RunsWell() {
        int n = 0;
        long expected = 1;  //hi vọng n = 0, tức là 0! sẽ có giá trị là 1
        long actual = MathUtility.getFactorial(n);
        assertEquals(expected, actual); // so sánh giúp tôi xem thực tế có như kì vọng hay hem???
    }
    @Test
        //TEST CASE #2 : VERIFY GETFACTORIAL WITH N = 1
    void testFactorialGivenRightArgument1RunsWell(){
        int n = 1;
        long expected = 1;  //hi vọng n = 1, tức là 1! sẽ có giá trị là 1
        long actual = MathUtility.getFactorial(n);
        assertEquals(expected, actual); //
    }

    @Test
        //TEST CASE #3 : VERIFY GETFACTORIAL WITH N = 1
    void testFactorialGivenRightArgumentRunsWell(){
        assertEquals( 2, MathUtility.getFactorial(2));
        assertEquals( 6, MathUtility.getFactorial(3));
        assertEquals( 24, MathUtility.getFactorial(4));
        assertEquals( 120, MathUtility.getFactorial(5));
    }

    //TEST CASE #4: (BẮT NGOẠI LỆ)
    //VERIFY getFactorial() with n < 0, e.g. n = -5 to throw an Exception
    //Step:
    //1. Given an invalid number, n = -5
    //2. Call/invoke the function getFactorial(-5)
    //Expected result:
    //       an IllegalArgumentException will be throw
    @Test
    public void testFactorialGivenWrongArgumentMinus5ThrowsException(){
        assertThrows(IllegalArgumentException.class, () -> MathUtility.getFactorial(-5));
    };
    //Ta phải kiểm soát, phải đo xem ngoại lệ đã đến chưa nếu là -5
    //so sành
}