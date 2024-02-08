package com.example.controle_kotlin

class Fromateur(var Matricule:String ,var Nom:String,var prenom:String,var listeDesMatiereEnseignees:MutableSet<Matiere> = mutableSetOf())  {
    fun  effecetrMatiere(A:Matiere):Boolean{
        return listeDesMatiereEnseignees.add(A);
    }
    fun deleteMatiere(code:Fromateur):Boolean{
//        listeDesMatiereEnseignees.remove()
        return true;
      }





    }

