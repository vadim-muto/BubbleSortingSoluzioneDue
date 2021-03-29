package utilities;

import java.util.Comparator;

import model.Muovi;

public class SortMosse implements Comparator<Muovi>{

    @Override
    public int compare(Muovi o1, Muovi o2) {
        return o1.getMossa().compareTo(o2.getMossa());
    }
    
}
