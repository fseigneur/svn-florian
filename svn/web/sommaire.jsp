<%-- 
    Document   : sommaire
    Created on : 19 nov. 2013, 12:49:24
    Author     : fseigneur
--%>
    <!-- Division pour le sommaire -->
<div id="menuGauche">
    <div id="infosUtil">

        <h2>

        </h2>

    </div>  
    <ul id="menuList">
        <!--
        <li >
            Visiteur :<br>
            <?php echo $_SESSION['prenom']."  ".$_SESSION['nom']  ?>
        </li> --->
        <li class="smenu">
            <a href = "Controleur?action=listeParDep">Liste des Départements</a>
        </li>
        <li class="smenu">
            <a href = "Controleur?action=listeParNom">Recherche d'un médecin</a>
        </li>
    </ul>

</div>
