package es.upm.miw.iwvg_devops.practica;

public class Fraction {

    private int numerator;

    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public double decimal() {
        return (double) numerator / denominator;
    }

    public boolean isProper() {
        return this.numerator < this.denominator;
    }

    public boolean isImproper() {
        return this.numerator > this.denominator;
    }

    public boolean isEquivalent() {
        return this.numerator == this.denominator;
    }

    public Fraction add(Fraction fraction) {
        int numerator = this.numerator * fraction.getDenominator() + fraction.getNumerator() * this.denominator;
        int denominator = this.denominator * fraction.getDenominator();
        return new Fraction(numerator, denominator);
    }

    public Fraction multiply(Fraction fraction) {
        int numerator = this.numerator * fraction.getNumerator();
        int denominator = this.denominator * fraction.getDenominator();

        return new Fraction(numerator, denominator);
    }

    public Fraction divide(Fraction fraction) {
        int numerator = this.numerator * fraction.getDenominator();
        int denominator = this.denominator * fraction.getNumerator();

        return new Fraction(numerator, denominator);
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
}