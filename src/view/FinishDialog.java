package view;

import javax.swing.JDialog;

import controller.GameController;
import utilities.Settings;

public class FinishDialog{
	
	private static JDialog dialog;
	
	public FinishDialog() {
		dialog = new JDialog();
		
		dialog.setSize(Settings.DIALOG_WIDTH,Settings.DIALOG_HEIGHT);
		dialog.add(FinishPanel.getInstance());
		dialog.setUndecorated(true);
		dialog.setVisible(true);
		dialog.setLocationRelativeTo(null);
		
		dialog.addKeyListener(new GameController(null));
	}
	
	public static JDialog getDialog() {
		return dialog;
	}
}
