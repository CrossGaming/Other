package misc;
import java.util.*;
import java.math.*;
public class Fraction
{
	private int first;
	private int last;
	public Fraction(int f, int l)
	{
		this.first = f;
		this.last = l;
	}
	public int getNumerator()
	{
		return this.first;
	}
	public void setNumerator(int n)
	{
		this.first = n;
	}
	public int getDenominator()
	{
		return this.last;
	}
	public void setDenominator(int d)
	{
		this.last = d;
	}
	public String toString()
	{
		return this.first + "/" + this.last;
	}
	public boolean equals(Object obj)
	{
		Fraction otherFraction = (Fraction)obj;
		if (this.first == otherFraction.first && this.last == otherFraction.last)
		{
			return true;
		}
		return false;
	}
	public double getValue()
	{
		return this.first/this.last;
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
		return f.first/f.last;
	}
}