package creational.factory.task

interface TaskCustomizer<T : Task> {
    fun check()
    fun complete()
}