package model;

import it.unical.mat.embasp.languages.Id;
import it.unical.mat.embasp.languages.Param;
import it.unical.mat.embasp.languages.asp.SymbolicConstant;

@Id("in")
public class Pallina {
	
	public static final String BLU = "blu";
	public static final String ROSSA = "rossa";
	public static final String GIALLA = "gialla";
	public static final String VUOTA = "vuota";
	
	@Param(0)
	private SymbolicConstant color;
	
	@Param(1)
	private int riga;
	
	@Param(2)
	private int colonna;

	@Param(3)
	private int mossa;

	private boolean moved;
		
	public Pallina() {
	}
	
	public Pallina(SymbolicConstant color, int riga, int colonna, int mossa) {
		this.color = color;
		this.riga = riga;
		this.colonna = colonna;
		this.mossa = mossa;
	}
	
	public int getRiga() {
		return riga;
	}
	
	public int getColonna() {
		return colonna;
	}
	
	public SymbolicConstant getColor() {
		return color;
	}
	
	public void setColor(SymbolicConstant color) {
		this.color = color;
	}
	
	public void setRiga(int riga) {
		this.riga = riga;
	}
	
	public void setColonna(int colonna) {
		this.colonna = colonna;
	}

	public void setMossa(int mossa) {
		this.mossa = mossa;
	}

	public int getMossa() {
		return mossa;
	}

	public void setMoved(boolean moved) {
		this.moved = moved;
	}

	public boolean getMoved(){
		return moved;
	}
	
	@Override
	public String toString() {
		return "in(" + color.toString() + "," + riga + "," + colonna + ").";
	}
	
	@Override
	public boolean equals(Object obj) {
		Pallina p = null;
		if (obj instanceof Pallina)
			p = (Pallina) obj;
		return p.riga == this.riga && p.colonna == this.colonna;
	}
	
}
