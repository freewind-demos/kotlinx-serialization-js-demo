KotlinX Serialization Demo
==========================

[kotlinx.serialization](https://github.com/Kotlin/kotlinx.serialization): Kotlin cross-platform / multi-format serialization

It needs gradle plugin and IDEA plugin:

1, gradle plugin is configured in `build.gradle`
2. IDEA plugin should be installed carefully, otherwize will see compilation error when compile code in IDEA.
   1. See: <https://github.com/Kotlin/kotlinx.serialization#working-in-intellij-idea>
   2. For this project, use <https://teamcity.jetbrains.com/viewLog.html?buildId=lastPinned&buildTypeId=KotlinTools_KotlinxSerialization_KotlinCompilerWithSerializationPlugin&tab=artifacts&guest=1&buildBranch=1.2.40>

I tested successfully in my IDEA without compilation error.

Run
---

```
./gradlew clean compileKotlin2Js
```

It will generate a `hello.js` in `node/`.

Then

```
cd node
npm install
node hello.js
```

You will see some JSON output.




