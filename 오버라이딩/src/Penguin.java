public class Penguin extends Animal {
    @Override
    public void move(){
        System.out.println("펭귄이 미끄러지듯이 이동합니다");
    }
    @Override
    public void makeSound(){
        System.out.println("펭귄이 삐약삐약 울어요!");
    }
}
