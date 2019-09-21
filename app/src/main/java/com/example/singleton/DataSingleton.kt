package com.example.singleton

class DataSingleton {
    companion object {
        private var instance: DataSingleton? = null

        fun getInstance(): DataSingleton? {
            if (instance == null) instance = DataSingleton()

            return instance
        }

    }
    var message: String? = null
}