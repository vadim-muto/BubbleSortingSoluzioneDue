package view;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class LabelImage extends JLabel{
	
	public static final int EASY_BUTTON = 0;
	public static final int MEDIUM_BUTTON = 1;
	public static final int HARD_BUTTON = 2;
	public static final int PLAY_BUTTON = 3;

	private static final long serialVersionUID = 1L;
	
	private Integer type;
	private Image img;
	
	public LabelImage(Integer type, Image img) {
		if (img == null)
			return;
		this.type = type;
		this.img = img;
		this.setIcon(new ImageIcon(this.img));
	}
	
	public Integer getType() {
		return type;
	}
	
	public Image getImg() {
		return img;
	}
	
}
