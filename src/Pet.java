import java.util.Random;

   public class Pet {
    private int age=generateDefaultAge();
    private ColorEnum colorEnum;
    private Shelter shelter;

    public int getAge() {
        return age;
    }

    public ColorEnum getColorEnum() {

        return colorEnum;
    }

    public Shelter getShelter() {

        return shelter;
    }

    /* public void setAge(int age) {
        this.age = age;
    } //после инициализации поля age сеттер для него уже не нужен*/

    public void setColorEnum(ColorEnum colorEnum) {
        this.colorEnum = colorEnum;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }
    private int generateDefaultAge(){
        Random random=new Random();
        return random.nextInt(1,11);

    }
    public String getInfo(){
        return "Age:"+age+
                "\nColor:"+colorEnum+"" +
                "\nShelter address:"+ shelter.getAddress()+
                "\nShelter name:" +shelter.getName();
    }

}
