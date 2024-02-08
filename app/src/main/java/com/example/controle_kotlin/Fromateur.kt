package com.example.controle_kotlin

class Fromateur(var Matricule:String ,var Nom:String,var prenom:String){
    lateinit var  listeDesMatiereEnseignees:MutableSet<Fromateur>
    fun  effecetrMatiere(A:Fromateur):Boolean{
        return listeDesMatiereEnseignees.add(A);
    }
    fun deleteMatiere(code:String):Boolean{
      for (i in 1..<listeDesMatiereEnseignees.size){
            if (i==code)
      }

          return true;
      }

    }

