public class RecipeTest {
    public static void main(String[] args){
        Product bananas = new Product("банан",100.0,4);
        Product carrot = new Product("морковь",200.0,5);
        Product cabbage = new Product("капуста",300.0,6);

        System.out.println();
        Recipe recipe1 = new Recipe("recipe#1");
        recipe1.addProductToList(bananas);
        recipe1.addProductToList(bananas);
        recipe1.addProductToList(cabbage);
        recipe1.checkProduct("банан");
        recipe1.checkProduct("вишня");
        System.out.println(recipe1.getTotalCostAllProducts());

    }
}
