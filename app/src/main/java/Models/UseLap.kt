package Models

class useLap:LapHistory {

    override val lapHistory: ArrayList<String> = ArrayList()

    override fun clear() {
        lapHistory.clear();
    }

    override fun add(element: Int) {
        var cant = "$element vueltas"
        lapHistory.add(cant)
    }

    override fun del(elementIndex: Int) {
        lapHistory.removeAt(elementIndex)
    }
}