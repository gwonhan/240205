package com.ohgiraffers.section01.method;

public class Calculator {

    /*필기. 두 수를 전달받아 작은 수를 반환*/

    public  int minNumberOf(int first, int second){
        // 값을 비교해서 작을 수를 반환하는 것 트루가 나오면 첫번 째 반환, 펄스가 나오면 뒤에 것을 반환
        return (first >second) ? second : first;
    }
    /*필기. 두 수를 전달 받아 큰 수를 반환*/

    public  static int maxNumberOf(int first, int second){
        return (first >second) ? first : second;

    }
}
