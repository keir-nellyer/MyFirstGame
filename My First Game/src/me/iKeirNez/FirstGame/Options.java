package me.iKeirNez.FirstGame;

import java.awt.Color;
import java.awt.event.KeyEvent;

public class Options {
	
	// Version of the "game"
	public static double version = 0.3;
	
	// Width and Height of the Rectangle
	public static int CharacterWidth = 24;
	public static int CharacterHeight = 36;
	
	// Where should the Rectangle (re)spawn
	public static int spawnX = 180;
	public static int spawnY = 180;
	
	// Size of the window
	public static int windowWidth = 600;
	public static int windowHeight = 400;
	
	// The title of the window, the version number will be added to the end.
	public static String windowTitle = "iKeirNez's First Java Game - version ";
	
	// Controls
	public static int rightControl = KeyEvent.VK_D;
	public static int leftControl = KeyEvent.VK_A;
	public static int forwardControl = KeyEvent.VK_W;
	public static int backwardControl = KeyEvent.VK_S;
	public static int respawnControl = KeyEvent.VK_ENTER;
	
	// Allows the user to resize the screen
	public static boolean resizable = true;
	
	// About at the Bottom Right of Screen
	public static String text = "iKeirNez's First Game - Version ";
	public static String font = "Comic Sans MS";
	public static int fontSize = 20;
	public static Color fontColor = Color.WHITE;
	public static int textX = 266;
	public static int textY = 360;
	
	// Background and Rectangle Color Settings
	public static Color background = Color.BLACK;
	public static Color rectColor = Color.RED;
	
	// Movement Speed
	public static int speed = 1;

}
