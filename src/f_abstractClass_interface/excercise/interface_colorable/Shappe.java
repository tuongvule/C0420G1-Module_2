package f_abstractClass_interface.excercise.interface_colorable;

public abstract class Shappe {
    private String color = "green";
    private boolean filled = true;
    public Shappe(){
    }
    public Shappe(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                "and"+(isFilled()?"filled":"not filled")+
                '}';
    }
}
