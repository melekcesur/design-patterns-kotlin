package creational.factory.task

internal class SecondTaskTypeCustomizer<T>(private val taskType: T) : TaskCustomizer<SecondTaskType> {
    override fun check() = println("TaskCustomizer is checking secondTaskType $taskType")

    override fun complete() = println("TaskCustomizer is completing secondTaskType $taskType")
}