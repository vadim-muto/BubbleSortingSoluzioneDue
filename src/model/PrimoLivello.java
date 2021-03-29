package model;

import java.util.ArrayList;

import it.unical.mat.embasp.languages.asp.SymbolicConstant;

public class PrimoLivello {
	
	private static PrimoLivello instance = null;
	
	private ArrayList<Pallina> palline;
	
	private PrimoLivello() {
		palline = new ArrayList<Pallina>();
		creaLivello();
	}
	
	public static PrimoLivello getInstance() {
		if (instance == null)
			instance = new PrimoLivello();
		return instance;
	}
	
	public ArrayList<Pallina> getPalline() {
		return palline;
	}
	
	public void clearAll() {
		palline.clear();
	}

	public void creaLivello() {
		palline.add(new Pallina(new SymbolicConstant(Pallina.GIALLA),0,0,0));
		palline.add(new Pallina(new SymbolicConstant(Pallina.BLU),1,0,0));
		palline.add(new Pallina(new SymbolicConstant(Pallina.GIALLA),2,0,0));
		palline.add(new Pallina(new SymbolicConstant(Pallina.ROSSA),3,0,0));

		palline.add(new Pallina(new SymbolicConstant(Pallina.BLU),0,1,0));
		palline.add(new Pallina(new SymbolicConstant(Pallina.BLU),1,1,0));
		palline.add(new Pallina(new SymbolicConstant(Pallina.ROSSA),2,1,0));
		palline.add(new Pallina(new SymbolicConstant(Pallina.ROSSA),3,1,0));

		palline.add(new Pallina(new SymbolicConstant(Pallina.GIALLA),0,2,0));
		palline.add(new Pallina(new SymbolicConstant(Pallina.GIALLA),1,2,0));
		palline.add(new Pallina(new SymbolicConstant(Pallina.ROSSA),2,2,0));
		palline.add(new Pallina(new SymbolicConstant(Pallina.BLU),3,2,0));

		palline.add(new Pallina(new SymbolicConstant(Pallina.VUOTA),0,3,0));
		palline.add(new Pallina(new SymbolicConstant(Pallina.VUOTA),1,3,0));
		palline.add(new Pallina(new SymbolicConstant(Pallina.VUOTA),2,3,0));
		palline.add(new Pallina(new SymbolicConstant(Pallina.VUOTA),3,3,0));

		palline.add(new Pallina(new SymbolicConstant(Pallina.VUOTA),0,4,0));
		palline.add(new Pallina(new SymbolicConstant(Pallina.VUOTA),1,4,0));
		palline.add(new Pallina(new SymbolicConstant(Pallina.VUOTA),2,4,0));
		palline.add(new Pallina(new SymbolicConstant(Pallina.VUOTA),3,4,0));
	}
}
