package creational.factory.task

internal class ThirdTaskType : Task {
    override fun createCustomizer() = ThirdTaskTypeCustomizer(this)
}