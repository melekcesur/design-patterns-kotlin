import creational.builder.FirstBuilder
import creational.builder.IBuilder
import creational.builder.SecondBuilder
import creational.singleton.ItemProvider

fun main() {
    testBuilder()
    testSingleton()
}

private fun testBuilder() {
    val firstBuilder: IBuilder = FirstBuilder()
    firstBuilder.addProperty()
    val firstItem = firstBuilder.buildItem()
    println(firstItem.toString())

    val secondBuilder: IBuilder = SecondBuilder()
    secondBuilder.addProperty()
    val secondItem = secondBuilder.buildItem()
    println(secondItem.toString())
}

private fun testSingleton() {
    val firstItem = ItemProvider.getInstance()
    val secondItem = ItemProvider.getInstance()
    println("First item hashCode: " + firstItem.hashCode())
    println("Second item hashCode: " + secondItem.hashCode())
}