package misc;

//Not needed silleh and i dun like warnings
//import java.util.*;
//import java.math.*;

public class Fraction
{
	private int numerator;
	private int denominator;
	public Fraction(int n, int d)
	{
		this.numerator = n;
		this.denominator = d;
	}
	public static Fraction convertToFraction(double d)
	{
		Double d2 = (Double) d; 
		String temp = d2.toString();
		char[] lol = temp.toCharArray();
		boolean pastd = false;
		int den = 1;
		for(int i = 0; i < lol.length; i++)
		{
			if(pastd)
			{
				den = den * 10;;
			}
			if(lol[i] == '.')
			{
				pastd = true;
			}
		}
		temp = temp.replaceAll( "[^\\d]", "" );
		int num = (int) Integer.parseInt(temp);
		return new Fraction(num, den).simplify();
	}
	public static Fraction parseFrac(String fract)
	{
		int num = 1;
		int den = 1;
		try
		{
			num = Integer.parseInt(fract.split("/")[0]);
			den = Integer.parseInt(fract.split("/")[1]);
		}
		catch(Exception ex) { }
		return new Fraction(num,den);
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
		return Integer.toString(this.numerator) + "/" + Integer.toString(this.denominator);
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
		return getLCM(this.denominator, f.denominator);
	}
	public static int getLCM(int a, int b)//Finds the least common multiple, for finding common denominators
	{
		return a*b/getGCD(a,b);
	}
	public static int getGCD(int a, int b)//Finds the greatest common devisor, for simplifying purposes
	{
		int temp; 
		while (b != 0)
		{ 
			temp = b; 
			b = a%temp; 
			a = temp; 
		} 
		return a; 
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