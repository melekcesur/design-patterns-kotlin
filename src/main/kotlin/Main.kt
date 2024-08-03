import creational.builder.FirstBuilder
import creational.builder.IBuilder
import creational.builder.SecondBuilder
import creational.factory.*
import creational.singleton.ItemProvider

fun main() {
    testBuilder()
    testSingleton()
    testFactory()
}

private fun testBuilder() {
    println("\n### Builder Pattern Test ###\n")

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
    println("\n### Singleton Pattern Test ###\n")

    val firstItem = ItemProvider.getInstance()
    val secondItem = ItemProvider.getInstance()
    println("First item hashCode: " + firstItem.hashCode())
    println("Second item hashCode: " + secondItem.hashCode())
}

private fun testFactory() {
    println("\n### Factory Pattern Test ###\n")

    val firstProductFactory: ProductFactory = FirstProductFactory()
    val firstProduct: Product = firstProductFactory.produce()
    firstProduct.prepare()

    val secondProductFactory: ProductFactory = SecondProductFactory()
    val secondProduct: Product = secondProductFactory.produce()
    secondProduct.prepare()

    val thirdProductFactory: ProductFactory = ThirdProductFactory()
    val thirdProduct: Product = thirdProductFactory.produce()
    thirdProduct.prepare()
}