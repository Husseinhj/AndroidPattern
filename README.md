# AndroidPattern
Format numbers using a string pattern with this simple number formatted like ##-####-##

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
