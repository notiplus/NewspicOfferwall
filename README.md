## 뉴스픽 오퍼월 연동

최신 SDK 다운로드 [[NewspicOfferwall-1.1.aar]](https://github.com/notiplus/NewspicOfferwall/raw/master/app/libs/NewspicOfferwall-1.1.aar)

aar 파일을 `app/libs/` 폴더에 추가

디펜던시 주입을 위해 `app/build.gradle` 파일 수정
```
repositories {
    flatDir {
        dirs 'libs'
    }
}

dependencies {
    api(name: 'NewspicOfferwall-1.1', ext: 'aar')
}
```

오퍼월 실행
``` kotlin
NewspicOfferwall.setTestMode(testMode: Boolean)                     // 테스트 빌드
NewspicOfferwall.setParameters(parameters: Map <String, String>)    // 포스트백으로 전달받을 파라미터 설정
NewspicOfferwall.openOfferwall(context: Context)
```
