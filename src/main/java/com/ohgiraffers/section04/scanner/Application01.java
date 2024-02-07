package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application01 {
    public static void main(String[] args) {

        /*수업목표. java. util.scanner 를 이용한 다양한 자료형 값 받아보기.*/

        /*목차. 1.scanner 객체 생성*/
        // Application app = new Application();
        /*목차. 1-1. 원래는 이렇게 scanner 객체를 만들어야 한다.*/
        // java.util.Scanner sc = new Scanner(System.in);


        /*목차. 1-2. 다른 패키지에 있는 클래스 사용시 패키지명을 생략하기 위해 import 를 사용.*/
        Scanner sc = new Scanner(System.in); //임포트 해놨기 때문에 간단하게 씀( java.util)


        /*목차. 2. 자료형별 값 입력받기 */
        System.out.print("이름을 입렵해주세요 : ");      // ln 지우면 출력 후 옆에 입력할 수 있다 (개인이 알아서 입력)
        String name = sc.nextLine();                  //  옆에 그 값을 네임이라는 변수에 저장해준다.
        System.out.println(" 입력하신 이름은 " + name + " 입니다. ");


        /*목차. 2-1. 정수형 값 입력 받기. */
        /*필기. nextInt() : 입력받은 값을 int 형으로 반환한다. */

        System.out.print("나이를 입력해주세요 : ");
        int age = sc.nextInt();
        System.out.println("입력하신 나이는 " + age +" 입니다 ");


        /*필기. nextLong() : 입력받은 값을 long 형으로 반환한다. */

        System.out.print("금액을 입력해주세요 : ");
        long money = sc.nextLong();
        System.out.println("입력하신 금액은 " + money + " 원 입니다. ");


        /*필기. nextFloat() : 입력받은 값을 float 형으로 반환한다. */   //자연스럽게 실수형으로 만들어줌

        System.out.print("키를 입력해주세요 : ");
        float height = sc.nextFloat();
        System.out.println("입력하신 키는 " + height + " cm 입니다. ");


        /*필기. nextDouble() : 입력 받은 값을 double 형으로 반환한다.*/

        System.out.print("원하는 실수를 입력하세요");
        double number = sc.nextDouble();
        System.out.println("입력하신 실수는 " + number + " 입니다. ");


        /*필기. nextBddlean(): 입력 받은 값을 boolean 형으로 반환한다.*/

        System.out.print("참과 거짓 둘 중 한가지를 true or false 로 입력해주세요 : ");
        boolean isTrue =sc.nextBoolean();
        System.out.println("입력하신 논리 값은 " + isTrue + " 입니다. ");

        /*목차. 2-5. 문자형 값 입력받기*/
        sc.nextLine();
        System.out.println("아무 문자나 입력해주세요 : ");     // 0부터 숫자체계 시작됨 chatAt은 몇번째() 글자를 꺼내달라
        char ch = sc.nextLine().charAt(0);
        System.out.println("입력하신 문자는 " + ch + "입니다. ");




    }
}
