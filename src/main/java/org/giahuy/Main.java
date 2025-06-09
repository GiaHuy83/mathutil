package org.giahuy;
import org.giahuy.tool.mathutil.core.MathUtility;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        testFactorialGivenRightArgumentRunsWell();
        testFactorialGivenRightArgumentRunsWell();
        testFactorialGivenRightArgumentRunsWell();
        testFactorialGivenRightArgumentRunsWell();
    }
    //TEST THỬ HÀM VỪA GÕ
    //CẦN CÓ TEST CASE
    //TEST CASE #1 : CHECK/VERIFY THE GETFACTORIAL() METHOD
    // WITH N = 0
    // STEPS : GIVEN N = 0
    //          CALL GETFACTORIAL(N = 0)
    //EXPECTED RESULT: HOPE TO SEE 1 AS THE RESULT OF 0!
    //STATUS : ĐOÁN XEM, CHỜ CHẠY XEM SAO

    public static void testFactorialGivenRightArgument1RunsWell(){
        int n = 1;
        long expected = 1;
        long actual = MathUtility.getFactorial(n);
        System.out.println("2! expected: 2"+ expected + " actual: " + actual);
        System.out.println("3! expected: 6"+ expected + " actual: " + actual);
        System.out.println("0! expected: "+ expected + " actual: " + actual);
        System.out.println("0! expected: "+ expected + " actual: " + actual);
    }

    public static void testFactorialGivenRightArgumentRunsWell(){

        System.out.println("2! expected: "+  " actual: " + MathUtility.getFactorial(2));
        System.out.println("3! expected: "+  " actual: " + MathUtility.getFactorial(3));
        System.out.println("0! expected: "+  " actual: " + MathUtility.getFactorial(4));
        System.out.println("0! expected: "+  " actual: " + MathUtility.getFactorial(5));
    }

}

//TODO : TEST DRIVEN DEVELOPMENT
//VIẾT CODE CHÍNH VÀ VIẾT TEST CASE/TEST RUN SONG SONG VỚI NHAU
//CỨ VIẾT ĐC CODE NÀO, THÌ CÓ NGAY TEST CASE CHO NÓ
//TEST CASE DÙNG ĐỂ TEST HÀM (KO NHẦM VỚI TEST APP - TEST MÀN HÌNH UI VÀ NHẬP LIỆU ... ) CHỈ DÀNH CHO CHÍNH DÂN DEV
// (DÂN QA/QC KO DÍNH VÀO CODE CẢU PROJECT)

//NHỜ TDD, TDD ĐÓNG GÓP 1 PHẦN GIÚP NGƯỜI TA TỰ DỘNG HÓA QUÁ TRÌNH BUILD, CHECK BUG, ĐÓNG GÓI
// NẾU CODE ỔN, DEPLOY LÊN STAGING SERVER (SERVER ĐỂ TEST APP)
//CODE  ------> CHECK VAR CODE (UNIT TEST, TDD)
//                      OKIE THÌ ĐÓNG GÓI APP
//                          ĐƯA APP LÊN SERVER
//QUY TRÌNH NÀY LÀ CI/CD


//CV CÓ 1 MỤC:
//Technical Skills ----------
//JUnit
//TDD
//CI/CD
//Maven
