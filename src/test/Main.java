package test;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
	public static void main(String[]args) throws IOException, InterruptedException{
		JFrame main = new JFrame("Castle gates");
		main.setSize(740, 521);
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JFrame shop = new JFrame("Shop");
		shop.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		main.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("castle.png")))));
		
		shop.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("market.jpeg")))));
		
		Container content = main.getContentPane();
		content.setLayout(null);
		
		Container content2 = shop.getContentPane();
		content2.setLayout(null);
		
		Box one = Box.createHorizontalBox();
		one.setBounds(0, 0, 80, 25);
		
		Box two = Box.createHorizontalBox();
		two.setBounds(0, 26, 80, 25);
		
		int MPC = 1;
		
		Icon knight1 = new ImageIcon("knight1.png");
		
		JButton button1 = new JButton(knight1);
		button1.setBounds(284, 170, 125, 125);
		
		JButton button2 = new JButton("Shop");
		button2.setBounds(610, 5, 125, 25);
		
		JButton button3 = new JButton("Castle");
		button3.setBounds(610, 5, 125, 25);
		
		JButton button4 = new JButton();
		
		JButton button5 = new JButton();
		
		JButton button6 = new JButton();
		
		JButton button7 = new JButton();
		
		JButton button8  = new JButton();
		
		JButton button9 = new JButton();
		
		JTextField text1 = new JTextField("0");
		text1.setEditable(false);
		text1.setBorder(null);
		text1.setBounds(0, 26, 25, 25);
		
		JTextField text2 = new JTextField("Money per click: ");
		text2.setBounds(0, 51, 100, 25);
		text2.setEditable(false);
		text2.setBorder(null);
		
		JTextField text3 = new JTextField("Money: ");
		text3.setBounds(0, 0, 50, 25);
		text3.setEditable(false);
		text3.setBorder(null);
		
		JTextField text4 = new JTextField("1");
		text4.setEditable(false);
		text4.setBorder(null);
		text4.setBounds(0, 76, 25, 25);
		
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(text1.getText());
				int b = a + MPC;
				text1.setText(String.valueOf(b));
			}
		});
		
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				shop.setBounds(main.getBounds());
				main.setVisible(false);
				shop.setVisible(true);
			}
		});
		
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				shop.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				main.setBounds(shop.getBounds());
				shop.setVisible(false);
				main.setVisible(true);
			}
		});
		
		content.add(button1);
		content.add(button2);
		
		content.add(text1);
		content.add(text2);
		content.add(text3);
		content.add(text4);
		
		content2.add(button3);
		
		main.setVisible(true);
	}
}
