package concept;

public class System_Class {

}
/*
 * 5. System 클래스
 * 	-> 자바 프로그램은 운영체제 상에서 바로 실행되는 것이 아니라 JVM 위에서 실행
 * 		따라서, 운영체제의 모든 기능을 자바 코드로 직접 접근하기란 어렵다
 * 		하지만, java.lang 패키지에 속하는 System 클래스를 이용하면 운영체제의 일부 기능을 이용 가능
 * 
 * 	-> 프로그램 종료, 키보드로부터 입력, 모니터로 출력, 메모리 정리, 현재 시간 읽기,
 * 		시스템 프로퍼티 읽기, 환경 변수 읽기 등
 * 
 * 5-1. 시스템 프로퍼티 읽기: getProperty()
 * 	(1) java.version
 * 		-> 자바의 버전
 * 		ex) 1.8.0_20
 * 
 * 	(2) java.home
 * 		-> 사용하는 JRE의 파일 경로 : <jdk 설치 경로>\jre
 * 
 * 	(3) os.name
 * 		-> Operating system name
 * 		ex) Window 7
 * 
 * 	(4) file.separator
 * 		-> File separator("/" or UNIX) : \
 * 
 * 	(5) user.name 
 * 		-> 사용자의 이름 : 사용자 계정명
 * 
 * 	(6) user.home 
 * 		-> 사용자의 홈 디렉토리 : C:\Users\사용자 계정명
 * 
 * 	(7) user.dir
 * 		-> 사용자가 현재 작업 중인 디텍토리 경로 : 매우 다양
 * 
 * 	ex) ex02_getProperty	
 * 
 * 5-2. 환경 변수 읽기: getenv()
 * 
 * 	ex) ex03_getenv
 * 
 * 
 * 
 */
