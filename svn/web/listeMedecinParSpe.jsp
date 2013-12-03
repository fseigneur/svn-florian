<%-- 
    Document   : listeSpe
    Created on : 2 déc. 2013, 11:25:46
    Author     : fseigneur
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<jsp:include page="entete.jsp"/>
<jsp:include page="sommaire.jsp"/>
    <table border="1px solid black" cellspacing="0">
        <tr>
            <th>Nom</th>
            <th>Prénom</th>
            <th>Adresse</th>
            <th>Téléphone</th>
            <th>Spécialité</th>
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
<jsp:include page="pied.jsp"/>
