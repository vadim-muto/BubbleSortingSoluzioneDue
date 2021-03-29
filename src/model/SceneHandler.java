package model;

import javax.swing.JFrame;
import javax.swing.JPanel;

import application.ThreadHandler;
import controller.GameController;
import utilities.Settings;
import view.GamePanel;
import view.MainPanel;

public class SceneHandler {
	
	private static SceneHandler instance = null;
	
	private JFrame frame;
	
	private SceneHandler() {
		frame = new JFrame("Sort the bubble");

		frame.setSize(Settings.WIDTH, Settings.HEIGHT);
		
		frame.add(MainPanel.getInstance());
		
		frame.setUndecorated(true);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addKeyListener(new GameController(null));
	}
	
	public static SceneHandler getInstance() {
		if (instance == null)
			instance = new SceneHandler();
		return instance;
	}
	
	public void exitGame() {
		System.exit(0);
	}
	
	public void changePanel(JPanel panel) {
		frame.setContentPane(panel);
		frame.revalidate();
	}
}
