package creational.factory.task

internal class SecondTaskType : Task {
    override fun createCustomizer() = SecondTaskTypeCustomizer(this)
}