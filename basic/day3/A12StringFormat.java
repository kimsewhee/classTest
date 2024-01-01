package basic.day3;

import java.text.DecimalFormat;

public class A12StringFormat {

    public static void main(String[] args) {
        
        //1. 개인 정보 값으로 String format 테스트하기
        int age = 29;
        boolean isAdult = age>=20;
        double point = 1567.78;
        long property = 234567890123L;
        char gender = 'F';
        String name = "한소희";

        String message;
        message = String.format("%s 고객님의 포인트는 %f 입니다.", name, point);
        System.out.println(message);
        message = String.format("나이는 %d 세 , 성인이 %s 입니다. ", age, isAdult);  
        System.out.println(message);
        message = String.format("성별은 %c , 현재 보유하신 자산은 %d 원 입니다.", gender, property);
        System.out.println(message);

        System.out.println();
        System.out.println(String.format("%s 고객님의 포인트는 %.1f 입니다.", name, point));
        String adult = isAdult ? "성인입니다." : "청소년입니다.";
        System.out.println(String.format("나이는 %d 세 , %s ", age, adult));
        
        DecimalFormat df = new DecimalFormat("#,### 원");
        String temp = df.format(property);
        System.out.println(String.format("성별은 %s , 현재 보유하신 자산은 %s 입니다.", 
                                                gender=='M'? "남성":"여성", temp));

    }
    
}
