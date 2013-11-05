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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fseigneur
 */
public class DAO {

    public static Collection<Departement> getLesDeps() {

        Collection<Departement> lesDeps = new HashSet<Departement>();
        
        try {
            Connection con = Connect.get();
            Statement req;
            req = con.createStatement();
            ResultSet rs = req.executeQuery("select distinct departement from medecin;");
            while (rs.next()) {
                String departement = rs.getString("departement");
                Collection<Medecin> lesMeds = new HashSet<Medecin>();
                Statement req2;
                req2 = con.createStatement();
                ResultSet rs2 = req2.executeQuery("select * from medecin where departement =" + departement);

                while (rs2.next()) {
                    lesMeds.add(new Medecin(rs2.getString("nom"), rs2.getString("prenom"), rs2.getString("adresse"), rs2.getString("tel"), rs2.getString("specialitecomplementaire"), rs2.getString("id")));
                }
                lesDeps.add(new Departement(rs.getString("departement"), lesMeds));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesDeps;
    }
}