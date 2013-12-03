<%-- 
    Document   : listeDepartement
    Created on : 12 nov. 2013, 11:33:29
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
        <title>Liste Departement</title>
    </head>
    <body>
        <h1>Liste des Departements</h1>
    <c:forEach var="unDepartement" items="${listeD}">
        <a href = "control?action=listeParDep&dep=${unDepartement.num}">
            ${unDepartement.num}
        </a><br/>
    </c:forEach>
    </body>
    <jsp:include page="pied.jsp"/>
</html>