public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("queijo");
        System.out.println("Ethan pediu uma " + pizza + "\n");

        pizza = chicagoStore.orderPizza("queijo");
        System.out.println("Joel pediu uma " + pizza + "\n");

        pizza = nyStore.orderPizza("mariscos");
        System.out.println("Ethan pediu uma " + pizza + "\n");

        pizza = chicagoStore.orderPizza("mariscos");
        System.out.println("Joel pediu uma " + pizza + "\n");

        pizza = nyStore.orderPizza("calabresa");
        System.out.println("Ethan pediu uma " + pizza + "\n");

        pizza = chicagoStore.orderPizza("vegetariana");
        System.out.println("Joel pediu uma " + pizza + "\n");
    }
}
