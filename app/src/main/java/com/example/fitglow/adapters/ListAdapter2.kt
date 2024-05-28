package com.example.fitglow.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.fitglow.R
import com.example.fitglow.data.ListData
import com.example.fitglow.data.ListData2

class ListAdapter2(context: Context, dataArrayList: ArrayList<ListData2?>?) :
    ArrayAdapter<ListData2?>(context, R.layout.item_layout2, dataArrayList!!) {
    override fun getView(position: Int, view: View?, parent: ViewGroup): View {
        var view = view
        val listData = getItem(position)
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_layout2, parent, false)
        }
        val listTitle = view!!.findViewById<TextView>(R.id.tv_itemTitle)
        val listDetail = view.findViewById<TextView>(R.id.tv_itemDes)
        listTitle.text = listData?.title
        listDetail.text = listData?.detail
        return view
    }
}