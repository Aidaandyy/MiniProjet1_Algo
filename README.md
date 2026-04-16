# ✈️ Système de Gestion de Compagnie Aérienne

> **Mini Projet Académique** > 🎓 **Cycle Ingénieur ISEP (A1)** > 👩‍💻 **Développé par Aïda et Laryssa**

---

## 📝 Présentation du Projet
Ce projet Java simule le fonctionnement interne d'une compagnie aérienne. L'objectif est de gérer de manière automatisée les **équipages**, la **logistique des vols** (avions, aéroports) ainsi que le **cycle de vie des réservations** des passagers.

Ce programme met en application les principes fondamentaux de la **Programmation Orientée Objet (POO)**.

---

## 🏗️ Architecture du Projet
Le projet est structuré autour de **deux piliers fondamentaux** pour une séparation claire des responsabilités :

### 👥 1. Bloc Humain (`BlocHumain`)
Ce bloc centralise la gestion de toutes les entités physiques via une hiérarchie de classes optimisée :

* **`Personne` (Classe Mère)** : Contient les attributs communs à tous (nom, contact, adresse).
* **`Passager` (Héritage)** : Gère spécifiquement les clients, leurs informations de passeport et leurs historiques de réservations.
* **`Employe` (Héritage)** : Classe pivot pour le personnel, déclinée en deux spécialisations :
    * `Pilote` : Inclut la gestion des licences de vol et des heures de vol.
    * `PersonnelCabine` : Inclut les qualifications spécifiques au service à bord.



### ✈️ 2. Bloc Logistique (`BlocLogistique`)
Ce bloc gère l'aspect opérationnel et matériel de la compagnie :

* **`Vol`** : La classe pivot. Elle lie un équipage, un avion, une origine et une destination. Elle gère la planification et les annulations.
* **`Avion`** : Gère les caractéristiques techniques (modèle, capacité) et la disponibilité de la flotte.
* **`Aeroport`** : Gère les infrastructures de départ et d'arrivée.
* **`Reservation`** : Assure la **liaison logique** entre un passager (Bloc Humain) et un vol (Bloc Logistique).

---

## 🛠️ Technologies & Concepts utilisés
* **Langage** : Java
* **Concepts POO** : Encapsulation, Héritage, Polymorphisme et Collections (`ArrayList`).
* **Outils** : IntelliJ IDEA, Git & GitHub.


