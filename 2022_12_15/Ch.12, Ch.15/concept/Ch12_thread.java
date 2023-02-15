package concept;

public class Ch12_thread {

}
/*
 * 12. 멀티 쓰레드
 * 
 * 	1) 프로그램
 * 		- 실행 파일(.exe)을 더블 클릭하여 실행(run)할 때
 * 
 * 	2) 프로세스
 * 		- 실행 중인 하나의 어플리케이션
 * 		- 하나의 어플리케이션은 다중 프로세스를 만들기도 함
 * 
 * 	3) 작업 쓰레드 생성과 실행
 * 		
 * 		(1) Thread 클래스로부터 직접 생성
 * 			
 * 			a. 쓰레드 생성
 * 				Thread thread = new Thread(Runnable target);
 * 
 * 			b. Runnable: 작업 쓰레드가 실행할 수 있는 코드를 가지고 있는 객체
 * 				
 * 				ex1)
 * 				class Task implements Runnable {
 * 					public void run() {
 * 						쓰레드가 실행할 코드;
 * 					}
 * 				}
 * 
 * 				ex2)
 * 				Runnable task = new Task();
 * 				Thread thread = new Thread(task);
 * 
 * 				ex3)
 * 				Thread thread = new Thread(new Runnable() {
 * 					public void run() {
 * 						쓰레드가 실행할 코드;
 * 					}
 * 				});
 * 
 * 				ex4)
 * 				Thread thread = new Thread(() -> {
 * 						쓰레드가 실행할 코드;
 * 				});
 * 
 * 			c. 작업 쓰레드는 start() 메소드를 다음과 같이 호출해야만 실행됨
 * 				 thread.start();
 * 
 * 		(2) Thread 하위 클래스로부터 생성
 * 			
 * 				
 * 
 * 
 * 
 */
