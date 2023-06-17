package ua.com.saienko.yaroslav.secretsantakotlin.di

import dagger.Binds
import dagger.Module
import ua.com.saienko.yaroslav.secretsantakotlin.data.RepositoryImpl
import ua.com.saienko.yaroslav.secretsantakotlin.domain.repository.Repository

@Module
interface DataModule {

    @ApplicationScope
    @Binds
    fun bindRepository (impl: RepositoryImpl): Repository

}