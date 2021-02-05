package com.ilv.cahierdescharges.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.util.*

@Parcelize
data class Project(
    val nomClient: String,
    val nomPojet: String,
    val mail: String,
    val dateSoumission: String,
    val TypeSite: String,
    val cibles: List<String>,
    val objectifs: String,
    val datesDebut: String,
    val datesFin: String,
    val secteur: List<String>,
    val creation: Boolean,
    val pages: String,
    val redaction: Boolean,
    val migration: Boolean,
    val charteGraphique: Boolean,
    val communication: Boolean,
    val precisionBesoins: String,
    val fonctionnalite: String,
    val miseajour: Boolean,
    val hebergement: Boolean,
    val pub: Boolean,
    val ecommerce: Boolean,
    val affiliation: Boolean
) : Parcelable

fun generateRandomProject() = Project(
    nomClient = "Guillon Axel",
    nomPojet = "Mon super projet",
    mail = "Axel.guillon@edu.devinci.fr",
    dateSoumission = "01/02/2021",
    TypeSite = "Site vitrine",
    cibles = listOfNotNull("Entreprises", "Associations"),
    objectifs = "Gérer la data de nos clients",
    datesDebut = "11/02/2021",
    datesFin = "25/07/2021",
    secteur = listOfNotNull("Banques / Assurances",
        "Informatique / Telecom",
        "Édition / Communication / Multimédia."
    ),
    creation = true,
    pages = "plus de 10",
    redaction = false,
    migration = false,
    charteGraphique = true,
    communication = true,
    precisionBesoins = "Une page pour éditer des articles",
    fonctionnalite = "Toutes sortes de fonctionnalités",
    miseajour = true,
    hebergement = false,
    pub = true,
    ecommerce = false,
    affiliation = true,
)