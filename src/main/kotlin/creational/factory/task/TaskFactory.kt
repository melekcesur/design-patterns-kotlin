package creational.factory.task

interface TaskFactory {
    fun createTask(type: TaskType): Task
}