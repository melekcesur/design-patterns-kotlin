package creational.factory.product

class FirstProductFactory : ProductFactory() {
    override fun produce(): Product = FirstProduct()
}