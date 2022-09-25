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
        int numeratorAdd = this.numerator * fraction.getDenominator() + fraction.getNumerator() * this.denominator;
        int denominatorAdd = this.denominator * fraction.getDenominator();
        return new Fraction(numeratorAdd, denominatorAdd);
    }

    public Fraction multiply(Fraction fraction) {
        int numeratorMultiply = this.numerator * fraction.getNumerator();
        int denominatorMultiply = this.denominator * fraction.getDenominator();
        return new Fraction(numeratorMultiply, denominatorMultiply);
    }

    public Fraction divide(Fraction fraction) {
        int numeratorDivide = this.numerator * fraction.getDenominator();
        int denominatorDivide = this.denominator * fraction.getNumerator();
        return new Fraction(numeratorDivide, denominatorDivide);
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
}