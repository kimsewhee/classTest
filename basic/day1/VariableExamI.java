package basic.day1;



//문제  : 사각형의 세로는 항상 정수, 가로는 항상 실수 입니다.
//       현재 세로는 12 cm 이고 , 가로는 8.45 입니다.  변수는 가로 width, 세로 height 로 합니다.
//		  
//		1) 넓이 저장 변수는 실수 areaDouble 로 선언하고  넓이를 계산하여 저장합니다.
//		2) 계산한 넓이 값을 출력하세요.
//		3) 넓이 저장 변수를 정수 areaInt 로 하나 더 선언하고 넓이를 계산하여 저장합니다.
//      4) 오류가 없도록 앞에서 배운 내용을 활용해 봅시다.	
public class VariableExamI {
	// 핵심 : 대입연산 = 기준으로 오른쪽, 왼쪽 각각 데이터 형식이 일치해야한다.
		public static void main(String[] args) {
			 
			int height = 12;
			double width = 8.45;
			
			//오류:width * height 결과값은 실수이므로 정수형 변수에 저장 못합니다.
			//int areaInt = width * height;
			double areaDouble = width * height;
			
			System.out.println("사각형의 넓이는 " + areaDouble);
			
			//int areaInt = width * height; 오류를 강제 캐스팅으로 실행하기
			int areaInt = (int)width * height;
			System.out.println("width를 강제 캐스팅 한 사각형 넓이 : "  + areaInt);
			
		}

}
