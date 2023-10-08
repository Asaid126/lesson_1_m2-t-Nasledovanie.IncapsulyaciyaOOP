public class Main {
    public static void main(String[] args) {
        String[] commands={"Sidet","Golos"};
        Shelter shelter=new Shelter("spot","3 mkr");
        Shelter shelter1=new Shelter("Dogs","1 mkr");
        Dog dog=new Dog("Rex","ovcharka",commands,ColorEnum.BROWN,shelter);
       System.out.println(dog.getInfo());
        dog.makeVoice();
        dog.makeVoice("av av");
        Dog dog1=new Dog("Chapy","dvornyajka",ColorEnum.GRAY,shelter1);
        System.out.println(dog1.getInfo());
        dog1.makeVoice("hr hr");
    }

}