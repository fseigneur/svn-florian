<%-- 
    Document   : rechercheNom
    Created on : 19 nov. 2013, 14:44:50
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
        <h1>Rechercher un médecin par son nom</h1>
    <form action="control?action=listeParNom" method="post">
        <input type="text" id="nomMedecin" name="nomMedecin">
        <input type="submit" value="Envoyer">
    </form>
                <table border="1">
            <tr>
            <th>Nom</th>
            <th>Prenom</th>
            <th>Adresse</th>
            <th>Tel</th>
            <th>Spe</th>
            </tr>
            <c:forEach var="unMedecin" items="${listeM}">
                <tr>
                    <td>${unMedecin.nom} </td>
                    <td>${unMedecin.prenom} </td>
                    <td>${unMedecin.adresse} </td>
                    <td>${unMedecin.tel} </td>
                    <td>${unMedecin.spe} </td>
                </tr>
            </c:forEach>
        </table>
</body>
</html>
