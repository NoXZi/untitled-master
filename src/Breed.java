/**
 * Created by alexv on 22.08.2016.
 */
public class Breed extends Pets {
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    private String color;
    private String sound;


    public Breed(String name, Integer age, String sex, Integer legs, String color, String sound) {
        super(name, age, sex, legs);
        this.color = color;
        this.sound = sound;
    }











}
