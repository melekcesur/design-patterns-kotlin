package creational.factory

class FirstProductFactory : ProductFactory() {
    override fun produce(): Product = FirstProduct()
}