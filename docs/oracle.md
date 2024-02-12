## 데이터베이스

 - 정의 : 데이터의 집합.
 - 비교 : 파일에도 데이터를 저장할 수 있지만 `파일에는 없는 기능(조회,성능관리)`들을 데이터베이스가 제공
 - `관계형` 데이터베이스 : `테이블`(표)에 데이터를 저장. SQL 데이터 관리 명령을 사용.
 - relation (관계) : 현실 세계에서 '쇼핑몰' 을 예로 들면
        - 회원 , 상품 , 구매 등 어떤 활동을 발생하는 정보들을 말합니다.
        - `회원`이 `상품`을  `구매`한다. 
 - 테이블 구성 : 줄(레코드,튜플,`행row`),칸(필드,항목,`열column`)
      - 회원 가입을 한다. 
          - 이름,전화번호,주소 등은 `열`로 정의합니다.
          - '홍길동','010-2222-3333','서울시 강남구'  과 같이
             필드(열)에 데이터를 저장한 1개를 레코드(행,튜플)라고 합니다.

### 1. 오라클 21c xe 설치		

 - xe: express edition 으로 기업용(enterprise edition) 과는 다르게  라이센스 비용이 없습니다.(기본 사항으로 구성)
  - 다운로드 후 압축 풀기 -> setup.exe 실행하기 -> 설치 중에  창이 2개 보입니다.				
  - 설치 중 체크 사항 : 오라클 홈 디렉토리	, 관리자 계정 비밀번호 설정					
								

### 2. 설치 후  SQL Plus 실행
  - CLI 관리 프로그램 
  - cmd 명령프롬프트에서 접속하기
  
        최고 권한 관리자는 sys 계정으로 접속
        sqlplus / as sysdba
#### 관리자 계정으로 connect (로그인)			
 - DBA는 데이터베이스 관리자(Administrator) 입니다.				

 - system (sys 하위의 관리자) 계정 접속하기
 
        SQL> connect system/1234			
        *1234는 계정 비밀번호		
								
#### 새로운 사용자 계정 만들기	

  
	SQL> create user c##idev identified by 1234 default tablespace users quota unlimited on users;		

	SQL> grant resource, connect to c##idev;				
    *권한 부여 : 연결,리소스 사용		
								
#### 사용자 계정 테스트						
 - 사용자 계정으로 접속하기
 	
        SQL> connect c##idev/1234
 - 테이블 생성을 해봅니다. 
								
		SQL> select * from tab;		현재 계정의 테이블 목록 보기			
		SQL> create table members( 
		2  no number,						
		3  name varchar2(20),						
		4  age number,						
		5  addr varchar2(20));						
								
		SQL> insert  into  members  values (1,'김모모',23,'서울시');					
						
                				
   - 21c 버전에서는 새로운 계정이 사용할 저장공간을 설정해야합니다. (그렇지 않으면 insert 오류) 
 - 테이블 스페이스 설정(필요시)

	    SQL> connect system/1234				
        *관리자권한으로 해야하는 작업		

        SQL> alter user c##idev default tablespace users quota unlimited on users;
								
#### 잠긴 계정 풀기 
 - 예시			
								
	SQL> connect hr		
    				
	Enter password:							
	ERROR:							
	ORA-28000: the account is locked					
	Warning: You are no longer connected to ORACLE.		

        SQL> connect system/1234
        * 관리자 계정 system 다시연결	
	    
        SQL> alter user hr account unlock;		
        *hr 계정 잠김 풀기					
								
	    SQL> show user;

	    SQL> alter user hr identified by hr;		
        *사용자 계정 패스워드 변경(관리자 계정상태에서 해야합니다.)	
								

#### 테이블 정보 보기	
								
	SQL> select * from tab;		
    *접속된 계정에 저장된 테이블 목록 보기		

    SQL> desc members;		
    *members 테이블의 구조 보기		

								
### 3. dbeaver 설치 
- 데이터베이스 서버에 연결할 GUI 클라이언트 프로그램	
- 주요 데이터베이스 서버 프로그램에 연결할 수 있다.							
- 오라클에 연결 
  - URL 은?		localhost:1521/xe					
  - 서버 이름	localhost	도메인이름 또는 ip 가 될수 있습니다.192.168.3.4 는
  - 서버 포트	1521	오라클 1521 
  - *참고 : mysql 3306 으로 정해진 값 사용합니다.				
  - 데이터베이스 이름 : xe					
					