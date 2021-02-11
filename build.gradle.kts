plugins {
    java
}

group = "me.mocha.nukkitplugin"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://repo.nukkitx.com/maven-snapshots")
}

dependencies {
    implementation("cn.nukkit:nukkit:1.0-SNAPSHOT")
}