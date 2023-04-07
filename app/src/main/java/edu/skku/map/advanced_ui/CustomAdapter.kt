package edu.skku.map.advanced_ui

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter(val data: ArrayList<Restaurant>, val context: Context) : BaseAdapter() {
    override fun getCount(): Int {
        return data.size
    }

    override fun getItem(p0: Int): Any {
        return data[p0]
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    @SuppressLint("MissingInflatedId")
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {

        val layoutInflater: LayoutInflater =
            context.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE
            ) as LayoutInflater

        val view = layoutInflater.inflate(R.layout.restauarant_item, null)

        val imageView = view.findViewById<ImageView>(R.id.restaurantImageView)
        val textView = view.findViewById<TextView>(R.id.restaurantTextView)

        imageView.setImageResource(data[p0].imgId)
        textView.text = data[p0].name

        return view


    }

}