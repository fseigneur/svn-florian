/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

/**
 *
 * @author fseigneur
 */
public class Medecin implements Comparable<Medecin>{

    private String nom;
    private String prenom;
    private String adresse;
    private String tel;
    private String spe;
    private String id;
    private String dep;

    public Medecin(String nom, String prenom, String adresse, String tel, String spe, String id, String dep) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.tel = tel;
        this.spe = spe;
        this.id = id;
        this.dep = dep;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getSpe() {
        return spe;
    }

    public String getTel() {
        return tel;
    }
    
    public String getLeDep() {
        return dep;
    }
    
    @Override
    public int compareTo(Medecin m) {
        if(nom.compareTo(m.nom) == 0) {
            return prenom.compareTo(m.prenom);
        }
        else {
            return nom.compareTo(m.nom);
        }
    }
}
