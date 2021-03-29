package utilities;

import java.awt.GraphicsEnvironment;

public class Settings {
	
	public static final int WIDTH = (int) (GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDisplayMode().getWidth() / 1.745); //1100
	public static final int HEIGHT = (int) (GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDisplayMode().getHeight() / 2.4); //450
	public static final int MAIN_BUTTON_X = (int) (WIDTH/2.2);
	public static final int PLAY_BUTTON_Y = (int) (HEIGHT/1.8);
	public static final int EASY_BUTTON_Y = (int) (HEIGHT/1.8);
	public static final int MEDIUM_BUTTON_Y = (int) (HEIGHT/1.45);
	public static final int HARD_BUTTON_Y = (int) (HEIGHT/1.216);
	public static final int LABEL_X = (int) (WIDTH/1.294);
	public static final int LABEL_Y = (int) (HEIGHT/1.125);
	public static final int LABEL_WIDTH = (int) (WIDTH/3.664);
	public static final int LABEL_HEIGHT = HEIGHT/15;
	
	public static final int WIDTH_BUTTON = WIDTH/9;
	public static final int HEIGHT_BUTTON = HEIGHT/8;
	public static final int WIDTH_CONTAINER = WIDTH/22;
	public static final int HEIGHT_CONTAINER = (int) (HEIGHT/3.9);
	public static final int WIDTH_BUTTON_REFRESH = (int) (WIDTH/27.5);
	public static final int HEIGHT_BUTTON_REFRESH = (int) (HEIGHT/11.2);
	public static final int WIDTH_BUTTON_MENU = (int) (WIDTH/27.5);
	public static final int HEIGHT_BUTTON_MENU = (int) (HEIGHT/11.2);
	public static final int MENU_BUTTON_X = (int) (WIDTH/2.244);
	public static final int REFRESH_BUTTON_X = (int) (WIDTH/1.946);
	public static final int MENU_BUTTON_Y = (int) (HEIGHT/1.139);
	public static final int DISTANCE_CONTAINER = (int) (WIDTH/4.78);
	public static final int DISTANCE_BALLS = (int) (HEIGHT/1.859);
	public static final int BLOCK = WIDTH/44;
	public static final int SUM = (int) (WIDTH/15.7);
	public static final int BALL_SIZE = HEIGHT/18;
	public static final int SUM_BLOCK = (int) (WIDTH/5.238);
	public static final int CONTAINER_Y = (int) (WIDTH/5.5);
	
	public static final int DIALOG_WIDTH = (int) (WIDTH/2.2);
	public static final int DIALOG_HEIGHT = (int) (HEIGHT/1.125);
}
