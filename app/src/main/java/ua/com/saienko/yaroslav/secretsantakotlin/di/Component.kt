package ua.com.saienko.yaroslav.secretsantakotlin.di

import dagger.Component
import ua.com.saienko.yaroslav.secretsantakotlin.presentation.Step1Fragment
import ua.com.saienko.yaroslav.secretsantakotlin.presentation.Step2Fragment

@ApplicationScope
@Component(modules = [DataModule::class, ViewModelModule::class])
interface Component  {

    fun inject(fragment: Step1Fragment)

    fun inject(fragment: Step2Fragment)

}