public class Q1 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Lion();
        animals[1] = new Elephant();
        animals[2]= new Penguin();

        for(Animal animal : animals){
            animal.move();
            animal.makeSound();
        }
    }
}
