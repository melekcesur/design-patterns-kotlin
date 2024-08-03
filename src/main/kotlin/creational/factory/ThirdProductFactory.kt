package creational.factory

class ThirdProductFactory : ProductFactory() {
    override fun produce(): Product = ThirdProduct()
}