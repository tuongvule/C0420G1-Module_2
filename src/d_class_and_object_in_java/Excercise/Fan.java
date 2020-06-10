package d_class_and_object_in_java.Excercise;

public class Fan {
    final int SLOW =1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan(int speed) {
        this.speed = speed;
    }
    public Fan(){
        this.speed = SLOW;
        this.on=false;
        this.radius = 5;
        this.color="blue";
    }

    @Override
    public String toString() {
        return "Fan{" +
                "speed=" + speed +
                ", on=" + on +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(fan1.radius=10);
        fan1.setColor(fan1.color="yellow");
        fan1.setOn(fan1.on=true);
        System.out.println(fan1.toString());
        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.MEDIUM);
        fan2.setRadius(fan2.radius=10);
        fan2.setColor(fan2.color="blue");
        fan2.setOn(fan2.on=false);
        System.out.println(fan2.toString());
    }
}
