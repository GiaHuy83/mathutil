package org.giahuy.tool.mathutil.core;

public class MathUtility {
    //CLASS NÀY CHỨA CÁC HÀM STATIC, LÀ NHỮNG HÀM TIỆN ÍCH CHUNG DÙNG CHO MỌI NƠI

    //ĐÂY LÀ HÀM MÔ PHỎNG THƯ VIỆN TOÁN HỌC MATH. CỦA JDK
    //HÀM NÀY TÍNH N!
    //N! = 1 * 2 * 3... * N
    //0! = 1
    //20! VỪA ĐỦ KIỂU LONG, TỨC 21! VƯỢT ĐỦ KIỂU LONG
//    public static long getFactorial(int n) {
//        //đem code chính ra sửa gọi là REFACTOR/REFACTORING
//        if (n < 0 || n > 20)
//            throw new IllegalArgumentException("n must be between 0 and 20");
//        // bạn đưa invalid data, tớ ném ra ngoại lệ, hàm ko đc chạy thành công, ko value trả về
//
//        if (n == 0)
//            return 1;
//
//        //sống sót đến đây n = 1..19
//        //for mà tính
//        long result = 1; //thuật toán dồn con heo đất
//        for (int i = 1; i <= n; i++){
//            result *= i;
//        }
//        return result;
//    }
    public static long getFactorial(int n) {
        //đem code chính ra sửa gọi là REFACTOR/REFACTORING
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("n must be between 0 and 20");
        // bạn đưa invalid data, tớ ném ra ngoại lệ, hàm ko đc chạy thành công, ko value trả về

        if (n == 0 || n == 1)
            return 1;

        // Đệ quy
        return n * getFactorial(n-1);
    }
}
