package ch01_variable_operator;

public class add {
    static void main() {//ㅗㅗㅗㅗ
        //3 더하기 5는 8입니다
        //변수 정의(선언)
        int y;
        int sum;
        //변수의 값을 할당(대입)
        int x = 3;//쓰기
        y = 5;
        x = 3;
        sum = x + y; //+기호는 덧셈
        System.out.println("x=" + x);// +기호는 문자열 결합
        System.out.println("y=" + y);
        System.out.println("sum" + sum);
        //3 더하기 5는 8입니다
        System.out.println(x + "더하기" + y + "는" + sum + "입니다");
        x = 4; //overwhite
        y = 8;
        sum = x * y;
        System.out.println(x + "곱하기" + y + "는" + sum + "입니다");


    }
}
