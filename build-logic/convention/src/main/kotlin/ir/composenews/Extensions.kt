package ir.composenews

import com.android.build.api.dsl.ApplicationExtension
import com.android.build.gradle.LibraryExtension
import io.gitlab.arturbosch.detekt.extensions.DetektExtension
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

inline fun Project.androidGradle(crossinline configure: LibraryExtension.() -> Unit) =
    extensions.configure<LibraryExtension> {
        configure()
    }

inline fun Project.detektGradle(crossinline configure: DetektExtension.() -> Unit) =
    extensions.configure<DetektExtension> {
        configure()
    }

inline fun Project.applicationGradle(crossinline configure: ApplicationExtension.() -> Unit) =
    extensions.configure<ApplicationExtension> {
        configure()
    }