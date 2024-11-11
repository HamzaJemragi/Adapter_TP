package com.hamza.adaptertp

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

class MyAdapter(val context: Context, val liste: ArrayList<Personne>) : BaseAdapter() {

    override fun getCount(): Int = liste.size

    override fun getItem(position: Int): Any = liste[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.pays_layout, parent, false)

        var codep = view.findViewById<TextView>(R.id.codep)
        var codec = view.findViewById<TextView>(R.id.codec)
        var codeco = view.findViewById<TextView>(R.id.codeco)

        val personne = getItem(position) as Personne

        codep.text = personne.nom
        codec.text = personne.prenom
        codeco.text = personne.age.toString()

        if (personne.age < 18) {
            codep.setTextColor(Color.parseColor("#008000"))
        } else if (personne.age > 60) {
            codep.setTextColor(Color.parseColor("#1e90ff"))
        }

        return view
    }
}