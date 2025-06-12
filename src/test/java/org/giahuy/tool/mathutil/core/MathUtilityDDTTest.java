package org.giahuy.tool.mathutil.core;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {
    //Tách data ra khõi hàm test
    //dựng 1 bảng 2 chiều: input, expecteed
    //sau đó nhồi vào, fill vào câu lệnh so sánh
    //mảng này sẽ là nguồn dữ liệu để hàm so sánh gọi, nhiều lần như thế

    public static Object[][] initTestData(){
        return new Object[][]{  {2, 2},
                                {6, 3},
                                {24, 4},
                                {1200, 5}
                                    };
    }
    @ParameterizedTest
    @MethodSource("initTestData")
    public void testFactorialGivenRightArgumentRunWell(long expected, int n) {
        assertEquals(expected, MathUtility.getFactorial(n));
    }
}