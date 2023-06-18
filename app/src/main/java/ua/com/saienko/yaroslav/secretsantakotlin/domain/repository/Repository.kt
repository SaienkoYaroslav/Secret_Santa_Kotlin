package ua.com.saienko.yaroslav.secretsantakotlin.domain.repository

import androidx.lifecycle.LiveData

interface Repository {

    fun getTransformStringToList(string: String): MutableList<String>

    fun getShuffleList(list: List<String>): List<String>


}