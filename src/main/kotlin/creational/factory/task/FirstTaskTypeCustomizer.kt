package creational.factory.task

internal class FirstTaskTypeCustomizer<T>(private val taskType: T) : TaskCustomizer<FirstTaskType> {

    override fun check() = println("TaskCustomizer is checking firstTaskType $taskType")

    override fun complete() = println("TaskCustomizer is completing firstTaskType $taskType")
}