package day10.basic;

import javax.swing.JOptionPane;

/*
 ���� ����� �ִ� �޴� ���� 
 */
public class Test02 {
	public static void main(String[] args) {
		String menu = "1. üũ�� \n"
					+ "2. üũ�ƿ� \n"
					+ "3. ��Ȳ ���� \n"
					+ "0. ����";
		String select;
		
		loop: while(true) {
			select = JOptionPane.showInputDialog(null, menu);
			switch(select) {
				case "1":{
					int num = Integer.parseInt(JOptionPane.showInputDialog(null, "üũ�� �Ͻ� �� ȣ�� �Է��ϼ���."));
					break;
				}
				case "2": {
					int num = Integer.parseInt(JOptionPane.showInputDialog(null, "üũ�ƿ� �Ͻ� �� ȣ�� �Է��ϼ���."));
					break;
				}
				case "3":{
					break;
				}
				case "0":{
					JOptionPane.showMessageDialog(null, "���α׷��� �����մϴ�.");
					break loop;
				}
				default: {
					JOptionPane.showMessageDialog(null, "�߸��� �Է�!");
				}
			}
		} // while�� ��
	}
}












