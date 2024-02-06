package com.ohgiraffers.section01.method;

public class Application08 {
    public static void main(String[] args) {

        /*수업목표. static 메소드를 호출할 수 있다.*/
        /*필기.
        *   static 메소드 호출
        *  static 메인 메소드를 시작할 때 재사용 가능한 것을 미리 만들어 놓는다.
        *  static 이라는 것을 만들면 공간을 미리 만들기 때문에 new 라는 공간을 따로 만들지 않아도 된다.
        *  */

        /*필기.
        *   static 메소드 호출하는 방법
        *  클레스명. 메소드명(); <- 이런 방식으로 호출한다.
        * */

        System.out.println("10과 20의 합 : " + Application08.sumTwoNumbers(10,20));
        /* 필기. 동일한 클래스 내에 작선된 static 메소드는 클래스명이 생략 가능하다. */
        System.out.println("20과 30의 합 : " + sumTwoNumbers(20,30));
        System.out.println("50과 30의 합 : " + sumTwoNumbers(50,30));
    }
    public  static  int sumTwoNumbers(int first, int second){

        return first + second;

    }


}
