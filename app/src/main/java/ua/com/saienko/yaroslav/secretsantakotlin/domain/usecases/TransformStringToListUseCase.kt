package ua.com.saienko.yaroslav.secretsantakotlin.domain.usecases

import ua.com.saienko.yaroslav.secretsantakotlin.domain.repository.Repository
import javax.inject.Inject

class TransformStringToListUseCase @Inject constructor(
    private val repository: Repository
) {

    operator fun invoke(string: String): MutableList<String> {
        return repository.transformStringToList(string)
    }

}