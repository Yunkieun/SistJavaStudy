/*
 *  클래스 구성요소 (6)
 *  -----------
 *   1) 변수 (멤버변수) ***
 *      인스턴스 변수 / 클래스 변수 (static)
 *      각자 저장      공통 저장
 *   2) 메소드 : 특정 작업을 수행하는 명령문의 집합
 *             ------- 사용자가 요청한 내용 (로그인, 회원가입, 게시판 목록, 게시판 상세, 예매, 결제...)
 *                     --------------- 사용자가 보내준 값, 처리 결과값
 *                                     --------------  --------
 *                                     매개변수           리턴형
 *                                     
 *        유형
 *        -------------------------------------
 *          리턴형               매개변수
 *        -------------------------------------
 *           O                    O
 *        -------------------------------------
 *           O                    X
 *        -------------------------------------
 *           X                    O back() , go(-2)
 *        -------------------------------------
 *           X                    X
 *        -------------------------------------
 *        
 *        메소드 종류
 *        --------
 *         ***** => 인스턴스 메소드 : 다른 메모리에 저장(각자 다르게 동작)
 *                  void display()
 *                  {
 *                  }
 *               => 클래스 메소드 : static => 메모리에 저장된다(공유) ==> 한글변환, 메뉴 클릭
 *                  static void display()
 *                  {
 *                  }
 *               => 추상 메소드 : 선언부 / 구현부
 *                             -----
 *                  abstract void display(); => 이벤트 처리, 데이터베이스
 *        메소드 사용 이유
 *        ------------
 *        
 *   3) 생성자
 *   --------------
 *   OOP(객체지향의 특성)의 특성
 *   ----------------------
 *    변수 => 데이터를 가지고 가는 사람(해킹)
 *           ------------------- 방지 (캡슐화)
 *    메소드 => 추가 , 수정 ===> 다형성 (오버로딩,오버라이딩) 
 *                                  -------------- 1. 메소드명이 동일
 *    클래스 => 재사용 (상속, 포함)
 *            상속 (is-a) : 변경해서 사용
 *            포함 (has-a) : 있는 그대로 사용
 */
public class 메소드_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
