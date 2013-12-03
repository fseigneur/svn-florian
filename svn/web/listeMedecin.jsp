<%-- 
    Document   : listeMedecin
    Created on : 12 nov. 2013, 12:34:43
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
        <title>Liste Medecin</title>
    </head>
    <body>
        <h1>Liste des Medecins</h1>
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
    <jsp:include page="pied.jsp"/>
</html>