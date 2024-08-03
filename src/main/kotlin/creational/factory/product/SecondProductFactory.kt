package creational.factory.product

class SecondProductFactory : ProductFactory() {
    override fun produce(): Product = SecondProduct()
}