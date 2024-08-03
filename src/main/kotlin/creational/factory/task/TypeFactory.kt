package creational.factory.task

class TypeFactory : TaskFactory {
    override fun createTask(type: TaskType): Task =
        when (type) {
            TaskType.FirstTaskType -> FirstTaskType()
            TaskType.SecondTaskType -> SecondTaskType()
            TaskType.ThirdTaskType -> ThirdTaskType()
            else -> throw Exception("unknown task")
        }
}