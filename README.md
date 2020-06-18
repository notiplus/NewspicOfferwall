# 뉴스픽 오퍼월 SDK

> 뉴스픽 오퍼월 SDK는 Android v4.4(API 19) 이상의 버전에서 동작합니다. <br/>
> 하위 버전에서는 오퍼월 액티비티로 진입되지 않습니다. <br/>

<br/><br/>

## 연동방법

### STEP 1

[[NewspicOfferwall-1.1.aar]](https://github.com/notiplus/NewspicOfferwall/raw/master/app/libs/NewspicOfferwall-1.1.aar) aar 파일을 `app/libs/` 폴더에 추가

<br/>

### STEP 2

종송석 추가 `Gradle Scripts/build.gradle (Module:app)`

```gradle
repositories {
    flatDir {
        dirs 'libs'
    }
}

dependencies {
    api(name: 'NewspicOfferwall-1.1', ext: 'aar')
}
```

<br/><br/>

## 오퍼월 실행

### 테스트 파라미터 지정

`NewspicOfferwall.setTestMode(testMode: Boolean)`

<br/>

### 포스트백 파라미터 지정

`NewspicOfferwall.setParameters(parameters: Map <String, String>)`

<br/> 

### 오퍼월 액티비티 진입

`NewspicOfferwall.openOfferwall(context: Context)`

> 뉴스픽 오퍼월 SDK는 Android v4.4(API 19) 이상의 버전에서 동작합니다. <br/>
> 하위 버전에서는 오퍼월 액티비티로 진입되지 않습니다. <br/>

<br/>

### 데모

``` kotlin
offerwall_open.setOnClickListener {

    NewspicOfferwall.setTestMode(true)

    parameters["userId"] = userId
    NewspicOfferwall.setParameters(parameters)

    NewspicOfferwall.openOfferwall(this)
}
```
