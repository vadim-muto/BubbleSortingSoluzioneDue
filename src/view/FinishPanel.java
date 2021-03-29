package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import utilities.GameImage;

public class FinishPanel extends JPanel{

	private static final long serialVersionUID = 1L;
	
	private static FinishPanel instance = null;
	private JLabel mainButton;
	private Image finishImage;
	
	private FinishPanel() {
		mainButton = new JLabel();
		mainButton.setForeground(Color.WHITE);
		mainButton.setText("Premi Q per tornare al menù principale");
		
		finishImage = GameImage.getInstance().getImageGame(GameImage.FINISH_PANEL);
		
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		mainButton.setAlignmentX(Box.CENTER_ALIGNMENT);
		this.add(Box.createVerticalGlue());
		this.add(Box.createVerticalGlue());
		this.add(Box.createVerticalGlue());
		this.add(Box.createVerticalGlue());
		this.add(mainButton);
		this.add(Box.createVerticalGlue());
	}
	
	public static FinishPanel getInstance() {
		if (instance == null)
			instance = new FinishPanel();
		return instance;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(finishImage, 0, 0, null);
	}

}
