package com.ohgiraffers.test;

public class Application01 {
    public static void main(String[] args) {

         /*수업목표. 메소드의 호출 흐름을 연습해보자.*/

        System.out.println("메인 프로그램이 시작됩니다...");

        Application01 app1 = new Application01(); // 오른쪽은 값 왼쪽 앱1은 공간이다. // public class 자체가 자료형이 될 수 있다
        app1.testMethod();                          // 보이드는 자기가 수행할 것을 다 수행하면 돌아간다.
                                                    // 자료형은 값을 가지고 돌아가지만 스트링이다. 리턴을 써주어야한다.
        System.out.println("메인 프로그램이 종료 후 없어집니다...");
    }

    public  void testMethod(){

        System.out.println("안녕하세요 나는 테스트 메소드이야 불렀나");

        testMethod2();

        System.out.println("그럼 나는 이만 ");

    }

    public  void testMethod2(){

        System.out.println("하이 나는 테스트메소드 2 ");

//        System.out.println(testMethod3() ); // 값 자체를 출력문에 넣어서 출력을 한 상태.
        String hi =testMethod3();
        System.out.println("hi = " + hi);     // 값을 변수 공간에 담아서 출력을 한 상태.
        System.out.println("나도 그럼 이만 안녕");


    }

    public  String testMethod3(){


        return "안 불렀어요 ";
        // sout 출력을 안하면 그냥 둥둥 떠다니는 상태가 된다.

    }


}
