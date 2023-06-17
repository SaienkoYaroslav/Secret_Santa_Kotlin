package ua.com.saienko.yaroslav.secretsantakotlin.data

import ua.com.saienko.yaroslav.secretsantakotlin.domain.repository.Repository
import javax.inject.Inject

class RepositoryImpl @Inject constructor() : Repository {


    override fun transformStringToList(string: String): MutableList<String> {
        return string.split(",").map { it.trim() }.toMutableList()
    }

    override fun getShuffleList(list: List<String>): List<String> {
        return list.shuffled()
    }
}