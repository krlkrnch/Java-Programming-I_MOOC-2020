
public class Main {

    public static void main(String[] args) {
        Item chair = new Item("Black", 4);
        Item skate = new Item("Yellow", 4);
        Item house = new Item("Red", 6);
        Item pencil = new Item("Blue", 7);

        Suitcase karelcase = new Suitcase(10);

        karelcase.addItem(chair);

        karelcase.addItem(skate);

        karelcase.addItem(house);
        Hold hold = new Hold(100);
        hold.addSuitcase(karelcase);

//        System.out.println("The suitcase contains the following items: ");
//        karelcase.printItems();
//        System.out.println(hold);
//        System.out.println("Total Weight: " + karelcase.totalWeight() + " kg");
//        System.out.println("Heaviest item: " + karelcase.heaviestItem());

        System.out.println("The suitcases in the hold contain the following items:");
        hold.printItems();

    }

}
