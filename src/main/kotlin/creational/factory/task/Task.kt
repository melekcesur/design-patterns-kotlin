package creational.factory.task

interface Task {
    fun createCustomizer(): TaskCustomizer<out Task>
}