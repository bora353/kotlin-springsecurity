package com.example.kotlin.common.annotation

import kotlin.reflect.KClass

@Target(AnnotationTarget.FILED)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
@Constraint(validatedBy = [])
annotation class ValidEnum (
    val message: String = "Invalid enum value",
    val groups: Array<KClass<*>> = [],
    val payload: Array<KClass<out Payload>> = [],
    val enumClass: KClass<out Enum<*>>
) {
}