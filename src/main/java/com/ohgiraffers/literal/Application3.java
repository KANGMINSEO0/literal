package com.ohgiraffers.literal;

public class Application3 {

    public static void main(String[] args) {

        // 문자열 합치기 결과를 예측하고 사용할 수 있다.
        // 1. 두 개의 문자열 합치기
        System.out.println("======== 두 개의 문자열 합치기 =========");
        System.out.println(9 + 9);      // 18
        System.out.println("9" + 9);    // 99 구구
        System.out.println(9 + "9");    // 99 구구
        System.out.println("9" + "9");


        // 2. 세 개의 문자열 합치기
        System.out.println("======== 세 개의 문자열 합치기 =========");
        System.out.println(9 + 9 + "9");    // '+'의 연산 방향은 왼쪽에서 오른쪽이다. 189 일팔구
        System.out.println(9 + "9" + 9);    // 999 구구구
        System.out.println("9" + 9 + 9);    // 999 구구구

        System.out.println("9" + (9 + 9));  // 918 구일팔

        System.out.println("10과 20의 합 : " + (10 + 20));
        System.out.println("10과 20의 차 : " + (10 - 20));
        System.out.println("10과 20의 곱 : " + (10 * 20));
        System.out.println("10과 20의 나누기 한 몫 : " + (10 / 20));
        System.out.println("10과 20의 나누기 한 나머지 : " + (10 % 20));

        System.out.println("기차");
        System.out.println("기차" + "칙칙폭폭");  // 기차칙칙폭폭
        System.out.println("기차" + 123 + 45 + "출발"); // 기차12345출발
        System.out.println(123 + 45 + "기차" + "출발"); // 168기차출발


        System.out.println('9' + '9');  // 114
        System.out.println('8' + '8');  // 112
    }
}
