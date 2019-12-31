package com.example.singleton

class KotlinDataSingleton {
    companion object {
        private var instance: KotlinDataSingleton? = null

        fun getInstance(): KotlinDataSingleton? {
            if (instance == null) instance = KotlinDataSingleton()

            return instance
        }

    }
    lateinit var message: String
}