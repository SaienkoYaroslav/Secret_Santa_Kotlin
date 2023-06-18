package ua.com.saienko.yaroslav.secretsantakotlin.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ua.com.saienko.yaroslav.secretsantakotlin.domain.usecases.GetTransformStringToListUseCase
import javax.inject.Inject

class Step1ViewModel @Inject constructor(
    val getTransformStringToListUseCase: GetTransformStringToListUseCase
) : ViewModel() {

    val ld = MutableLiveData<MutableList<String>>()


//    fun getTransformStringToList(string: String): MutableList<String> {
//        return getTransformStringToListUseCase(string)
//    }

    fun initLd(string: String) {
        ld.value = getTransformStringToListUseCase(string)
    }

}