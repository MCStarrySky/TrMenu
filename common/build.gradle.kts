dependencies {
    compileOnly("org.openjdk.nashorn:nashorn-core:15.4")
    compileOnly("com.google.code.gson:gson:2.11.0")
}

taboolib { subproject = true }

gradle.buildFinished {
    buildDir.deleteRecursively()
}