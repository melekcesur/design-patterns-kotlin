package creational.factory.task

internal class FirstTaskType : Task {
    override fun createCustomizer() = FirstTaskTypeCustomizer(this)
}