public class Rectangle extends Shape {
    public Rectangle(int SIZEX, int SIZEY) {
        super(SIZEX, SIZEY);
        fill();
    }

    @Override
    public void fill() {
        for (int i = 0; i < SIZEY ; i++) {
            for (int j = 0; j < SIZEX ; j++) {
System.out.print("*");
            }
            System.out.println();
        }

        }

        // TODO
    }

