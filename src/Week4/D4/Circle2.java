package Week4.D4;

import static java.lang.Math.pow;

public class Circle2 {

        int radius;
        int d;
        double a;
        double c;
        public Circle2 Circle2;

        public Circle2() {
            this.radius = 15;
            this.d = 2 * (radius);
            this.a = 3.14 * pow(radius, 2);
            this.c = 2 * 3.14 * radius;
        }



    public int getradius(){
        return this.radius;
    }

    public void setradius(int radius){
        this.radius = radius;
    }
    public int getd(){
        return this.d;
    }

    public void setd(int d){
        this.d = d;
    }

    public double geta(){
        return this.a;
    }

    public void seta(double a){
        this.a = a;
    }

    public double getc(){
        return this.c;
    }

    public void setc(double c){
        this.c = c;
    }

    public Circle2 getCircle2(){
        return this.Circle2;
    }

    public void setCircle2(Circle2 Circle2){
        this.Circle2 = Circle2;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;
        if (obj == null
                || this.getClass() != obj.getClass())
            return false;
        Circle2 Circle2 = (Circle2)obj;
        return this.Circle2 == Circle2.Circle2
                && this.radius == Circle2.radius;

    }
}
