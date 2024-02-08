package com.example.controle_kotlin

fun main() {
    var F= Etudiant(66,"hh",13)
    var ecole = Ecole(25,"3563")
    val f = Fromateur("Arabic","kamal","Assimi")
    var  etudiant= Etudiant()
    var formateurs = mutableListOf<Fromateur>()
    var  etudiantList= mutableListOf<Etudiant>()
     formateurs.add(f)
     etudiantList.add(etudiant)
     val ecole1 = Ecole(28,"jak",formateurs,)


    var matiere = listOf<Matiere?>()
    var _2annes= listOf<Etudiant?>()
   //9 Crees une variable Nomformateurs
    val Nomformateurs = ecole.listeFromateur
        .filter { it.Nom.startsWith("A")}
        .map { it.Nom}
    //10 MatieresForrmateur
    val MatieresForrmateur = ecole.listeFromateur
        .filter { it.Matricule.contains("java")
        }.map { it.Nom }
   // 11 etudiants2enn
    val etudiants2enn = ecole.listEtdiants.filter { it.NiveauScolaire == "2anne" }.map { it.nom }
    //12 logNames
    val logNames = ecole.listEtdiants.filter { it.nom.length > 4 }.map { it.nom }
      println(Nomformateurs)
    //13 etuadmins
    val etuadmins = ecole.listEtdiants.filter { it.Note >= 5 }.map { it.nom }
    // 14 AgeEdut
    val AgeEdut = ecole.listEtdiants.sortedBy { it.age }
    // 15 Matient
    val Matient = f.listeDesMatiereEnseignees.filter {
        it.NomMatiere
        .uppercase()
        .contains("J") }
    //16 isContient
    val isCounter = f.listeDesMatiereEnseignees.map { it.NomMatiere.contains("c++") }
    //18 isNom
    val isNom = ecole.listeFromateur.take(4).filter { it.Nom== "Ahmad" }.map { it.Nom }
    //19
    fun dehors(fromateur: Fromateur):String{
        return fromateur.Nom.uppercase();
    }
    //20
    fun isExecellet(etudiant: Etudiant):Boolean{return etudiant.Note >=8}
}


