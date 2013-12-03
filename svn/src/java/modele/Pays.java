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
    private Collection<Spe> lesSpes= new HashSet<Spe>();
    private Collection<Departement> lesDeps = new HashSet<Departement>();

    public Pays() {
        lesDeps = DAO.getLesDeps();
        lesSpes = DAO.getLesSpes();
        this.assocMedecins(DAO.getLesMeds());
    }

    public Collection<Departement> getLesDeps() {
        return lesDeps;
    }
    public Collection<Spe> getLesSpes(){
        return lesSpes;
    }
    private void assocMedecins(Collection<Medecin> lesMeds){
        for(Medecin unMed : lesMeds){
            getLeDep(unMed.getLeDep()).addUnMed(unMed);
            Spe uneSpe = getLaSpe(unMed.getSpe());
            if(uneSpe != null){
                uneSpe.addUnMed(unMed);
            }
        }
    }

    public Departement getLeDep(String numDep) {
        for (Departement d : lesDeps) {
            if (numDep.equals(d.getNum())) {
                return d;
            }
        }
        return null;
    }
    
        public Spe getLaSpe(String num) {
        for (Spe uneSpe : lesSpes) {
            if (uneSpe.getNum().equals(num)) {
                return uneSpe;
            }
        }
        return null;
    }
}