package utilities;

import java.awt.Image;

import javax.swing.ImageIcon;

public class ScaleImage {
	
	private static ScaleImage instance = null;
	
	private ScaleImage() {
	}
	
	public static ScaleImage getInstance() {
		if (instance == null)
			instance = new ScaleImage();
		return instance;
	}
	
	public ImageIcon scaleButtonImage(Image img, int type) {
		img = img.getScaledInstance(Settings.WIDTH_BUTTON - 5, Settings.HEIGHT_BUTTON - 5, Image.SCALE_SMOOTH);
		return new ImageIcon(img);
	}
	
}
