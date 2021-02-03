package com.ilv.cahierdescharges.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.util.*

@Parcelize
data class Project(
    val site: String,
    val cibles: List<String>,
    val objectifs: String,
    val datesDebut: String,
    val datesFin: String,
    val secteur: List<String>,
    val creation: Boolean,
    val pages: List<String>,
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
    site = "site vitrine",
    cibles = listOfNotNull("Entreprises", "Associations"),
    objectifs = "Le but est de gérer les data de nos clients, pouvoir tout centraliser.",
    datesDebut = "11/02/2021",
    datesFin = "25/07/2021",
    secteur = listOfNotNull("Banques / Assurances",
        "Informatique / Telecom",
        "Édition / Communication / Multimédia."
    ),
    creation = true,
    pages = listOfNotNull(
        "One page",
        "2 à 5",
        "5 à 9",
        "plus de 10"
    ),
    redaction = false,
    migration = false,
    charteGraphique = true,
    communication = true,
    precisionBesoins = "Nous avons besoin d'une page pour éditer des articles",
    fonctionnalite = "Toutes sortes de fonctionnalités",
    miseajour = true,
    hebergement = false,
    pub = true,
    ecommerce = false,
    affiliation = true,
)