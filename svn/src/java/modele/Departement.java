/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.Collection;
import java.util.HashSet;

/**
 *
 * @author fseigneur
 */
public class Departement {

    private String num;
    private Collection<Medecin> lesMeds;

    public Departement(String num, Collection<Medecin> lesMeds) {
        this.num = num;
        this.lesMeds = lesMeds;
    }

    public String getNum() {
        return num;
    }

    public Collection<Medecin> getLesMeds() {
        return lesMeds;
    }
}