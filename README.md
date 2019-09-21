# KotlinSingletonExample

앱 동작중에 캐시저장,
sharedpreferences 대신 사용하고 싶을때

sharedpreferences와 다르게 데이터를 힙에 저장하여 프로세스 죽일시에 데이터는 사라짐.

```kotlin
class DataSingleton {
    companion object {
        private var instance: DataSingleton? = null

        fun getInstance(): DataSingleton? {
            if (instance == null) instance = DataSingleton()

            return instance
        }

    }
    //variable
    var message: String? = null
}
```
