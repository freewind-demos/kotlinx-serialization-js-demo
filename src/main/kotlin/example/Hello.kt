package example

import kotlinx.serialization.Optional
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JSON

@Serializable
data class Data(val a: Int, @Optional val b: String = "42")

object Hello {
    @JvmStatic
    fun main(args: Array<String>) {
        println(JSON.stringify(Data(42)))
        val obj = JSON.parse<Data>("""{"a":42}""")
        println(obj)
    }
}