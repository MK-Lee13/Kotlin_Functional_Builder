package com.kfb.processor.config

import com.google.auto.service.AutoService
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.metadata.KotlinPoetMetadataPreview
import javax.annotation.processing.AbstractProcessor
import javax.annotation.processing.Processor
import javax.annotation.processing.RoundEnvironment
import javax.annotation.processing.SupportedAnnotationTypes
import javax.lang.model.element.TypeElement

/**
 * Created by Minky on 2022-04-05
 */

@KotlinPoetMetadataPreview
@AutoService(Processor::class)
@SupportedAnnotationTypes("com.kfb.annotation.config.FunctionalBuilder")
class FunctionalBuilderProcessor: AbstractProcessor() {

    lateinit var testFileBuilder: FileSpec

    override fun process(annotations: MutableSet<out TypeElement>?, roundEnv: RoundEnvironment): Boolean {
        return true
    }
}