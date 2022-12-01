package ua.com.saienko.yaroslav.secretsantakotlin.domain.usecases

import ua.com.saienko.yaroslav.secretsantakotlin.domain.repository.Repository

class GetShuffleList(
    private val repository: Repository
) {

    operator fun invoke(list: List<String>): List<String> {
        return repository.getShuffleList(list)
    }

}