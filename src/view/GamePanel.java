package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.Time;

import javax.swing.JLabel;
import javax.swing.JPanel;

import model.Pallina;
import model.PrimoLivello;
import utilities.GameImage;
import utilities.Settings;

public class GamePanel extends JPanel{

	private static final long serialVersionUID = 1L;
	private static GamePanel instance = null;
	private Image backgroundImage;
	private int numProvette;
	private final int TIME = 1000;
	
	private GamePanel() {
		this.setLayout(null);
		backgroundImage = GameImage.getInstance().getImageGame(GameImage.GAME_PANEL);

		JLabel info = new JLabel();
		info.setText("Premi ESC per uscire dal gioco");
		info.setForeground(Color.WHITE);
		info.setBackground(Color.BLACK);
		
		info.setBounds(Settings.LABEL_X, Settings.LABEL_Y, Settings.LABEL_WIDTH, Settings.LABEL_HEIGHT);
		this.add(info);

		numProvette = 0;
	}
	
	public static GamePanel getInstance() {
		if(instance == null)
			instance = new GamePanel();
		return instance;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(backgroundImage, 0, 0, null);
		drawContainer(g);
	}

	private void drawContainer(Graphics g) {
		
		int distanza = Settings.DISTANCE_CONTAINER;
		int block = Settings.BLOCK;
		
		for (int i=0; i<numProvette; i++) {
			Image img = GameImage.getInstance().getImageGame(GameImage.CONTAINER);
			g.drawImage(img, i * block + distanza, Settings.CONTAINER_Y, null);
			distanza += Settings.SUM;
		}
		
		for (Pallina p : PrimoLivello.getInstance().getPalline()) {
			distanza = Settings.DISTANCE_BALLS;
			switch (p.getColonna()) {
				case 0:
					distanza = Settings.DISTANCE_BALLS;
					break;
				case 1:
					distanza += Settings.SUM;
					break;
				case 2:
					distanza += Settings.SUM * 2;
					break;
				case 3:
					distanza += Settings.SUM * 3;
					break;
				case 4:
					distanza += Settings.SUM * 4;
					break;
				case 5:
					distanza += Settings.SUM * 5;
					break;
				case 6:
					distanza += Settings.SUM * 6;
					break;
				case 7:
					distanza += Settings.SUM * 7;
					break;
				case 8:
					distanza += Settings.SUM * 8;
					break;
				default:
					break;
			}
			switch (p.getColor().toString()) {
				case Pallina.BLU:
					g.setColor(Color.BLUE);
					break;
				case Pallina.GIALLA:
					g.setColor(Color.YELLOW);
					break;
				case Pallina.ROSSA:
					g.setColor(Color.RED);
					break;
				default:
					g.setColor(Color.WHITE);
					break;
			}

			//int distanzaVuota = setDistanza(p.getColonna());
			
			//g.fillOval(p.getColonna() * block + distanzaVuota, Settings.SUM_BLOCK - 40, Settings.BALL_SIZE, Settings.BALL_SIZE);
			g.fillOval(p.getColonna() * block + distanza, p.getRiga() * block + Settings.SUM_BLOCK, Settings.BALL_SIZE, Settings.BALL_SIZE);
		}
	}

	public void setNumProvette(int numProvette) {
		this.numProvette = numProvette;
	}
	
	public int setDistanza(int colonna) {
		int distanza = Settings.DISTANCE_BALLS;
		switch (colonna) {
			case 0:
				distanza = Settings.DISTANCE_BALLS;
				break;
			case 1:
				distanza += Settings.SUM;
				break;
			case 2:
				distanza += Settings.SUM * 2;
				break;
			case 3:
				distanza += Settings.SUM * 3;
				break;
			case 4:
				distanza += Settings.SUM * 4;
				break;
			case 5:
				distanza += Settings.SUM * 5;
				break;
			case 6:
				distanza += Settings.SUM * 6;
				break;
			default:
				break;
		}
		return distanza;
	}
}
