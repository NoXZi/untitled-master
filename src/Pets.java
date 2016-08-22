import java.util.ArrayList;

/**
 * Created by alexv on 22.08.2016.
 */
public class Pets {


    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getLegs() {
        return legs;
    }

    public void setLegs(Integer legs) {
        this.legs = legs;
    }

    private Integer age;
    private String sex;
    private Integer legs;



    public String sound() {
        return "муму";
    }

    public Pets(String name, Integer age, String sex, Integer legs) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.legs = legs;
    }
}













