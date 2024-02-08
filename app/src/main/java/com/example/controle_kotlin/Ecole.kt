package com.example.controle_kotlin

class Ecole(var id:Int, var nom:String, var  listeFromateur:MutableList<Fromateur> = mutableListOf(), var listEtdiants:MutableList<Etudiant> =mutableListOf()){

    fun  ajouterlisteFromateur(a:Fromateur): Boolean {
       return listeFromateur.add(a)
    }
    fun  ajouterlisteEtdiants(a1:Etudiant): Boolean {
        return listEtdiants.add(a1)
    }

}