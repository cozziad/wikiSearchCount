package com.ehword.wikisearchcount.Model


object Model {
    data class Result(val query: Query)
    data class Query (val searchinfo: SearchInfo)
    data class SearchInfo (val totalhits:Int)
}