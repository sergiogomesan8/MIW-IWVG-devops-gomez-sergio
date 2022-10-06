package es.upm.miw.iwvg_devops.code;

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

    public Fraction add(Fraction inputFraction) {
        Fraction addFraction = new Fraction();
        addFraction.denominator = this.denominator * inputFraction.denominator;
        addFraction.numerator = (addFraction.denominator / this.denominator * this.numerator)
                + (addFraction.denominator / inputFraction.denominator * inputFraction.numerator);
        return (addFraction);
    }


    public Fraction multiply(Fraction inputFraction) {
        Fraction multiplyFraction = new Fraction();
        multiplyFraction.denominator = this.denominator * inputFraction.denominator;
        multiplyFraction.numerator = this.numerator * inputFraction.numerator;
        return (multiplyFraction);
    }

    public Fraction divide(Fraction inputFraction) {
        Fraction divideFraction = new Fraction();
        divideFraction.denominator = this.denominator * inputFraction.numerator;
        divideFraction.numerator = this.numerator * inputFraction.denominator;
        return (divideFraction);
    }

    public boolean isProper() {
        return (this.numerator < this.denominator);
    }

    public boolean isImproper() {
        return (this.numerator >= this.denominator);
    }

    public boolean isEquivalent(Fraction inputFraction) {
        return (inputFraction.numerator * this.denominator == inputFraction.denominator * this.numerator);
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
}