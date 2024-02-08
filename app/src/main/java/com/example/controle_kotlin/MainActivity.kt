package com.example.controle_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

fun main() {
    var obj = Etudiant();
    var listFromateur= listOf<Fromateur?>()
    val evenNumbers = listFromateur
        .filterNotNull()
        .
        .contains(element = "2")

}