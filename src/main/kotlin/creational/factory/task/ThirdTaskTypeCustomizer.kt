package creational.factory.task

internal class ThirdTaskTypeCustomizer<T>(private val taskType: T) : TaskCustomizer<ThirdTaskType> {
    override fun check() = println("TaskCustomizer is checking thirdTaskType $taskType")

    override fun complete() = println("TaskCustomizer is completing thirdTaskType $taskType")
}