package creational.builder

class Item {

    private val mProperties = mutableListOf<String>()

    fun add(part: String) {
        mProperties.add(part)
    }

    override fun toString(): String {
        return "Properties of the item, are : \n$mProperties"
    }

}