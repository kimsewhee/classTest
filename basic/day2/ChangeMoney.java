package basic.day2;


/* ChangeMoney.java 
 여행을 가려면 환전을 해야합니다.
 활용 : 변수, 연산, 캐스팅(수업내용 범위 안에서 하세요.)
 일본 : 원화 -> 엔화     
  
 1엔 = ?원
 1달러 = ?원
 
 여행에서 돌아왔습니다. 남은 돈은 원화로 얼마인가요.
 엔화 -> 원화
 */
public class ChangeMoney {

	public static void main(String[] args) {
		
		int myWon;			
		int myYen;
		int cost;	//여행 비용
		
		double toYen;		//변경된 엔화 값
		double yenTowonRate; 	//1엔이 몇 원? 살때	
		double wonToYenRate;	//1엔이 몇 원? 팔때
		int toWon;		//변경된 원화 값


		
		myWon = 1000000;
		
		yenTowonRate = 9.27;			//1엔 ? 원
		toYen = (double)myWon / yenTowonRate;

		//한국 일본 환전 계산
		System.out.println("::: 한/일 23.12.20 기준 환율 :::");
		System.out.println("1엔 = " + yenTowonRate + '원');
		System.out.println();
		
		System.out.println("::: 원화를 엔화로 환전하기 :::");
		System.out.println("환전할 원화는  " + myWon + "원 입니다.");
		System.out.println("원화를 엔화로 바꿀 때 : " + toYen + "원 입니다." );
		System.out.println();
		
		System.out.println("::: 엔화를 원화로 환전할 경우 :::");
		cost = 98760;
		System.out.println("일본에서 사용한 금액은 " + cost + " 엔 입니다.");
		myYen= (int)(toYen - cost);
		System.out.println("남은 엔화는 얼마인가요? " + myYen + '엔');
		wonToYenRate = 8.95;		//팔때
		System.out.println("엔화를 원화로 바꿀 때 : " + myYen *wonToYenRate + '원');
		// System.out.println("");
		
		
	}
}
