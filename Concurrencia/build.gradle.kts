plugins {
    kotlin("jvm") version "2.4.21"
}

group = "es.cicero.tomas"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.11.0")
    testImplementation(kotlin("test"))
}

kotlin {
    jvmToolchain(21)
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<JavaExec> {
    jvmArgs(
        "-Dkotlinx.coroutines.debug",// nom de la corrutina al costat del fil
        "-Dfile.encoding=UTF-8",// accents correctes
        "-Dstdout.encoding=UTF-8",
        "-Dstderr.encoding=UTF-8",
    )
}