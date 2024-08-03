package creational.factory.product

class ThirdProductFactory : ProductFactory() {
    override fun produce(): Product = ThirdProduct()
}