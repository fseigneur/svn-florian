/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.TreeSet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modele.*;


/**
 *
 * @author fseigneur
 */
public class control extends HttpServlet {

    private Pays p;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        p = new Pays();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String dep = request.getParameter("dep");
        String action = request.getParameter("action");
        String nomSpe = request.getParameter("nomSpe");
        String page = "";
        if (action == null) {
            page = "menu.jsp";



        } else if (action.equals("listeParDep")) {
            if (dep == null) {
                Collection<Departement> listeDep = p.getLesDeps();
                request.setAttribute("listeD", listeDep);
                page = "listeDepartement.jsp";
            } else {
                Collection<Medecin> listeMed = p.getLeDep(dep).getLesMeds();
                request.setAttribute("listeM", listeMed);
                page = "listeMedecin.jsp";

            }

        } else if (action.equals("listeParNom")) {
            page = "rechercheNom.jsp";
            String nomMedecin = request.getParameter("nomMedecin");
            if (nomMedecin != null) {
                Collection<Medecin> lesMeds = new TreeSet<Medecin>();
                for (Departement Dep : p.getLesDeps()) {
                    for (Medecin m : Dep.getLesMeds()) {
                        if (m.getNom().startsWith(nomMedecin)) {
                            lesMeds.add(m);
                        }
                    }
                }
                request.setAttribute("listeM", lesMeds);

            }

        }else if (action.equals("listeMedecinParSpe")) {
            
            if (nomSpe == null) {
                Collection<Spe> ls = p.getLesSpes();
                request.setAttribute("listeS", ls);
                page = "listeSpecialite.jsp";
            } else {
                Collection<Medecin> lm = p.getLaSpe(nomSpe).getLesMeds();
                request.setAttribute("listeM", lm);
                request.setAttribute("nomSpe", nomSpe);
                page = "listeMedecinParSpe.jsp";
            }
        } else {
            page = "index.jsp";
        }
        request.getRequestDispatcher(page).forward(request, response);

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
