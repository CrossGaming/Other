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
	public Fraction add(int a)
	{
		
	}
	public Fraction add(Fraction f)
	{
		
	}
	public Fraction subtract(int s)
	{
		
	}
	public Fraction subtract(Fraction s)
	{
		
	}
	public Fraction multiply(int m)
	{
		
	}
	public Fraction multiply(Fraction m)
	{
		
	}
	public Fraction divide(int d)
	{
		
	}
	public Fraction divide(Fraction d)
	{
		
	}
	public Fraction simplify()
	{
		
	}
	public double valueOf(Fraction f)
	{
		return f.numerator/f.denominator;
	}
}
