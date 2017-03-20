package jokingHazzard;

import javax.swing.JFrame;

import com.sun.glass.ui.Screen;

public class GUI {

	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(false); //  устанавливае стандартный внешний вид
        JFrame frame = new JFrame("Здесь заголовок окна"); // желаемый заголовок        
        // задаём операцию, которая выполниться при закрытии
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300); // задаём размер окна 
        frame.setVisible(true); //  форма будет видимой
        frame.setLocationRelativeTo(null);
	}

}
