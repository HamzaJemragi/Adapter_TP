package com.hamza.adaptertp

import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        //Exercice 1
//        val lv = findViewById<ListView>(R.id.listview)
//
//        val data = listOf("C", "Java", "Js", "Python", "Kotlin", "Php")
//
//        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_multiple_choice, data)
//
//        lv.adapter = adapter


        //Exercice 2
//        val lv = findViewById<ListView>(R.id.listview)
//
//        val hashmap: List<HashMap<String, Any>> = listOf(
//            hashMapOf("photo" to R.drawable.c,"name" to "C", "year" to "1972"),
//            hashMapOf("photo" to R.drawable.c,"name" to "Java", "year" to "1975"),
//            hashMapOf("photo" to R.drawable.c,"name" to "Js", "year" to "1995")
//        )
//
//        val adapter2 = SimpleAdapter(
//            this,
//            hashmap,
//            R.layout.language_layout,
//            arrayOf("photo", "name", "year"),
//            intArrayOf(R.id.imageView, R.id.txtNom, R.id.txtYear)
//        )
//
//        lv.adapter = adapter2

        //Exercice3
//        val lv = findViewById<ListView>(R.id.affichage)
//
//        val pays = listOf(
//            hashMapOf("codep" to "PALESTINE", "mo" to "POUND", "codeiso" to "PP"),
//            hashMapOf("codep" to "ALGERIA", "mo" to "DINAR", "codeiso" to "DZ"),
//            hashMapOf("codep" to "ALBANIA", "mo" to "LEK", "codeiso" to "AL")
//        )
//
//        val adapter3 = SimpleAdapter(
//            this,
//            pays,
//            R.layout.pays_layout,
//            arrayOf("codep", "mo", "codeiso"),
//            intArrayOf(R.id.codep, R.id.mo, R.id.codeiso)
//        )
//
//        lv.adapter = adapter3

        // Exercice 4
//        val lv = findViewById<ListView>(R.id.affichage)
//
//        val pays = listOf(
//            hashMapOf("codep" to "PALESTINE", "codec" to "AL-QODS", "codeco" to "ASIE"),
//            hashMapOf("codep" to "ALGERIA", "codec" to "ALGER", "codeco" to "AFRIQUE"),
//            hashMapOf("codep" to "ALBANIA", "codec" to "TIRANA", "codeco" to "EUROPE")
//        )
//
//        val adapter4 = SimpleAdapter(
//            this,
//            pays,
//            R.layout.pays_layout,
//            arrayOf("codep", "codec", "codeco"),
//            intArrayOf(R.id.codep, R.id.codec, R.id.codeco)
//        )
//
//        lv.adapter = adapter4

        // Exercice 5
        val liste = arrayListOf(
            Personne("alami", "Mohamed", 38),
            Personne("alami", "Mohamed", 68),
            Personne("alami", "Mohamed", 17),
            Personne("alami", "Mohamed", 28)
        )

        val lv = findViewById<ListView>(R.id.affichage)

        val adapter5 = MyAdapter(this, liste)

        lv.adapter = adapter5
    }
}