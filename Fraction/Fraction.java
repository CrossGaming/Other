package misc;
import java.util.*;
import java.math.*;
public class Fraction
{
	private int numerator;
	private int denominator;
	public Fraction(int n, int d)
	{
		this.numerator = n;
		this.denominator = d;
	}
	public int getNumerator()
	{
		return this.numerator;
	}
	public void setNumerator(int n)
	{
		this.numerator = n;
	}
	public int getDenominator()
	{
		return this.denominator;
	}
	public void setDenominator(int d)
	{
		this.denominator = d;
	}
	public String toString()
	{
		return this.numerator + "/" + this.denominator;
	}
	public boolean equals(Object obj)
	{
		Fraction otherFraction = (Fraction)obj;
		if (this.numerator == otherFraction.numerator && this.denominator == otherFraction.denominator)
		{
			return true;
		}
		return false;
	}
	public double getValue()
	{
		return this.numerator/this.denominator;
	}
	public int getLCD(Fraction f)//Finds the least common denominator
	{
		
	}
	public static int getLCM(int a, int b)//Finds the least common multiple, for finding common denominators
	{
		
	}
	public static int getGCD(int a, int b)//Finds the greatest common devisor, for simplifying purposes
	{
		
	}
	public Fraction add(int a)
	{
		return new Fraction(this.numerator+(this.denominator*a),this.denominator);
	}
	public Fraction add(Fraction f)
	{
		return new Fraction(this.numerator*(this.getLCD(f)/this.denominator)+(f.numerator*(this.getLCD(f)/f.denominator)),this.getLCD(f));
	}
	public Fraction subtract(int s)
	{
		return new Fraction(this.numerator-(this.denominator*s),this.denominator);
	}
	public Fraction subtract(Fraction f)
	{
		return new Fraction(this.numerator*(this.getLCD(f)/this.denominator)-(f.numerator*(this.getLCD(f)/f.denominator)),this.getLCD(f));
	}
	public Fraction multiply(int m)
	{
		return new Fraction(this.numerator*m,this.denominator);
	}
	public Fraction multiply(Fraction m)
	{
		return new Fraction(this.numerator*m.numerator,this.denominator*m.denominator);
	}
	public Fraction divide(int d)
	{
		return new Fraction(this.numerator/d, this.denominator);
	}
	public Fraction divide(Fraction d)
	{
		return new Fraction(this.numerator*d.denominator, this.denominator*d.numerator);
	}
	public Fraction simplify()
	{
		return new Fraction(this.numerator/Fraction.getGCD(this.numerator, this.denominator),this.denominator/Fraction.getGCD(this.numerator, this.denominator));
	}
	public double findValue()
	{
		return this.numerator/this.denominator;
	}
}