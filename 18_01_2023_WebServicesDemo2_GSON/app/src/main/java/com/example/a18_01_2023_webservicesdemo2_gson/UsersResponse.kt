package com.example.a18_01_2023_webservicesdemo2_gson

import com.google.gson.annotations.SerializedName

data class UsersResponse (
    @SerializedName("page")
    var pageNumber : Int,

    @SerializedName("per_page")
    var usersPerPage : Int,

    @SerializedName("total")
    var totalCount : Int,

    @SerializedName("total_pages")
    var totalPages : Int = 0,

    @SerializedName("data")
    var users : ArrayList<User>

        ){
    override fun toString(): String {
        return "page -- $pageNumber ----- per_page -- $usersPerPage"
    }
}

