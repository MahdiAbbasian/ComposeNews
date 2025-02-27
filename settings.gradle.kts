pluginManagement {
    includeBuild("build-logic")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
rootProject.name = "ComposeNews"
include(":library:designsystem")
include(":library:navigation")
include(":konsist")
include(":core:sync")
include(":core:test")
include(":core:base")
include(":core:uimarket")
include(":core:extensions")
include(":core:network:ktor")
include(":domain:market")
include(":data:market-remote")
include(":data:market-local")
include(":data:market-repository")
include(":feature:marketlist")
include(":feature:marketdetail")
include(":app")
include(":app-watch")
include(":app-watch:app")
include(":app-watch:navigation")
include(":app-watch:ui")
include(":data:sqldelight")
