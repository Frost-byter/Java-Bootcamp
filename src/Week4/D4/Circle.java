package Week4.D4;

import static java.lang.Math.pow;

public class Circle {

    int radius;
    int d;
    double a;
    double c;
    public Circle Circle;

    public Circle() {
        this.radius = 20;
        this.d = 2 * radius;
        this.a = 3.14 * pow(radius, 2);
        this.c = 2 * 3.14 * radius;


    }


    public int getradius() {
        return this.radius;
    }

    public void setradius(int radius) {
        this.radius = radius;
    }

    public int getd() {
        return this.d;
    }

    public void setd(int d) {
        this.d = d;
    }

    public double geta() {
        return this.a;
    }

    public void seta(double a) {
        this.a = a;
    }

    public double getc() {
        return this.c;
    }

    public void setc(double c) {
        this.c = c;
    }

    public Circle getCircle() {
        return this.Circle;
    }

    public void setCircle(Circle Circle) {
        this.Circle = Circle;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;
        if (obj == null
                || this.getClass() != obj.getClass())
            return false;
        Circle Circle = (Circle)obj;
        return this.Circle == Circle.Circle
                && this.radius == Circle.radius;

    }

}
