package model;

import it.unical.mat.embasp.languages.Id;
import it.unical.mat.embasp.languages.Param;
import it.unical.mat.embasp.languages.asp.SymbolicConstant;

@Id("muovi")
public class Muovi {
    
    @Param(0)
    private SymbolicConstant color;

    @Param(1)
    private int rigaOrigine;

    @Param(2)
    private int colonnaOrigine;

    @Param(3)
    private int rigaDestinazione;

    @Param(4)
    private int colonnaDestinazione;

    @Param(5)
    private Integer mossa;

    public Muovi(){}

    public void setColor(SymbolicConstant color) {
        this.color = color;
    }

    public SymbolicConstant getColor() {
        return color;
    }

    public void setRigaOrigine(int rigaOrigine) {
        this.rigaOrigine = rigaOrigine;
    }

    public int getRigaOrigine() {
        return rigaOrigine;
    }

    public void setColonnaOrigine(int colonnaOrigine) {
        this.colonnaOrigine = colonnaOrigine;
    }

    public int getColonnaOrigine() {
        return colonnaOrigine;
    }

    public void setRigaDestinazione(int rigaDestinazione) {
        this.rigaDestinazione = rigaDestinazione;
    }

    public int getRigaDestinazione() {
        return rigaDestinazione;
    }

    public void setColonnaDestinazione(int colonnaDestinazione) {
        this.colonnaDestinazione = colonnaDestinazione;
    }

    public int getColonnaDestinazione() {
        return colonnaDestinazione;
    }

    public void setMossa(Integer mossa) {
        this.mossa = mossa;
    }

    public Integer getMossa() {
        return mossa;
    }

    @Override
    public String toString() {
        return "muovi(" + color + "," + rigaOrigine + "," + colonnaOrigine + "," + rigaDestinazione + "," + colonnaDestinazione + "," + mossa + ").";
    }
}
