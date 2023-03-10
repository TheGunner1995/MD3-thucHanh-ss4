public class Hieu {
    double w ;
    double h ;

    public Hieu(double w, double h) {
        this.w = w;
        this.h = h;
    }

    public double getArea() {
        return this.w * this.h;
    }

    public double getPrimeter() {
        return (this.w + this.h)*2;
    }
    public String display(){
        return "hieu{"+ "w: "+w+ " ,h: "+h+"}";
    }
}
