public class Rectangle extends Shape {
    public Rectangle(int SIZEX, int SIZEY) {
        super(SIZEX, SIZEY);
        fill();
    }

    @Override
    public void fill() {
        for (int PIXELX = 0; PIXELX < SIZEX; PIXELX++) {
            for (int PIXELY = 0; PIXELY < SIZEY; PIXELY++) {
                    fillPixel(PIXELX, PIXELY);
            }
        }
    }
}

