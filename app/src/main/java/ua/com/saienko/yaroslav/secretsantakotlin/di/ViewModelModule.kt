package ua.com.saienko.yaroslav.secretsantakotlin.di

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import ua.com.saienko.yaroslav.secretsantakotlin.presentation.Step1ViewModel

@Module
interface ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(Step1ViewModel::class)
    fun bindStep1ViewModel(viewModel: Step1ViewModel): ViewModel

}