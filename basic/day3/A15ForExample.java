package basic.day3;

public class A15ForExample {
    
    public static void main(String[] args) {
        String message = "Hello, World~ Hoi";

        System.out.println("1.문자열 길이 만큼 문자 1개를 추출하는 반복문 실행하기");
        for(int i=0; i<message.length(); i++) {
           char temp = message.charAt(i);
           System.out.println(""+temp);
        }

        System.out.println("\n2.문자열 길이 만큼 반복문 실행하면서 if 조건문으로 문자열 검사하기");
        int count = 0;
        for(int i=0; i<message.length() ; i++){
            char temp = message.charAt(i);
            if(temp=='o'){
                count++;
            }
        }
        System.out.println("알파벳 o의 개수는 "+count+" 개 입니다. ");

    }
}
