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
public class Pays {

    private Collection<Departement> lesDeps = new HashSet<Departement>();

    public Pays() {
        lesDeps = DAO.getLesDeps();
    }

    public Collection<Departement> getLesDeps() {
        return lesDeps;
    }

    public Departement getLeDep(String numDep) {
        for (Departement d : lesDeps) {
            if (numDep.equals(d.getNum())) {
                return d;
            }
        }
        return null;
    }
}