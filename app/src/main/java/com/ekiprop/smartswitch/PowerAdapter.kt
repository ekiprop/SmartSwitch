package com.ekiprop.smartswitch

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PowerAdapter internal constructor(
    context: Context
) : RecyclerView.Adapter<PowerAdapter.PowerViewHolder>(){

    private val inflater: LayoutInflater = LayoutInflater.from(context)
    private var powers = emptyList<PowerAdapter>()

    inner class PowerViewHolder : RecyclerView.ViewHolder {
        val switchItemView: TextView
        val phoneView: TextView
        constructor(itemView: View) : super(itemView){
            switchItemView = itemView.findViewById(R.id.tvTSwitchName)
            phoneView = itemView.findViewById(R.id.tvPhoneNo)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PowerViewHolder {
        val itemView = inflater.inflate(R.layout.power_item, parent, false)
        return PowerViewHolder(itemView )
    }

    override fun getItemCount(): Int {
         return itemCount
    }

    override fun onBindViewHolder(holder: PowerViewHolder, position: Int) {
        holder.switchItemView.text = position.toString()
    }
}