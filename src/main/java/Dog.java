public class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Vuf");

    }

    @Override
    public boolean showMood(boolean angry, boolean happy) {
        return false;
    }

    @Override
    public void showMood(boolean mood) {
        if(mood) {
            System.out.println("Logrer");

        }else {
            System.out.println("Knurrer");
        }
    }
}
