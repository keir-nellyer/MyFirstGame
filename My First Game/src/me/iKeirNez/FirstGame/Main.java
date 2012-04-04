package me.iKeirNez.FirstGame;

import javax.swing.JFrame;

public class Main {
	
	public static Display f = new Display();
	
	public static int w = 600;
	public static int h = 400;
	public static String version = "1.0";
	
	public static void main(String args[]){
		f.setSize(w, h);
		f.setResizable(true);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("iKeirNez's First Java Game - v." + version);
		f.setLocationRelativeTo(null);
		f.setAlwaysOnTop(false);
	}

}
