package utilities;

import java.awt.Image;
import java.io.IOException;
import java.util.HashMap;

import javax.imageio.ImageIO;

public class GameImage {
	
	private static GameImage instance = null;
	
	public static final String PATH = "/resources/";
	public static final String BACKGROUND_GAME = "Background.png";
	public static final String PLAY_BUTTON = "PlayButton.png";
	public static final String CONTAINER = "Contenitore.png";
	public static final String GAME_PANEL = "GamePanel.png";
	public static final String FINISH_PANEL = "Finish.png";
	
	private HashMap<String, Image> allImages;
	
	public GameImage() {
		allImages = new HashMap<String, Image>();
		
		scaleBackgroundGame();
		scalePlayButtonGame();
		scaleContainerGame();
		scaleFinishPanel();
	}
	
	public static GameImage getInstance() {
		if (instance == null)
			instance = new GameImage();
		return instance;
	}
	
	public void scaleBackgroundGame() {
		Image background, gamePanel;
		try {
			background = ImageIO.read(getClass().getResource(PATH + BACKGROUND_GAME));
			background = background.getScaledInstance(Settings.WIDTH, Settings.HEIGHT, Image.SCALE_SMOOTH);
			allImages.put(BACKGROUND_GAME, background);
			gamePanel = ImageIO.read(getClass().getResource(PATH + GAME_PANEL));
			gamePanel = gamePanel.getScaledInstance(Settings.WIDTH, Settings.HEIGHT, Image.SCALE_SMOOTH);
			allImages.put(GAME_PANEL, gamePanel);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void scalePlayButtonGame() {
		try {
			Image button = ImageIO.read(getClass().getResource(PATH + PLAY_BUTTON));
			button = button.getScaledInstance(Settings.WIDTH_BUTTON, Settings.HEIGHT_BUTTON, Image.SCALE_SMOOTH);
			allImages.put(PLAY_BUTTON, button);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void scaleContainerGame() {
		Image container;
		try {
			container = ImageIO.read(getClass().getResource(PATH + CONTAINER));
			container = container.getScaledInstance(Settings.WIDTH_CONTAINER, Settings.HEIGHT_CONTAINER, Image.SCALE_SMOOTH);
			allImages.put(CONTAINER, container);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void scaleFinishPanel() {
		Image finish;
		try {
			finish = ImageIO.read(getClass().getResource(PATH + FINISH_PANEL));
			finish = finish.getScaledInstance(Settings.DIALOG_WIDTH, Settings.DIALOG_HEIGHT, Image.SCALE_SMOOTH);
			allImages.put(FINISH_PANEL, finish);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Image getImageGame(String image) {
		return allImages.get(image);
	}
}
