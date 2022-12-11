package com.example.premierleaguefixtures.skrypnik

import android.os.Bundle
import android.service.autofill.FieldClassification.Match
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * A simple [Fragment] subclass.
 * Use the [DetailScreenFrag.newInstance] factory method to
 * create an instance of this fragment.
 */
class DetailScreenFrag : Fragment(R.layout.fragment_detail_screen) {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail_screen, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.match_number).text = arguments?.get("matchNumber").toString()
        view.findViewById<TextView>(R.id.round_number).text = arguments?.get("roundNumber").toString()
        view.findViewById<TextView>(R.id.date_utc).text = arguments?.get("dateUtc").toString()
        view.findViewById<TextView>(R.id.location).text = arguments?.get("location").toString()
        view.findViewById<TextView>(R.id.home_team).text = arguments?.get("homeTeam").toString()
        view.findViewById<TextView>(R.id.away_team).text = arguments?.get("awayTeam").toString()
        view.findViewById<TextView>(R.id.group).text = arguments?.get("group").toString()
        view.findViewById<TextView>(R.id.home_team_score).text = arguments?.get("homeTeamScore").toString()
        view.findViewById<TextView>(R.id.away_team_score).text = arguments?.get("awayTeamScore").toString()
    }

    override fun onResume() {
        super.onResume()

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         */
        @JvmStatic
        fun newInstance(
            matchNumber: Int,
            roundNumber: Int,
            dateUtc: String,
            location: String,
            homeTeam: String,
            awayTeam: String,
            group: String?,
            homeTeamScore: Int,
            awayTeamScore: Int) =
            DetailScreenFrag().apply {
                val args = Bundle()
                args.putInt("matchNumber", matchNumber)
                args.putInt("roundNumber", roundNumber)
                args.putString("dateUtc", dateUtc)
                args.putString("location", location)
                args.putString("homeTeam", homeTeam)
                args.putString("awayTeam", awayTeam)
                args.putString("group", group)
                args.putInt("homeTeamScore", homeTeamScore)
                args.putInt("awayTeamScore", awayTeamScore)
                val fragment = this
                fragment.arguments = args
            }
    }
}