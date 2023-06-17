package ua.com.saienko.yaroslav.secretsantakotlin.presentation

import androidx.lifecycle.ViewModel
import ua.com.saienko.yaroslav.secretsantakotlin.domain.usecases.TransformStringToListUseCase
import javax.inject.Inject

class Step1ViewModel @Inject constructor(
    val transformStringToListUseCase: TransformStringToListUseCase
) : ViewModel() {

    fun transformStringToList(string: String): MutableList<String> {
        return transformStringToListUseCase(string)
    }

}