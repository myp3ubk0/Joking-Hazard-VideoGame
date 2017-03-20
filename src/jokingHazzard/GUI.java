package jokingHazzard;

import javax.swing.*; // импортируем SWING
import java.awt.*; // импортируем все подпакеты AWT

public class GUI {

	public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(false); //  устанавливае стандартный внешний вид
        JFrame frame = new JFrame("Joking Hazzard VideoGame"); // желаемый заголовок   
        // задаём операцию, которая выполниться при закрытии
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300); // задаём размер окна 
        frame.setVisible(true); //  форма будет видимой
        frame.setLocationRelativeTo(null);
        
        JLabel blueLabel = new JLabel("Game in maintance!");
        blueLabel.setLocation(10, 10); /* надпись синего цвета*/
        blueLabel.setSize(300, 100); // размер области надписи
        blueLabel.setHorizontalAlignment(0);
        blueLabel.setForeground(Color.blue); // задаём цвет 
        frame.add(blueLabel); // добавляем на форму эту надпись
	}

}
