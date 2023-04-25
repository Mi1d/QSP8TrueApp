package com.example .qsp8app.adapter

import android.content.Context
import android.content.Intent
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.qsp8app.R
import com.example.qsp8app.view.activity.DetailActivity
import com.example.qsp8app.databinding.CardItemGridBinding
import com.example.qsp8app.model.bean.Label
import com.example.qsp8app.util.Code


class LabelGridAdapter(val context: Context, var labelList:List<Label>) :
    RecyclerView.Adapter<LabelGridAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding : CardItemGridBinding =
            DataBindingUtil.inflate(LayoutInflater.from(context),R.layout.card_item_grid,parent,false)

        val holder = ViewHolder(binding.root)
        holder.itemView.setOnClickListener {
            val position = holder.absoluteAdapterPosition
            val label = labelList[position]

            val intent = Intent(context, DetailActivity::class.java).apply {
                putExtra(Code.LABEL,label)
            }
            context.startActivity(intent)
        }

        return holder
    }

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val bind =  DataBindingUtil.bind<CardItemGridBinding>(holder.itemView)

        bind!!.label = labelList[position]


        if(bind.label!!.day>=0){
            bind.labelText.setBackgroundColor(context.resources.getColor(R.color.note_list_future_dark,context.theme))
        }else{
            bind.labelText.setBackgroundColor(context.resources.getColor(R.color.note_list_history_dark,context.theme))
        }

        bind.executePendingBindings()
    }


    override fun getItemCount() = labelList.size



}