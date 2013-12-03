/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fseigneur
 */
public class DAO {

    public static Collection<Departement> getLesDeps() {


        Collection<Departement> lesDeps = new TreeSet<Departement>();
        try {
            Statement req;
            Connection con = Connect.get();          
            req = con.createStatement();    
            ResultSet rs;
            rs = req.executeQuery("Select DISTINCT departement from medecin order by departement ASC");
            //Parcours
            while (rs.next()) {
                String numDep = rs.getString(1);
                lesDeps.add(new Departement(numDep)); 
                }                               
            rs.close();
            req.close();
        } catch (SQLException ex) {
            Logger.getLogger(Pays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesDeps;
    }
 
    public static Collection<Spe> getLesSpes() {
        Collection<Spe> lesSpe = new TreeSet<Spe>();
        try {
            Statement req;
            Connection con = Connect.get();          
            req = con.createStatement();    
            ResultSet rs;
            rs = req.executeQuery("Select DISTINCT specialitecomplementaire from medecin where specialitecomplementaire is NOT NULL");
            while (rs.next()) {
                String spe = rs.getString(1);
                Spe uneSpe = new Spe(spe);
                lesSpe.add(uneSpe);      
            }
            rs.close();
            req.close();
        } catch (SQLException ex) {
            Logger.getLogger(Pays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesSpe;
    }
    
    public static Collection<Medecin> getLesMeds() {
        Collection<Medecin> lesMed = new TreeSet<Medecin>();
        try {
            Statement req;
            Connection con = Connect.get();          
            req = con.createStatement();    
            ResultSet rs;
            rs = req.executeQuery("Select * from medecin;");
             while (rs.next()) {
                 String id = rs.getString("id");
                    String nom = rs.getString("nom");
                    String prenom = rs.getString("prenom");
                    String adresse = rs.getString("adresse");
                    String tel = rs.getString("tel");
                    String spe = rs.getString("specialitecomplementaire");
                    String dep = rs.getString("departement");
                    lesMed.add(new Medecin(nom, prenom, adresse, tel, spe, id, dep));
             } 
        } catch (SQLException ex) {
            Logger.getLogger(Pays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesMed;
    }
        
}   