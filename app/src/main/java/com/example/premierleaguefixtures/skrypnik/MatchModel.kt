package com.example.premierleaguefixtures.skrypnik


data class MatchModel (
    val matchNumber: Int,
    val roundNumber: Int,
    val dateUtc: String,
    val location: String,
    val homeTeam: String,
    val awayTeam: String,
    val Group: String?,
    val homeTeamScore: Int,
    val awayTeamScore: Int
        ){

}