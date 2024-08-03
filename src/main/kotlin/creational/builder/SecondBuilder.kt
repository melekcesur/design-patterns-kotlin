package creational.builder

class SecondBuilder : Builder() {

    override fun addProperty() {
        mItem.add("1.property: d")
        mItem.add("2.property: e")
        mItem.add("3.property: f")
    }

}