package application;

import java.util.ArrayList;

import it.unical.mat.embasp.languages.asp.SymbolicConstant;
import model.Muovi;
import model.Pallina;
import model.PrimoLivello;
import view.GamePanel;

public class ThreadRepaint implements Runnable{

    private ArrayList<Muovi> mosse;

    public ThreadRepaint(ArrayList<Muovi> mosse){
        this.mosse = mosse;
    }

    @Override
    public void run() {
		boolean debug = true;

        while (debug){
            for (Muovi m : mosse){
                Pallina pOrigine = new Pallina(m.getColor(), m.getRigaOrigine(), m.getColonnaOrigine(), m.getMossa());
                Pallina pDestinazione = new Pallina(m.getColor(), m.getRigaDestinazione(), m.getColonnaDestinazione(), m.getMossa());
                
                for (Pallina p : PrimoLivello.getInstance().getPalline()){
                    if (p.equals(pOrigine))
                        p.setColor(new SymbolicConstant(Pallina.VUOTA));
                    
                    if (p.equals(pDestinazione))
                        p.setColor(pDestinazione.getColor());
                }

                GamePanel.getInstance().repaint();
            }

            debug = false;
        }
    }
}
