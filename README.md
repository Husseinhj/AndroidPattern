# AndroidPattern
[![jitpack](https://jitpack.io/v/Husseinhj/AndroidPattern.svg)](https://jitpack.io/#Husseinhj/AndroidPattern)
[![FOSSA Status](https://app.fossa.com/api/projects/git%2Bgithub.com%2FHusseinhj%2FAndroidPattern.svg?type=shield)](https://app.fossa.com/projects/git%2Bgithub.com%2FHusseinhj%2FAndroidPattern?ref=badge_shield)

Format numbers using a string pattern with this simple number formatted like `##-####-##`

# Installation
Following the [Github package manager documentation](https://github.com/Husseinhj/AndroidPattern/packages/1022537) or following code:

```groovy
implementation "io.husseinhj:androidpatterns:1.0.0"
```


## Digit format
By default, numbers are defined by the `#` character and if you want to customize the format, use the `digitPatterns` property as shown in the following code:
```kotlin
AndroidPattern.digitPatterns = charArrayOf('#', '$', '*')
```


## Sample

Mobile format:
```kotlin
val pattern = "98### ### ####"
val applied = "9121234567".applyPattern(pattern, exactPattern = true)

print(applied)

// 98912 123 4567
```


Postal code format:
```kotlin
val pattern = "#####-#####"
val applied = "4173412121".applyPattern(pattern)

print(applied)

// 41734-12121
```

Separator format:
```kotlin
val pattern = "###,###,###,###"
val applied = 123456789.applyPattern(pattern, exactPattern = true)

print(applied)

// 123,456,789
```


## License
[![FOSSA Status](https://app.fossa.com/api/projects/git%2Bgithub.com%2FHusseinhj%2FAndroidPattern.svg?type=large)](https://app.fossa.com/projects/git%2Bgithub.com%2FHusseinhj%2FAndroidPattern?ref=badge_large)
