public class AnimalTester {
    public static void main(String[] args) {

        Elephant elephant = new Elephant("Dumbo");
        Tiger tiger = new Tiger("Niala");

        elephant.feed();
        elephant.feed();
        elephant.addFood();
        elephant.showAnimalState();

        tiger.feed();
        tiger.addFood();
        tiger.addFood();
        tiger.feed();
        tiger.showAnimalState();

    }
}
