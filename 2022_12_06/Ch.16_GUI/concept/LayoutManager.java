package concept;

public class LayoutManager {

}
/*
 * 2. LayoutManager
 * 
 * 	1) 정의
 * 		- Container 안에서 Component를 원하는 위치에 배치할 수 있게 해주는 요소
 * 		- Container는 기본 배치 관리자를 갖고 있음
 * 	
 * 	2) 종류
 * 
 * 	(1) BorderLayout
 * 		- Frame의 기본 배치 관리자
 * 		- 화면을 5개의 영역으로 구분
 * 			-> 위쪽: North
 * 			-> 아래쪽: South
 * 			-> 왼쪽: West
 * 			-> 오른쪽: East
 * 			-> 가운데: Center 	
 * 		- Component들의 크기는 변경되지만, 위치는 변하지 않음
 * 		
 * 		ex) ex02_BorderLayout
 * 
 * 	(2) FlowLayout
 * 		- Panel의 기본 배치 관리자
 * 		- 수평으로 Component를 나열
 * 		- 윈도우 화면 크기 변경시 Component 크기는 변하지 않지만,
 * 			위치는 변경될 수 있음
 * 
 * 		ex) ex03_FlowLayout
 * 	
 * 	(3) GridLayout
 *		- Component를 행과 열로 나누어 배치하고 싶을 때 사용
 *		- 테이블(표) 형태의 배치 관리자
 *		- 생성시, 행과 열을 지정
 *		- Component 추가시 왼쪽에서 오른쪽, 위에서 아래로 추가
 *		
 *		- pack(): Frame의 크기를 Component의 크기에 맞게 조정
 *
 *		ex) ex04_GridLayout
 * 
 * 	(4) Panel
 * 		
 * 		ex) ex05_Panel
 */

