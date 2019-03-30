package Models

class Controlador {
    internal var nvueltas: Int = 0

    fun sumar() {
        nvueltas++
    }

    fun restar() {
        if (nvueltas > 0) {
            nvueltas--
        }
    }

    fun predet(valor: String) {
        if (valor == "1 vueltas")
        {
            nvueltas = 1
        }
        else if (valor == "3 vueltas")
        {
            nvueltas = 3
        }
        else if (valor == "5 vueltas")
        {
            nvueltas = 5
        }
        else if (valor == "10 vueltas")
        {
            nvueltas = 10
        }
        fun getnvueltas():Int {
            return nvueltas
        }
    }
}
