package edu.temple.simplerecyclerview

import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Step 3: Complete adapter implementation

class NumberDisplayAdapter(private val numbers : Array<Int>) : RecyclerView.Adapter<NumberDisplayAdapter.NumberViewHolder>() { /* Step 3a: Provide Adapter Parent */



    class NumberViewHolder (val textView: TextView) : RecyclerView.ViewHolder (textView) {}




    //Step 3b: Complete function definitions for adapter
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberDisplayAdapter.NumberViewHolder {
        return NumberViewHolder(TextView(parent.context))
    }



    override fun onBindViewHolder(holder: NumberDisplayAdapter.NumberViewHolder, position: Int) {
        holder.textView.text = numbers[position].toString()
    }





    override fun getItemCount(): Int {
        return numbers.size
    }



}