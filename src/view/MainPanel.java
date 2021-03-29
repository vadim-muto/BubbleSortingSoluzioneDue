package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.GameController;
import utilities.GameImage;
import utilities.Settings;

public class MainPanel extends JPanel{

	private static final long serialVersionUID = 1L;
	private static MainPanel instance = null;
	
	private Image backgroundImage;
	
	private MainPanel() {
		backgroundImage = GameImage.getInstance().getImageGame(GameImage.BACKGROUND_GAME);
		
		this.setLayout(null);	

		Image playButton = GameImage.getInstance().getImageGame(GameImage.PLAY_BUTTON);
		LabelImage labelPlayButton = new LabelImage(LabelImage.PLAY_BUTTON, playButton);
		labelPlayButton.addMouseListener(new GameController(labelPlayButton));

		labelPlayButton.setBounds(Settings.MAIN_BUTTON_X, Settings.PLAY_BUTTON_Y, Settings.WIDTH_BUTTON, Settings.HEIGHT_BUTTON);
		this.add(labelPlayButton);

		JLabel info = new JLabel();
		info.setText("Premi ESC per uscire dal gioco");
		info.setForeground(Color.WHITE);
		info.setBackground(Color.BLACK);
		
		info.setBounds(Settings.LABEL_X, Settings.LABEL_Y, Settings.LABEL_WIDTH, Settings.LABEL_HEIGHT);
		this.add(info);
	}
	
	public static MainPanel getInstance() {
		if (instance == null)
			instance = new MainPanel();
		return instance;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(backgroundImage, 0, 0, null);
	}
}
