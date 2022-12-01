package ua.com.saienko.yaroslav.secretsantakotlin.data

import ua.com.saienko.yaroslav.secretsantakotlin.domain.repository.Repository

object RepositoryImpl : Repository {


    override fun transformStringToList(string: String): List<String> {
        return string.split(",").map { it.trim() }
    }

    override fun getShuffleList(list: List<String>): List<String> {
        return list.shuffled()
    }
}