public class Samarreta {
    String color;
    byte talla; // Va de 0 (XS) a 5 (XXL)
    static boolean disponible = true;

    public static void provar() {
        System.out.println("T'estàs provant una samarreta");
        if (disponible) {
            System.out.println("Et queda genial");
        } else {
            System.out.println("No hi ha cap samarreta disponible");
        }
    }

    public Samarreta(String color, byte talla) {
        this.color = color;
        this.talla = talla;
    }
}
