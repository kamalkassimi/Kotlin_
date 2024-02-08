package com.example.controle_kotlin
enum class NiveauScolaires{
     _1ere_annes,_2ere_annes;
}

class Etudiant(var code:Int,var nom:String ,var age:Int ,var Note:Double ,var NiveauScolaire:String) {
    constructor():this(19, "nom", 13, 36.4, "NiveauScolaires._1ere_annes")
    constructor(niveauScolaires: NiveauScolaires) : this()
    constructor(code: Int,nom: String,age: Int):this();
    init {
        fun  validNiveauScolaire():Boolean{
            if (NiveauScolaire=="1anne" || NiveauScolaire=="2anns"){
               return true;

            }else{
                NiveauScolaire == "1anne"
                return false
            }
        }

    }
}