public class FruitShop {
  public static void main(String[] args) {
    FruitJuice juice = new FruitJuice();
    juice.size = FruitJuice.FruitJuiceSize.SMALL;
    System.out.println("Fruit Juice Size: "+juice.size);
  }
}

class FruitJuice{
  enum FruitJuiceSize{ SMALL, MEDIUM, LARGE}
  FruitJuiceSize size;
}
