[![Author](https://img.shields.io/badge/author-Im--Tae-red.svg)]( https://github.com/Im-Tae ) [![Language](https://img.shields.io/badge/language-Kotlin,%20Java-green.svg)](  https://kotlinlang.org/  ) [![MIT License](https://img.shields.io/badge/license-MIT%20License-blue.svg)]( https://opensource.org/licenses/MIT )

# AndroidSingletonExample

앱 동작중에 캐시저장,
sharedpreferences 대신 사용하고 싶을때

sharedpreferences와 다르게 데이터를 힙에 저장하여 프로세스 죽일시에 데이터는 사라집니다.

```kotlin
//Kotlin

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



```java
//Java

public class JavaDataSingleton {
    private static JavaDataSingleton instance = null;

    private JavaDataSingleton() {}

    public static JavaDataSingleton getInstance() {
        if (instance == null) instance = new JavaDataSingleton();

        return instance;
    }
    
	//variable
    String message = null;
}
```

