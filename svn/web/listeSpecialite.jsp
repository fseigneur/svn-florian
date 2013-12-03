<%-- 
    Document   : listeSpecialite
    Created on : 2 déc. 2013, 11:39:11
    Author     : mmirtil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<jsp:include page="entete.jsp"/>
<jsp:include page="sommaire.jsp"/>
    <h1>Liste des Spécialités</h1>
    <c:forEach var="uneSpe" items="${listeS}">
        <a href = "control?action=listeMedecinParSpe&nomSpe=${uneSpe.num}">
            ${uneSpe.num}
        </a><br/>
    </c:forEach>
<jsp:include page="pied.jsp"/>
