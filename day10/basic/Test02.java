package day10.basic;

import javax.swing.JOptionPane;

/*
 종료 기능이 있는 메뉴 띄우기 
 */
public class Test02 {
	public static void main(String[] args) {
		String menu = "1. 체크인 \n"
					+ "2. 체크아웃 \n"
					+ "3. 현황 보기 \n"
					+ "0. 종료";
		String select;
		
		loop: while(true) {
			select = JOptionPane.showInputDialog(null, menu);
			switch(select) {
				case "1":{
					int num = Integer.parseInt(JOptionPane.showInputDialog(null, "체크인 하실 방 호수 입력하세요."));
					break;
				}
				case "2": {
					int num = Integer.parseInt(JOptionPane.showInputDialog(null, "체크아웃 하실 방 호수 입력하세요."));
					break;
				}
				case "3":{
					break;
				}
				case "0":{
					JOptionPane.showMessageDialog(null, "프로그램을 종료합니다.");
					break loop;
				}
				default: {
					JOptionPane.showMessageDialog(null, "잘못된 입력!");
				}
			}
		} // while문 끝
	}
}












