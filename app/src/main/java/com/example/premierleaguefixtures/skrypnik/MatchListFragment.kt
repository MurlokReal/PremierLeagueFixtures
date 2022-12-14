package com.example.premierleaguefixtures.skrypnik

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_match_list.view.*


class MatchListFragment : Fragment(R.layout.fragment_match_list) {

    private lateinit var adapter: MatchListAdapter
    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = MatchListAdapter()
        recyclerView = view.rv_match_list
        recyclerView.adapter = adapter
        adapter.setList(myMatch())
    }

    private fun myMatch(): ArrayList<MatchModel>{
        val matchList = ArrayList<MatchModel>()

        val match1 = MatchModel(1, 2, "12213123", "City", "team1", "team2", null, 1, 1)
        val match2 = MatchModel(2, 0, "35346545", "Desert", "team3", "team4", null, 2, 4)
        val match3 = MatchModel(1, 2, "12213123", "City", "team1", "team2", null, 1, 1)
        val match4 = MatchModel(2, 0, "35346545", "Desert", "team3", "team4", null, 2, 4)
        val match5 = MatchModel(1, 2, "12213123", "City", "team1", "team2", null, 1, 1)
        val match6 = MatchModel(2, 0, "35346545", "Desert", "team3", "team4", null, 2, 4)
        val match7 = MatchModel(1, 2, "12213123", "City", "team1", "team2", null, 1, 1)
        val match8 = MatchModel(2, 0, "35346545", "Desert", "team3", "team4", null, 2, 4)
        val match9 = MatchModel(1, 2, "12213123", "City", "team1", "team2", null, 1, 1)
        val match10 = MatchModel(2, 0, "35346545", "Desert", "team3", "team4", null, 2, 4)
        matchList.add(match1)
        matchList.add(match2)
        matchList.add(match3)
        matchList.add(match4)
        matchList.add(match5)
        matchList.add(match6)
        matchList.add(match7)
        matchList.add(match8)
        matchList.add(match9)
        matchList.add(match10)

        return matchList
    }

    companion object {

        fun newInstance() =
            MatchListFragment().apply {
                val args = Bundle()
                val fragment = this
                fragment.arguments = args
            }
    }
}