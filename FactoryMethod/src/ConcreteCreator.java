public class ConcreteCreator implements ICreator {

  @Override
  public IProduct factoryMethod(int size) {
    return new ConcreteProduct(size);
  }
}
