package com.example.controle_kotlin

class Ecole(var id:Int , var nom:String){
    lateinit var  listeFromateur:MutableList<String>
    lateinit var listEtdiants:MutableList<String>
    fun  ajouterlisteFromateur(a:Fromateur): Boolean {
       return listeFromateur.add(a.toString())
    }
    fun  ajouterlisteEtdiants(a:String): Boolean {
        return listeFromateur.add(a)
    }

}