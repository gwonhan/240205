package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application02 {
    public static void main(String[] args) {
        /*수업목표. Scanner 의 nextLine() 과 next() 에 대해 구분하여 사용할 수 있다. */
        /*필기.
        *   nextLine() : 공백을 포함한 한 줄을 입력을 위한 개행문자 전 까지 읽어서 문자열로 반환한다.(공백문자 포함)
        *  next : 공백문자나 개행문자 전 까지를 읽어서 문자열로 반환한다. (공백문자 포함하지 않음)
        *  */

        /*목차. 1. Scanner 객채 생성*/
        Scanner sc = new Scanner(System.in);

        /*목차. 2. 문자열 입력.*/
        /*목차. 2-1. nextLine().*/

        System.out.print("인사말을 입력해주세요 : ");
        String greeting =sc.nextLine();
        System.out.println(greeting);                  // 안녕하세요 반갑습니다.

        /*목차. 2-2. next()*/
        System.out.print("인사말을 입력해주세요 : ");      // 공백 뒤론 반환하지 않는다 ex) 안녕하세요 하하 -> 안녕하세요
        String greeting2 = sc.next();                  // \n 개행문자. 한 줄 띄어서 내려줌
        System.out.println(greeting2);
    }
}
