package dev.mama1emon.navigation

import androidx.navigation.NamedNavArgument

open class EntryPoint(
    private val entryPoint: String,
    val arguments: List<NamedNavArgument> = listOf(),
//    private val deepLinks: List<NavDeepLink> = listOf()
) {

    fun value() = if (arguments.isNotEmpty()) {
        val route = "$entryPoint?"
        val args = arguments.joinToString(separator = "&") { getEntryPointArg(it.name) }
        route + args
    } else {
        entryPoint
    }

    private fun getEntryPointArg(name: String) = "$name={$name}"

    inner class Route {

        private val argsMap: MutableMap<String, Any> = mutableMapOf()

        fun addValue(key: String, value: Any): Route {
            if (arguments.isEmpty()) {
                throw IllegalStateException("Экран $this не имеет аргументов")
            }

            arguments.firstOrNull { it.name == key }
                ?: throw IllegalArgumentException("Экран $this не имеет аргумента с ключом $key")

            argsMap[key] = value

            return this
        }

        fun destination(): String {
            val route = "$entryPoint?"
            val args = argsMap.entries.joinToString(separator = "&") {
                getRouteArg(it.key, it.value)
            }
            return route + args
        }

        private fun getRouteArg(name: String, value: Any) = "$name=$value"
    }
}