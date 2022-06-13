package web.model;

public class Car {
    private String model;
    private int godvypuska;
    private String color;


    public Car(){}


    public Car (String model, int godvypuska, String color){
        this.model = model;
        this.godvypuska = godvypuska;
        this.color = color;
    }

    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public int getGodvypuska(){
        return godvypuska;
    }
    public void setGodvypuska(int godvypuska){
        this.godvypuska = godvypuska;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

}
