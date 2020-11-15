
public class Employee {

	//instance variables
	String name;
	double q1, q2, q3, q4;
	double total;
	
	//constructor
	public Employee() {
		name=" ";
		q1=0;
		q2=0;
		q3=0;
		q4=0;
		total = 0;
	}
	
	//stores name
	public void setName(String employeeName) {
		name = employeeName;
		
	}
	
	//stores quarter 1 sale
	public void setSale1(double sale) {
		q1 = sale;
	}
	
	//stores quarter 2 sale
	public void setSale2(double sale) {
		q2 = sale;
	}
	
	//stores quarter 3 sale
	public void setSale3(double sale) {
		q3 = sale;
	}
	
	//stores quarter 4 sale
	public void setSale4(double sale) {
		q4 = sale;
	}
	
	
	//error check for negative sales
	public boolean checkNeg(double sale) {
		if (sale < 0) {
			return true;
		}else {
			return false;
		}
	}
	
	//returns name
	public String getName(){
		return name;
	}
	
	//returns rounded sale 1
	public double getSale1(){
		double roundedSale;
		roundedSale = this.round(q1);
		return roundedSale;
	}
	
	//returns rounded sale 2
	public double getSale2(){
		double roundedSale;
		roundedSale = this.round(q2);
		return roundedSale;
	}
	
	//returns rounded sale 3
	public double getSale3(){
		double roundedSale;
		roundedSale = this.round(q3);
		return roundedSale;
	}
	
	//returns rounded sale 4
	public double getSale4(){
		double roundedSale;
		roundedSale = this.round(q4);
		return roundedSale;
	}
	
	//finds total and returns rounded total
	public double getTotal() {
		double roundedSale;
		
		total = q1 + q2 + q3 + q4;
		roundedSale = this.round(total);
		return roundedSale;
	}
	
	//rounds sales 
	private double round(double sale) {
			double roundOff = Math.round(sale*100.0)/100.0;
			return roundOff;
		
	}
	

	 
}
