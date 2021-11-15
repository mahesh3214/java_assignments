package javaassignments;

interface SimpleInterest
{
	public double si(double p,double r,double t);
}
public class SimpleInterest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleInterest s=(var p,var r,var t)->p*r*t/100;
		System.out.println(s.si(200, 30, 2));
	}

}