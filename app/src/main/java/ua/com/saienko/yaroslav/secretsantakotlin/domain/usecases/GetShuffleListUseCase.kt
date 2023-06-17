package ua.com.saienko.yaroslav.secretsantakotlin.domain.usecases

import ua.com.saienko.yaroslav.secretsantakotlin.domain.repository.Repository
import javax.inject.Inject

class GetShuffleListUseCase @Inject constructor(
    private val repository: Repository
) {

    operator fun invoke(list: List<String>): List<String> {
        return repository.getShuffleList(list)
    }

}