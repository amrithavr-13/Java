interface Animal{
    public void makeSound();
    public void move();

}
class Bird implements Animal{
    public void makeSound(){
        System.out.println("Chirp");
    }
    public void move(){
        System.out.println("Fly");
    }
}
class Dog implements Animal{
    public void makeSound(){
        System.out.println("Bark");
    }
    public void move(){
        System.out.println("Run");
    }
}
class Zoo{
    public static void main(String[] args){
        Bird br = new Bird();
        Dog dg = new Dog();
        br.makeSound();
        br.move();
        dg.makeSound();
        dg.move();
        
    }
}