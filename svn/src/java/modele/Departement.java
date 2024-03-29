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
public class Departement implements Comparable <Departement> {

    private String num;
    private Collection<Medecin> lesMeds = new TreeSet<Medecin>();

    public Departement(String num) {
        this.num = num;
    }

    public String getNum() {
        return num;
    }

    public Collection<Medecin> getLesMeds() {
        return lesMeds;
    }

    @Override
    public int compareTo(Departement t) {
        return num.compareTo(t.num);
    }
   
    void addUnMed(Medecin unMed) {
        lesMeds.add(unMed);
    }
}