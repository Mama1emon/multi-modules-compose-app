package dev.mama1emon.navigation

import androidx.navigation.NamedNavArgument
import androidx.navigation.NavDeepLink

/**
 * Модель точки входа в фичу
 *
 * @property name      название точки входа
 * @property arguments аргументы для передачи данных
 * @property deepLinks диплинки, по которым будет открываться экран
 */
open class EntryPoint(
    private val name: String,
    val arguments: List<NamedNavArgument> = listOf(),
    val deepLinks: List<NavDeepLink> = listOf()
) {

    /** Общее название точки входа */
    fun value() = if (arguments.isNotEmpty()) {
        val route = "$name?"
        val args = arguments.joinToString(separator = "&") { getEntryPointArg(it.name) }
        route + args
    } else {
        name
    }

    private fun getEntryPointArg(name: String) = "$name={$name}"

    /** Класс для расчета пути  */
    inner class Route {

        private val addedArgs: MutableMap<String, Any> = mutableMapOf()

        /** Добавить аргумент в путь с ключом [key] и значением [value] */
        fun addValue(key: String, value: Any): Route {
            if (arguments.isEmpty()) {
                throw IllegalStateException("Экран $this не имеет аргументов")
            }

            arguments.firstOrNull { it.name == key }
                ?: throw IllegalArgumentException("Экран $this не имеет аргумента с ключом $key")

            addedArgs[key] = value

            return this
        }

        /** Получить путь */
        fun destination() = if (addedArgs.isNotEmpty()) {
            val route = "$name?"
            val args = addedArgs.entries.joinToString(separator = "&") {
                getRouteArg(it.key, it.value)
            }
            route + args
        } else {
            name
        }

        private fun getRouteArg(name: String, value: Any) = "$name=$value"
    }
}