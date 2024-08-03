package creational.builder

abstract class Builder : IBuilder {

    protected val mItem = Item()

    abstract override fun addProperty()

    override fun buildItem() = mItem

}