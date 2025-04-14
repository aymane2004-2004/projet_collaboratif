public class Calculatrice {
    public int addition(int a, int b) {
        return a + b;
    }

    public int soustraction(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public int division(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("Division par zéro");
        return a / b;
    }

    public int puissance(int a, int b) {
        if (b < 0) throw new IllegalArgumentException("Exposant négatif non supporté");
        return (int)Math.pow(a, b);
    }
}
