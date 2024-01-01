package basic.day3;

/*
 * 수학관련 메소드를 제공하는 자바 Math 클래스 - java.lang 패키지에 있음
 * max, min, round, ceil, floor, random 등등이 많이 사용됩니다.
 * 이 메소드들의 특징은 모두 static 메소드 입니다.
 * static 메소드는 클래스 이름.메소드 이름(인자) 형식으로 호출합니다.
 */
public class A13MathMethod {
    
    public static void main(String[] args) {
        
        System.out.println("1.최대값 max, 최소값 min 구하기");
		System.out.println("Math.max(56,12) ="+ Math.max(56,12));
		System.out.println("Math.max(56.34,99.123)="+ Math.max(56.34,99.123));
		
		int min = Math.min(45, 56);
		double dmin = Math.min(56.78, 111.44);

		System.out.println("Math.min(45, 56) = "+min);
		System.out.println("Math.min(56.78, 111.44) = "+dmin);
		
		//3개의 값 - 45,78,33  - 중 가장 큰값, 가장 작은 값
		int a= 45, b=78,c=93;
		System.out.println("a= 45, b=78,c=33 max = "+Math.max(Math.max(a, b),c));
		System.out.println("a= 45, b=78,c=33 min = "+Math.min(Math.min(a, b),c));
		
		System.out.println("\n2. 반올림 구하기 round , rint 메소드 - 실수를 반올림하여 정수로 리턴");
		System.out.println("Math.round(3.141519) ="+  Math.round(3.141519));
		System.out.println("Math.round(3.14) ="+ Math.round(3.14));
		System.out.println("Math.round(5.64) ="+ Math.round(5.64));
		System.out.println("Math.round(3.5) ="+ Math.round(3.5));	//
		System.out.println("Math.round(-3.5) ="+ Math.round(-3.5));	//
		System.out.println("Math.round(-3.6) ="+ Math.round(-3.6));	//
		System.out.println("Math.round(-3.2) ="+ Math.round(-3.2));	//
		System.out.println("Math.rint(3.5)="+ Math.rint(3.5));		//
		System.out.println("Math.rint(-3.5)="+ Math.rint(-3.5));		//
		System.out.println("Math.rint(-3.6)="+ Math.rint(-3.6));		//
		
		//해결 : 3.141519를 소수점 3번째 자리까지로 반올림 하세요.
		System.out.println("\n3.round 메소드는 무조건 정수로만 리턴합니다. 따라서 소수점 이하 자리수를 반올림하려면");
		System.out.println("반올림하고자 하는 소수점 자리수 만큼 10의 배수를 곱한 후에 반올림을 하고 다시 10의 배수로 나누는 공식을 사용합니다.");
		System.out.println("Math.round(3.141519*1000) ="+Math.round(3.141519*1000));
		System.out.println("Math.round(3.141519*1000) /1000.0 ="+Math.round(3.141519*1000)/1000.0);
		System.out.println("Math.round(3.141219*1000) ="+Math.round(3.141219*1000));
		System.out.println("Math.round(3.141219*1000) /1000.0 ="+Math.round(3.141219*1000)/1000.0);
		
		//1231, 1236 를 십의 자리까지 반올림은 / 하고 *  => 복습으로 해보세요.
		System.out.println("\n4.비슷하게 정수자리에서 반올림을 하려면");
		System.out.println("반올림하고자 하는 정수 자리수 만큼 10의 배수를 나눈 후에 반올림을 하고 다시 10의 배수를 곱하는 공식을 사용합니다.");
		System.out.println("Math.round(1231/10.0)*10 ="+Math.round(1231/10.0)*10);
		System.out.println("Math.round(1236/10.0)*10 ="+Math.round(1236/10.0)*10);
		System.out.println("Math.round(2455/100.0)*100 ="+Math.round(2455/100.0)*100);
		
		System.out.println("\n5. 올림 ceil");
		System.out.println("Math.ceil(3.141519) ="+  Math.ceil(3.141519));
		System.out.println("Math.ceil(3.14) ="+ Math.ceil(3.14));
		System.out.println("Math.ceil(5.64) ="+ Math.ceil(5.64));
		System.out.println("Math.ceil(3.5) ="+ Math.ceil(3.5));	//
		System.out.println("Math.ceil(-3.5) ="+ Math.ceil(-3.5));	//값이 커지도록 올림하는 것이므로 음수는 절대값이 작아지도록 올림합니다.
		
		
		System.out.println("\n6. 내림 floor");
		System.out.println("Math.floor(3.141519) ="+  Math.floor(3.141519));
		System.out.println("Math.floor(3.14) ="+ Math.floor(3.14));
		System.out.println("Math.floor(5.64) ="+ Math.floor(5.64));
		System.out.println("Math.floor(3.5) ="+ Math.floor(3.5));	//
		System.out.println("Math.floor(-3.5) ="+ Math.floor(-3.5));	//
		
		System.out.println("\n7. 난수(컴퓨터가 만들어주는 임의 값) - random");
		System.out.println("Math.random() = " + Math.random());
		System.out.println("Math.random() = " + Math.random());
		System.out.println("Math.random() = " + Math.random());
		System.out.println("Math.random() = " + Math.random());
		System.out.println("Math.random() = " + Math.random());
		System.out.println("Math.random() = " + Math.random());
		System.out.println("Math.random() = " + Math.random());
		// 0 < 난수 < 1    => 로또 값처럼 1 <= 로또번호 <= 45
		//  원래 난수값 범위에 *45를 하고       0 < 난수*45 < 45   
		//  그 값에 다시 +1 하면 됩니다.        1 < 난수*45+1 < 46
		//  나수의 범위를 start ~ end 범위로 조정하려면
		//  (int)(Math.random()*(end-start+1))+start
		
				
    }

}
