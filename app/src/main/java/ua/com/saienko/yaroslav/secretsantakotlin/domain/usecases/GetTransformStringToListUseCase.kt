package ua.com.saienko.yaroslav.secretsantakotlin.domain.usecases

import androidx.lifecycle.LiveData
import ua.com.saienko.yaroslav.secretsantakotlin.domain.repository.Repository
import javax.inject.Inject

class GetTransformStringToListUseCase @Inject constructor(
    private val repository: Repository
) {

    operator fun invoke(string: String): MutableList<String> {
        return repository.getTransformStringToList(string)
    }

}