package creational.singleton

class ItemProvider private constructor() {

    companion object {
        //Volatile modifier is necessary
        @Volatile
        private var instance: ItemProvider? = null

        fun getInstance() =
            instance ?: synchronized(this) {
                instance ?: ItemProvider().also { instance = it }
            }
    }
}