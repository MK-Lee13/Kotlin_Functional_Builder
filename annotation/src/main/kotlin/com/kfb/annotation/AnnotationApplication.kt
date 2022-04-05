package com.kfb.annotation

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AnnotationApplication

fun main(args: Array<String>) {
    runApplication<AnnotationApplication>(*args)
}
