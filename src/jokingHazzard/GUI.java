package jokingHazzard;

import javax.swing.JFrame;

import com.sun.glass.ui.Screen;

public class GUI {

	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(false); //  ������������ ����������� ������� ���
        JFrame frame = new JFrame("����� ��������� ����"); // �������� ���������        
        // ����� ��������, ������� ����������� ��� ��������
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300); // ����� ������ ���� 
        frame.setVisible(true); //  ����� ����� �������
        frame.setLocationRelativeTo(null);
	}

}
