package homework3;

public abstract class Animal implements IAnimals{
    protected String type;
    protected int swim;
    protected int run;

    public Animal(String type, int swim, int run) {
        this.type = type;
        this.swim =swim;
        this.run = run;

    }

}
