package creational.factory

class SecondProductFactory : ProductFactory() {
    override fun produce(): Product = SecondProduct()
}