<%-- 
    Document   : menu
    Created on : 19 nov. 2013, 14:27:58
    Author     : fseigneur
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
                <jsp:include page="entete.jsp"/>
        <jsp:include page="sommaire.jsp"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        <h1>Choix</h1>
        <a href = "control?action=listeParDep">Liste des Départements</a>
        <a href = "control?action=listeParNom">Recherche d'un médecin</a>
        <a href = "control?action=listeMedecinParSpe">Recherche par Spécialité</a>
    </body>
    <jsp:include page="pied.jsp"/>
</html>
