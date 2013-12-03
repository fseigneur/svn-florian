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
            <a href = "control?action=listeParDep">Liste des Départements</a>
        </li>
        <li class="smenu">
            <a href = "control?action=listeParNom">Recherche d'un médecin</a>
        </li>
        <li class="smenu">
            <a href = "control?action=listeMedecinParSpe">Recherche d'un médecin par spécialité</a>
        </li>
    </ul>

</div>
