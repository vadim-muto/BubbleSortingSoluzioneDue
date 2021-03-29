package model;

import java.util.ArrayList;
import java.util.Collections;

import application.ThreadHandler;
import it.unical.mat.embasp.base.Handler;
import it.unical.mat.embasp.base.InputProgram;
import it.unical.mat.embasp.base.OptionDescriptor;
import it.unical.mat.embasp.base.Output;
import it.unical.mat.embasp.languages.IllegalAnnotationException;
import it.unical.mat.embasp.languages.ObjectNotValidException;
import it.unical.mat.embasp.languages.asp.ASPInputProgram;
import it.unical.mat.embasp.languages.asp.ASPMapper;
import it.unical.mat.embasp.languages.asp.AnswerSet;
import it.unical.mat.embasp.languages.asp.AnswerSets;
import it.unical.mat.embasp.platforms.desktop.DesktopHandler;
import it.unical.mat.embasp.specializations.dlv2.desktop.DLV2DesktopService;
import utilities.SortMosse;
import view.GamePanel;

public class Game{
	
	private final String encodingResource = "encodings/ai";
	private Handler handler;
	private InputProgram facts;
	public static  ArrayList<Muovi> mosse;
	
	public Game() {
		facts = new ASPInputProgram();
		mosse = new ArrayList<Muovi>();
		try {
			ASPMapper.getInstance().registerClass(Pallina.class);
			ASPMapper.getInstance().registerClass(Muovi.class);
		} catch (ObjectNotValidException | IllegalAnnotationException e) {
			e.printStackTrace();
		}

		startGame();
	}
		
	private void startGame(){
		try {
			handler = new DesktopHandler(new DLV2DesktopService("lib/dlv2.exe"));

			facts.addFilesPath(encodingResource);

			for (Pallina p : PrimoLivello.getInstance().getPalline())
				facts.addObjectInput(p);

			handler.addProgram(facts);

			handler.addOption(new OptionDescriptor("--no-facts"));

			Output o = handler.startSync();
			AnswerSets answersets = (AnswerSets) o;

			for(AnswerSet a:answersets.getAnswersets()){
				try {
					for (Object obj : a.getAtoms()) {
						if(obj instanceof Pallina)
							continue;
						
						Muovi m = (Muovi) obj;
						mosse.add(m);
					}

					ordinamentoMosse();

				} catch (Exception e) {
					e.printStackTrace();
				} 
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void ordinamentoMosse(){
		Collections.sort(mosse, new SortMosse());

		SceneHandler.getInstance().changePanel(GamePanel.getInstance());

		ThreadHandler.getInstance().addThread();
	}
}
