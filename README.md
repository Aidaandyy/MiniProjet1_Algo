Présentation du Projet
Ce projet Java simule le fonctionnement interne d'une compagnie aérienne. 
Il permet de gérer les équipages, la logistique des vols (avions, aéroports) et le cycle de vie des réservations passagers.

Développé dans le cadre du cycle d'ingénieur à l'ISEP, ce programme met en application les principes fondamentaux de la Programmation Orientée Objet (POO).

Architecture du Projet
Le projet est structuré autour de deux piliers fondamentaux :

👥 Bloc Humain (BlocHumain)
Ce bloc centralise la gestion de toutes les entités physiques du système via une hiérarchie de classes :

Classe Mère Personne : Contient les attributs communs (nom, contact, adresse).

Héritage Passager : Gère les clients, leurs passeports et leurs listes de réservations.

Héritage Employe : Classe intermédiaire pour le personnel, déclinée en Pilote (avec gestion des licences) et PersonnelCabine (avec qualifications).

✈️ Bloc Logistique (BlocLogistique)
Ce bloc gère l'aspect opérationnel et matériel de la compagnie :

Vol : La classe pivot qui lie un équipage, un avion, une origine et une destination. Elle gère la planification et les annulations.

Avion : Gère les caractéristiques techniques et la disponibilité de la flotte.

Aeroport : Gère les infrastructures de départ et d'arrivée.

Reservation : Assure la liaison logique entre un passager du Bloc Humain et un vol du Bloc Logistique.
