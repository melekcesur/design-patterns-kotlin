import creational.builder.FirstBuilder
import creational.builder.IBuilder
import creational.builder.SecondBuilder
import creational.factory.product.*
import creational.factory.task.Task
import creational.factory.task.TaskFactory
import creational.factory.task.TaskType
import creational.factory.task.TypeFactory
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
    println("\n### Factory Pattern Test 1 ###\n")

    val firstProductFactory: ProductFactory = FirstProductFactory()
    val firstProduct: Product = firstProductFactory.produce()
    firstProduct.prepare()

    val secondProductFactory: ProductFactory = SecondProductFactory()
    val secondProduct: Product = secondProductFactory.produce()
    secondProduct.prepare()

    val thirdProductFactory: ProductFactory = ThirdProductFactory()
    val thirdProduct: Product = thirdProductFactory.produce()
    thirdProduct.prepare()

    println("\n### Factory Pattern Test 2 ###\n")
    val taskFactory: TaskFactory = TypeFactory()

    val firstTaskType: Task = taskFactory.createTask(TaskType.FirstTaskType)
    firstTaskType.createCustomizer().check()

    val secondTaskType: Task = taskFactory.createTask(TaskType.SecondTaskType)
    secondTaskType.createCustomizer().complete()
}