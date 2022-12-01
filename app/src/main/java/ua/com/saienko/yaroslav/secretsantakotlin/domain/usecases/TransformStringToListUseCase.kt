package ua.com.saienko.yaroslav.secretsantakotlin.domain.usecases

import ua.com.saienko.yaroslav.secretsantakotlin.domain.repository.Repository

class TransformStringToListUseCase(
    private val repository: Repository
) {

    operator fun invoke(string: String): List<String> {
        return repository.transformStringToList(string)
    }

}