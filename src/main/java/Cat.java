public class Cat extends Animal {

    @Override
    public void makeSound(){
        System.out.println("Miaw");
    }

    @Override
    public boolean showMood(boolean angry, boolean happy) {
        return false;
    }

    @Override
    public void showMood(boolean mood) {
        if(mood){
        System.out.println("Spinder");

        }else {
                System.out.println("Hvæser");
            }

    }

}
