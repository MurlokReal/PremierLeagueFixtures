package com.example.premierleaguefixtures.skrypnik

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_match_layout.view.*

class MatchListAdapter: RecyclerView.Adapter<MatchListAdapter.MatchListViewHolder>() {

    private var matchList = emptyList<MatchModel>()

    class MatchListViewHolder(view: View): RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MatchListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_match_layout, parent, false)
        return MatchListViewHolder(view)
    }

    override fun onBindViewHolder(holder: MatchListViewHolder, position: Int) {
        holder.itemView.tv_card_home_team.text = matchList[position].homeTeam
        holder.itemView.tv_card_away_team.text = matchList[position].awayTeam
    }

    override fun getItemCount(): Int {
        return matchList.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<MatchModel>){
        matchList = list
        notifyDataSetChanged()
    }

}