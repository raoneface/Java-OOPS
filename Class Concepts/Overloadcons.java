class Box {
    double width;
    double height;
    double depth;

    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double len) {
        width = height = depth = len;
    }

    Box(double w, double h, double d) {
        this.depth = d;
        this.height = h;
        this.width = w;
    }

    double volume() {
        return depth * height * width;
    }
}

public class Overloadcons {
    public static void main(String[] args) {
        Box ob1 = new Box(0, 0, 0);
        Box ob2 = new Box(12);
        Box ob3 = new Box();
        double vol;
        vol = ob1.volume();
        System.out.println(vol);
        vol = ob2.volume();
        System.out.println(vol);
        vol = ob3.volume();
        System.out.println(vol);
    }
}
