package com.gt;

import java.util.logging.Logger;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.toedter.calendar.demo.DateChooserPanel;

/**
 * 
 * @author Ganesh Tiwari (gtiwari333@gmail.com)
 * 
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		show();
		JOptionPane.showMessageDialog(null, Calculation.multiply(50, 10));
		
	}

	private static void show() {

		JFrame jf = new JFrame("Hello");
		jf.setSize(500, 250);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.add(new DateChooserPanel());
		jf.setVisible(true);
	}

}
