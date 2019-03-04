package ru.capjack.tool.kt.reflect

import kotlin.reflect.KParameter
import kotlin.reflect.KType

actual inline val KParameter.indexRef: Int
	get() = index

actual inline val KParameter.nameRef: String?
	get() = name

actual inline val KParameter.typeRef: KType
	get() = type