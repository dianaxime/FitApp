package Models

interface LapHistory {
    val lapHistory: ArrayList<String> // Historial de vueltas

    fun clear() // Limpiar historial
    fun add(element: Int) // Agregar elemento
    fun del(elementIndex: Int) // Elimina elemento en la posición
}