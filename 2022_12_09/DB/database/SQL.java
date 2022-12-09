package database;

public class SQL {

}
/*
 * SQL 
 * 
 * 	1. 영어 알파벳의 대/소문자를 구별하지 않음
 * 	2. 명령어를 입력하고 세미 콜론(;)으로 끝맺음을 해야 한 문장으로 인식함
 * 
 * 
 * Create user (Oracle 21c ver.)
 * 
 * 	1. ID: c##green, PW: green1234 
 * 		-> 집에서 개인적으로 연습할 때, pw는 바꿔도 됨
 * 	
 * 	SQL> create user c##green identified by (비밀번호 입력);
 * 
 * 	SQL> grant create session to c##green;
 * 	SQL> grant dba to c##green;
 * 
 * 	SQL> commit; // commit 의 반대되는 명령어 = rollback
 * 	SQL> connect system;
 * 	SQL> select * from tab; // 생성한 테이블을 조회하는 명령어
 * 
 * 	연습 자료) 수업자료_제 04 장 SQL(정보보호회피)
 * 
 * SQL 명령어팁
 * 
 * 	1. 휴지통(recyclebin)
 * 			
 * 		a. show recyclebin;       
 * 			=> 휴지통에 있는 테이블을 조회
 * 
 * 		b. flashback table 테이블명 to before drop;       
 * 			=> 삭제된 테이블을 복원
 * 
 * 		c. drop table 테이블명 purge;      
 * 			=> 휴지통에 남기지 않고 완전 삭제
 * 
 * 		d. purge table 테이블명;       
 * 			=> 휴지통에 있는 테이블 완전 삭제
 * 
 * 		e. purge recyclebin;      
 * 			=> 휴지통 비우기
 * 
 * 		-> 테이블 삭제 순서
 * 			1) 외래키가 없을 때: 삭제하는 순서가 없다
 * 
 * 			2) 외래키가 있을 때: 외래키를 생성한 테이블부터 삭제해서 기본키 테이블순으로 삭제
 * 
 * 	2. 테이블명 변경
 * 
 * 		a. alter table [원본 테이블명] rename to [바꾸려는 테이블명];
 * 
 * 
 * 	3. 입력한 데이터를 DB에 저장하는 법
 *
 * 		a. commit;
 * 
 * 
 */
