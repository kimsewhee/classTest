package basic.day2;

//if 조건문 시작 : 첫번째형식은    if (조건식) {    참일때 실행하는 명령문들…..    }
public class A10IfTest {

	public static void main(String[] args) {
		
			
		int point = 69;		//처리사항 : 1)point 가 70 이상이면 vip, 70미만이면 일반회원으로 출력합니다.
							// 	2)vip 회원이면 이벤트 포인트 100 포인트 추가, 일반회원 50 포인트 추가
		if(point >=70) {
			System.out.println("Vip 회원이십니다.💕💕");
			point += 100;
		}else {		//	point < 70 일때 실행
			System.out.println("일반 회원이십니다.🤞🤞");
			point +=50; 
		}
		
		System.out.println("고객님의 최종 포인트는 " + point + " 입니다.");
	}
}
