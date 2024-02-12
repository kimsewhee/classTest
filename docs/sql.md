## SQL : Structured Query Language (구조적 질의 언어)										
 - 관계형 데이터베이스에서 사용하는 명령어										
 - DDL , DML, DCL 로 분류할 수 있습니다.								
 
    	Data  (      )   Language									
										
### 1. DDL	Definition (정의하다)									
- 데이터베이스 객체를 대상으로 합니다. (사용자, 테이블, 뷰,시퀀스....)									
										
	    create 생성하다								
	    alter	변경하다								
	    drop	제거하다								
										
										
### 2. DML	Manipulation (조작하다)			
 - CRUD(create/insert , read/select, update, delete)						
 - 테이블에 저장된 데이터가 대상입니다.						
 							
    	insert	: 새로운 데이터의 추가(삽입)								
	    select	: 저장된 데이터의 조회								
	    update	: 저장된 데이터의 수정								
	    delete	: 저장된 데이터의 삭제								
										
### 3. DCL	Control (제어하다)									
 - 데이터베이스의 객체 또는 데이터와 관련된 제어 명령
    
        grant	: 지정된 사용자 계정에 권한(역할) 을 허용하다.     권한(역할) : resource , connect  등등....								
        revoke	: 허용된 권한을 철회(취소)한다.								
                                            
        commit	: insert/update/delete 는 저장된 데이터의 변경 작업은 신중해야 합니다. 때문에 최종 변경을 확인(승인)!!!								
        rollback	: insert/update/delete 실행한 명령을 이전 상태로 되돌립니다.								
										