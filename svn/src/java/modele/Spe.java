/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

/**
 *
 * @author fseigneur
 */
public class Spe implements Comparable<Spe> {
    private String num;
    private Collection<Medecin> lesMeds=new TreeSet<Medecin>();

    public Spe(String num) {
        this.num = num;
    }

    public Collection<Medecin> getLesMeds() {
        return lesMeds;
    }

    public String getNum() {
        return num;
    }

    public void addUnMed(Medecin unMed) {
        lesMeds.add(unMed);
    }
    
    @Override
    public int compareTo(Spe t) {
        return num.compareTo(t.num);
    }
}