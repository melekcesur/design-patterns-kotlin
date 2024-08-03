package creational.builder

class FirstBuilder : Builder() {

    override fun addProperty() {
        mItem.add("First property: a")
        mItem.add("Second property: b")
        mItem.add("Third property: c")
    }

}