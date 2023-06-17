package ua.com.saienko.yaroslav.secretsantakotlin

import android.app.Application
import ua.com.saienko.yaroslav.secretsantakotlin.di.Component
import ua.com.saienko.yaroslav.secretsantakotlin.di.DaggerComponent

class AppSanta: Application() {

    val component: Component by lazy {
        DaggerComponent.create()
    }

}