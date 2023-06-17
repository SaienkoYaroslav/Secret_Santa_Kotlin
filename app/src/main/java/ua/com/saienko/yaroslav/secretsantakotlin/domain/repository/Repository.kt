package ua.com.saienko.yaroslav.secretsantakotlin.domain.repository

interface Repository {

    fun transformStringToList(string: String): MutableList<String>

    fun getShuffleList(list: List<String>): List<String>

}