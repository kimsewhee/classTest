## [JDBC] 프로그램 개발

### 1. 용어

#### API
   + Application Programming Interface
   + 서로 다른 소프트웨어 시스템 간의 연결을 위한 방식(라이브러리로 제공됩니다.). 

#### 라이브러리 
   + 자바 라이브러리와 같이 특정 기능을 제공하는 클래스들의 집합. .class 파일들의 압축형태

####  jdbc 
   + 자바와 dbms를 연결하고 데이터베이스 접근을 제공하는 api.  
   + 오라클, mysql 등 dbms 는 jdbc 를 지원하는 라이브러리를 제공합니다. 
   + 오라클 21c xe 의 JDBC 위치 -  설치 폴더 C:\app\myste\product\21c\dbhomeXE\jdbc\lib\ojdbc11.jar

### 2. 개발 순서 

#### 1) 라이브러리 추가 
   + ojdbc11.jar 파일 

#### 2) 라이브러리에 포함된 드라이버 클래스를 메모리에 로드하기
   + __Class.forName__ 메소드로 런타임 시점에서 실행한다.
   + 드라이버 클래스 이름 : oracle.jdbc.driver.OracleDriver

#### 3) db 접속(연결) 정보 객체 생성
   + 필요한 정보

            url : db 서버의 host 정보
            username : db 접속 계정 이름
            password : 접속 계정 비밀 번호
    
   + __DriverManager__ 
 
            JDBC(Java Database Connectivity) 드라이버를 관리하는 유틸리티 클래스
            getConnection 메소드는 메모리의 드라이버 클래스에 맞는 Connection 인터페이스의 객체를 만듭니다.

#### 4) SQL 실행을 위한 JDBC API 인터페이스
   + __PreparedStatement__
   
            ☞ SQL 문을 미리 컴파일하고, 실행 시에 매개변수를 바인딩하여 효율적인 DML 실행을 지원합니다.
            ☞ `connection.prepareStatement(sql)`  메소드로 구현 객체 생성합니다.
            ☞ `setInt`, `setString` 등의 메소드는 매개변수를 저장(바인딩) 합니다. 
            ☞ `execute`, `executeUpdate`, `executeQuery` 메소드는 SQL 을 실행합니다.
	
   + __CallableStatement__

            ☞ 데이터베이스에 저장된 미리 컴파일된 SQL 코드 블록인 저장 프로시저 실행을 지원합니다.
            ☞ `connection.prepareCall(sql)`  메소드로 구현 객체 생성합니다.
            ☞ `setInt`, `setString` 등의 메소드는 IN 매개변수를 저장(바인딩) 합니다. 
            ☞ `registerOutParameter` 메소드는 OUT 매개변수를 바인딩 합니다. 인자는 매개변수 위치와 타입(Types.INTEGER)
            ☞ `execute` 메소드는 프로시저를 실행합니다.

 + __Statement__

        ☞ 매개변수 바인딩이 필요없는 create , alter ,drop 등 DDL 실행에 적합합니다.
        ☞ `connection.createStatement()` 메소드로 객체를 생성합니다.
        ☞ `statement.execute(sql)` 메소드는 SQL 명령을 컴파일 하여 실행합니다.

+ __ResultSet__ 

        ☞ 데이터베이스 쿼리의 결과를 저장하고 관리하는 인터페이스입니다. 
        ☞ select 쿼리 결과를 읽기 위한 다양한 메소드를 제공합니다.
        ☞ `next()`: 다음 레코드로 이동하며, 레코드가 있다면 true를 반환합니다.
        ☞ `getInt(String columnName)`, `getString(String columnName)` 등: 지정된 컬럼이름의 값을 가져옵니다.
        ☞ `getXXX(int columnIndex)`: 지정된 컬럼 인덱스의 값을 가져옵니다.
        ☞ absolute(int row): 특정 위치의 레코드로 이동합니다.
        ☞ beforeFirst(), afterLast(), first(), last(): 커서를 결과셋의 특정 위치로 이동시킵니다.
	
