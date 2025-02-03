public class Samarreta {
    String color;
    byte talla; // Va de 0 (XS) a 5 (XXL)
    private static boolean disponible = true;

    public void provar() {
        System.out.println("T'estàs provant una samarreta de color " + color + " i talla " + Samarreta.getTalla(talla));
        if (disponible) {
            System.out.println("Et queda genial");
        } else {
            System.out.println("No hi ha cap samarreta disponible");
        }
    }

    public static String getTalla(byte talla) {
        switch (talla) {
            case 0 -> {return "XS";}
            case 1 -> {return "S";}
            case 2 -> {return "M";}
            case 3 -> {return "L";}
            case 4 -> {return "XL";}
            case 5 -> {return "XXL";}
            default -> {return "Talla no vàlida";}  
        }
    }

    public Samarreta(String color, byte talla) {
        this.color = color;
        this.talla = talla;
    }
}
