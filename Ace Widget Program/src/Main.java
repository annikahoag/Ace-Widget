import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Employee [] employees = new Employee[10];
		Employee employee = new Employee(); //for testing inputs before adding input to object array
		Scanner myObj = new Scanner(System.in);
		
		String name;
		double q1, q2, q3, q4;
		boolean isNeg;
		int employeeCounter=0;
		int userInput;
		double largeQ1, largeQ2, largeQ3, largeQ4, largeTotal;
		double smallQ1, smallQ2, smallQ3, smallQ4, smallTotal;
		double totalQ1=0, totalQ2=0, totalQ3=0, totalQ4=0, yearlyTotal=0;
		double averageQ1, averageQ2, averageQ3, averageQ4, yearAverage;
		int highQuarter, lowQuarter;
		double highQuarterAmount, lowQuarterAmount;
		
		
		//welcome screen
		System.out.println("***********************************");
		System.out.println("*                                 *");
		System.out.println("*           Welcome to            *");
		System.out.println("*       Ace Widget Company's      *");
		System.out.println("*          Sales Database         *");
		System.out.println("*                                 *");
		System.out.println("***********************************");
		
		//first two employees
		System.out.println("Please start by entering 2 employees' data.");
		for (int i = 0; i<2; i++) {
			myObj = new Scanner (System.in);
			employees[i] = new Employee();
			
			System.out.println("Please enter an employee's name: ");
			name = myObj.nextLine();
			employees[i].setName(name);
			
			
			System.out.println("Please enter the employee's quarter 1 sales: ");
			q1 = myObj.nextDouble();
			isNeg = employee.checkNeg(q1);
			
			if (isNeg == true) {
				System.out.println("Error. Please only enter positive numbers.");
				System.out.println("Please enter the employee's quarter 1 sales: ");
				q1 = myObj.nextDouble();
				isNeg = employee.checkNeg(q1);
				if (isNeg == true) {
					System.out.println("Error. Sale will be set to $0.00");
					q1 = 0;
				}
			}else {
				employees[i].setSale1(q1);
			}
			
			
			System.out.println("Please enter the employee's quarter 2 sales: ");
			q2 = myObj.nextDouble();
			isNeg = employee.checkNeg(q2);
			
			if (isNeg == true) {
				System.out.println("Error. Please only enter positive numbers.");
				System.out.println("Please enter the employee's quarter 2 sales: ");
				q2 = myObj.nextDouble();
				isNeg = employee.checkNeg(q2);
				if (isNeg == true) {
					System.out.println("Error. Sale will be set to $0.00");
					q2 = 0;
				}
			}else {
				employees[i].setSale2(q2);
			}
			
			
			System.out.println("Please enter the employee's quarter 3 sales: ");
			q3 = myObj.nextDouble();
			isNeg = employee.checkNeg(q3);
			
			if (isNeg == true) {
				System.out.println("Error. Please only enter positive numbers.");
				System.out.println("Please enter the employee's quarter 3 sales: ");
				q3 = myObj.nextDouble();
				isNeg = employee.checkNeg(q3);
				if (isNeg == true) {
					System.out.println("Error. Sale will be set to $0.00");
					q3 = 0;
				}
			}else {
				employees[i].setSale3(q3);
			}
			
			
			System.out.println("Please enter the employee's quarter 4 sales: ");
			q4 = myObj.nextDouble();
			isNeg = employee.checkNeg(q4);
			
			if (isNeg == true) {
				System.out.println("Error. Please only enter positive numbers.");
				System.out.println("Please enter the employee's quarter 4 sales: ");
				q4 = myObj.nextDouble();
				isNeg = employee.checkNeg(q4);
				if (isNeg == true) {
					System.out.println("Error. Sale will be set to $0.00");
					q4 = 0;
				}
			}else {
				employees[i].setSale4(q4);
			}
			employeeCounter=2;
			
		}//end of first for loop
		
		
		//runs until there are 10 employees
		while (employeeCounter <= 10) {
			
			//users options to be done at any time
			System.out.println("\nWhat would you like to do? \n"
					+ "Please enter 1 if you want to add more employees. \n"
					+ "Please enter 2 if you want to see the sales of every employee. \n"
					+ "Please enter 3 if you want to see data for a specific employee. \n"
					+ "Please enter 4 if you want to see the employee(s) with the highest sales. \n"
					+ "Please enter 5 if you want to see the employee(s) with the lowest sales. \n"
					+ "Please enter 6 to end and see a summary of sales.");
			userInput = myObj.nextInt();
			
			
			
				
			switch (userInput) {
			
				//adds more employees
				case 1: userInput = 1;
					System.out.println("You will be stopped once you reach 10 employees.");
					System.out.println("There are currently " + employeeCounter + " employees.");
					employeeCounter++;
					
					if (employeeCounter <= 10) {
						myObj = new Scanner (System.in);
						employees[employeeCounter-1] = new Employee();
						
						System.out.println("Please enter an employee's name: ");
						name = myObj.nextLine();
						employees[employeeCounter-1].setName(name);
						
						
						System.out.println("Please enter the employee's quarter 1 sales: ");
						q1 = myObj.nextDouble();
						isNeg = employee.checkNeg(q1);
						
						if (isNeg == true) {
							System.out.println("Error. Please only enter positive numbers.");
							System.out.println("Please enter the employee's quarter 1 sales: ");
							q1 = myObj.nextDouble();
							isNeg = employee.checkNeg(q1);
							if (isNeg == true) {
								System.out.println("Error. Sale will be set to $0.00");
								q1 = 0;
							}
						}else {
							employees[employeeCounter-1].setSale1(q1);
						}
						
						
						System.out.println("Please enter the employee's quarter 2 sales: ");
						q2 = myObj.nextDouble();
						isNeg = employee.checkNeg(q2);
						
						if (isNeg == true) {
							System.out.println("Error. Please only enter positive numbers.");
							System.out.println("Please enter the employee's quarter 2 sales: ");
							q2 = myObj.nextDouble();
							isNeg = employee.checkNeg(q2);
							if (isNeg == true) {
								System.out.println("Error. Sale will be set to $0.00");
								q2 = 0;
							}
						}else {
							employees[employeeCounter-1].setSale2(q2);
						}
						
						
						System.out.println("Please enter the employee's quarter 3 sales: ");
						q3 = myObj.nextDouble();
						isNeg = employee.checkNeg(q3);
						
						if (isNeg == true) {
							System.out.println("Error. Please only enter positive numbers.");
							System.out.println("Please enter the employee's quarter 3 sales: ");
							q3 = myObj.nextDouble();
							isNeg = employee.checkNeg(q3);
							if (isNeg == true) {
								System.out.println("Error. Sale will be set to $0.00");
								q3 = 0;
							}
						}else {
							employees[employeeCounter-1].setSale3(q3);
						}
						
						
						System.out.println("Please enter the employee's quarter 4 sales: ");
						q4 = myObj.nextDouble();
						isNeg = employee.checkNeg(q4);
						
						if (isNeg == true) {
							System.out.println("Error. Please only enter positive numbers.");
							System.out.println("Please enter the employee's quarter 4 sales: ");
							q4 = myObj.nextDouble();
							isNeg = employee.checkNeg(q4);
							if (isNeg == true) {
								System.out.println("Error. Sale will be set to $0.00");
								q4 = 0;
							}
						}else {
							employees[employeeCounter-1].setSale4(q4);
						}
						
						
						
					} 
					break;
				
				//outputs sales of all employees
				case 2: userInput = 2;
					for (int i = 0; i< employeeCounter; i++) {
						int index = i+1;
						System.out.print("Employee #" + index + ": " + employees[i].getName() + ", ");
						
						System.out.print("$");
						System.out.printf("%.2f" , employees[i].getSale1());
						System.out.print(", ");
						
						System.out.print("$");
						System.out.printf("%.2f" , employees[i].getSale2());
						System.out.print(", ");
						
						System.out.print("$");
						System.out.printf("%.2f" , employees[i].getSale3());
						System.out.print(", ");
						
						System.out.print("$");
						System.out.printf("%.2f" , employees[i].getSale4());
						System.out.print(", ");
						
						System.out.print("Total: $");
						System.out.printf("%.2f" , employees[i].getTotal());
						System.out.println(" ");
						
					
					}
					break;
		
				//outputs data of one employee
				case 3: userInput = 3;
					myObj = new Scanner(System.in);
					String inputName;
					boolean errorCheck=true;
					
					System.out.println("Whose data would you like to see? "
							+ "Be sure to type their name exactly as it was entered.");
					inputName = myObj.nextLine();
					
					for (int i =  0; i < employeeCounter; i++) {
						if (inputName.compareTo(employees[i].getName()) == 0) {
							System.out.print(employees[i].getName() + ": ");
							
							System.out.print("$");
							System.out.printf("%.2f" , employees[i].getSale1());
							System.out.print(", ");
							
							System.out.print("$");
							System.out.printf("%.2f" , employees[i].getSale2());
							System.out.print(", ");
							
							System.out.print("$");
							System.out.printf("%.2f" , employees[i].getSale3());
							System.out.print(", ");
							
							System.out.print("$");
							System.out.printf("%.2f" , employees[i].getSale4());
							System.out.print(", ");
							
							System.out.print("Total: $");
							System.out.printf("%.2f" , employees[i].getTotal());
							System.out.println(" ");
							
							errorCheck = false;
						}
					}
					if (errorCheck) {
						System.out.println("Error. Employee does not exist. Program will continue.");
					}
				
					break;
				
					
				//output employee w/ highest sales
				case 4: userInput = 4;
				
					//for quarter 1
					largeQ1 = employees[0].getSale1();
					for (int i = 1; i < employeeCounter; i++ ) {
						if (employees[i].getSale1() > largeQ1) {
							largeQ1 = employees[i].getSale1();
						}
					}
					
					System.out.print("Employee(s) with highest sales in Q1: ");
					for (int i = 0; i < employeeCounter; i++) {
						if (employees[i].getSale1() == largeQ1) {
							System.out.print(employees[i].getName() + ", ");
						}
					}
				
					System.out.print("The highest sale for Q1: $");
					System.out.printf("%.2f" , largeQ1);
					System.out.println(" ");
					
					
					//for quarter 2
					largeQ2 = employees[0].getSale2();
					for (int i = 1; i < employeeCounter; i++ ) {
						if (employees[i].getSale2() > largeQ2) {
							largeQ2 = employees[i].getSale2();
						}
					}
					
					System.out.print("Employee(s) with highest sales in Q2: ");
					for (int i = 0; i < employeeCounter; i++) {
						if (employees[i].getSale2() == largeQ2) {
							System.out.print(employees[i].getName() + ", ");
						}
					}
				
					System.out.print("The highest sale for Q2: $");
					System.out.printf("%.2f" , largeQ2);
					System.out.println(" ");
					
					
					//for quarter 3
					largeQ3 = employees[0].getSale3();
					for (int i = 1; i < employeeCounter; i++ ) {
						if (employees[i].getSale3() > largeQ3) {
							largeQ3 = employees[i].getSale3();
						}
					}
					
					System.out.print("Employee(s) with highest sales in Q3: ");
					for (int i = 0; i < employeeCounter; i++) {
						if (employees[i].getSale3() == largeQ3) {
							System.out.print(employees[i].getName() + ", ");
						}
					}
				
					System.out.print("The highest sale for Q3: $");
					System.out.printf("%.2f" , largeQ3);
					System.out.println(" ");
					
					
					//for quarter 4
					largeQ4 = employees[0].getSale4();
					for (int i = 1; i < employeeCounter; i++ ) {
						if (employees[i].getSale4() > largeQ4) {
							largeQ4 = employees[i].getSale4();
						}
					}
					
					System.out.print("Employee(s) with highest sales in Q4: ");
					for (int i = 0; i < employeeCounter; i++) {
						if (employees[i].getSale4() == largeQ4) {
							System.out.print(employees[i].getName() + ", ");
						}
					}
				
					System.out.print("The highest sale for Q4: $");
					System.out.printf("%.2f" , largeQ4);
					System.out.println(" ");
					
					//for total
					largeTotal = employees[0].getTotal();
					for (int i = 1; i < employeeCounter; i++ ) {
						if (employees[i].getTotal() > largeTotal) {
							largeTotal = employees[i].getTotal();
						}
					}
					
					System.out.print("Employee(s) with highest total sales: ");
					for (int i = 0; i < employeeCounter; i++) {
						if (employees[i].getTotal() == largeTotal) {
							System.out.print(employees[i].getName() + ", ");
						}
					}
				
					System.out.print("The highest total sale: $");
					System.out.printf("%.2f" , largeTotal);
					System.out.println(" ");
					
					break;
					
					
					
					
				//output employee w/ lowest sales 
				case 5: userInput = 5;
				
					//for quarter 1
					smallQ1 = employees[0].getSale1();
					for (int i = 1; i < employeeCounter; i++ ) {
						if (employees[i].getSale1() < smallQ1) {
							smallQ1 = employees[i].getSale1();
						}
					}
					
					System.out.print("Employee(s) with lowest sales in Q1: ");
					for (int i = 0; i < employeeCounter; i++) {
						if (employees[i].getSale1() == smallQ1) {
							System.out.print(employees[i].getName() + ", ");
						}
					}
				
					System.out.print("The lowest sale for Q1: $");
					System.out.printf("%.2f" , smallQ1);
					System.out.println(" ");
					
					
					//for quarter 2
					smallQ2 = employees[0].getSale2();
					for (int i = 1; i < employeeCounter; i++ ) {
						if (employees[i].getSale2() < smallQ2) {
							smallQ2 = employees[i].getSale2();
						}
					}
					
					System.out.print("Employee(s) with lowest sales in Q2: ");
					for (int i = 0; i < employeeCounter; i++) {
						if (employees[i].getSale2() == smallQ2) {
							System.out.print(employees[i].getName() + ", ");
						}
					}
				
					System.out.print("The lowest sale for Q2: $");
					System.out.printf("%.2f" , smallQ2);
					System.out.println(" ");

					
					//for quarter 3
					smallQ3 = employees[0].getSale3();
					for (int i = 1; i < employeeCounter; i++ ) {
						if (employees[i].getSale3() < smallQ3) {
							smallQ3 = employees[i].getSale3();
						}
					}
					
					System.out.print("Employee(s) with lowest sales in Q3: ");
					for (int i = 0; i < employeeCounter; i++) {
						if (employees[i].getSale3() == smallQ3) {
							System.out.print(employees[i].getName() + ", ");
						}
					}
				
					System.out.print("The lowest sale for Q3: $");
					System.out.printf("%.2f" , smallQ3);
					System.out.println(" ");
					
					
					//for quarter 4
					smallQ4 = employees[0].getSale4();
					for (int i = 1; i < employeeCounter; i++ ) {
						if (employees[i].getSale4() < smallQ4) {
							smallQ4 = employees[i].getSale4();
						}
					}
					
					System.out.print("Employee(s) with lowest sales in Q4: ");
					for (int i = 0; i < employeeCounter; i++) {
						if (employees[i].getSale4() == smallQ4) {
							System.out.print(employees[i].getName() + ", ");
						}
					}
				
					System.out.print("The lowest sale for Q4: $");
					System.out.printf("%.2f" , smallQ4);
					System.out.println(" ");
					
					
					//for total
					smallTotal = employees[0].getTotal();
					for (int i = 1; i < employeeCounter; i++ ) {
						if (employees[i].getTotal() < smallTotal) {
							smallTotal = employees[i].getTotal();
						}
					}
					
					System.out.print("Employee(s) with lowest total sales: ");
					for (int i = 0; i < employeeCounter; i++) {
						if (employees[i].getTotal() == smallTotal) {
							System.out.print(employees[i].getName() + ", ");
						}
					}
				
					System.out.print("The lowest total sale: $");
					System.out.printf("%.2f" , smallTotal);
					System.out.println(" ");
				
					break;
				
				//*EXTRA CREDIT*
				//to end program and summarize sales 
				case 6:
					
					//output Q1 total
					for (int i = 0; i < employeeCounter; i++) {
						totalQ1 = totalQ1 + employees[i].getSale1();
					}
					System.out.print("Ace Widget made $");
					System.out.printf("%.2f" , totalQ1);
					System.out.println(" in Quarter 1");
					
					//output Q2 total
					for (int i = 0; i < employeeCounter; i++) {
						totalQ2 = totalQ2 + employees[i].getSale2();
					}
					System.out.print("Ace Widget made $");
					System.out.printf("%.2f" , totalQ2);
					System.out.println(" in Quarter 2");
					
					//output Q3 total
					for (int i = 0; i < employeeCounter; i++) {
						totalQ3 = totalQ3 + employees[i].getSale3();
					}
					System.out.print("Ace Widget made $");
					System.out.printf("%.2f" , totalQ3);
					System.out.println(" in Quarter 3");
					
					//output Q4 total
					for (int i = 0; i < employeeCounter; i++) {
						totalQ4 = totalQ4 + employees[i].getSale4();
					}
					System.out.print("Ace Widget made $");
					System.out.printf("%.2f" , totalQ4);
					System.out.println(" in Quarter 4");
					
					//output total for entire year
					for (int i = 0; i < employeeCounter; i++) {
						yearlyTotal = yearlyTotal + employees[i].getTotal();
					}
					System.out.print("Ace Widget made a total of $");
					System.out.printf("%.2f" , yearlyTotal);
					System.out.println(" for the entire year");
					
					
					//output average for Q1
					averageQ1 = totalQ1 / employeeCounter;
					System.out.print("The average of Quarter 1 was $");
					System.out.printf("%.2f" , averageQ1);
					System.out.println(" ");
					
					//output average for Q2
					averageQ2 = totalQ2 / employeeCounter;
					System.out.print("The average of Quarter 2 was $");
					System.out.printf("%.2f" , averageQ2);
					System.out.println(" ");
					
					//output average for Q3
					averageQ3 = totalQ3 / employeeCounter;
					System.out.print("The average of Quarter 3 was $");
					System.out.printf("%.2f" , averageQ3);
					System.out.println(" ");
					
					//output average for Q4
					averageQ4 = totalQ4 / employeeCounter;
					System.out.print("The average of Quarter 4 was $");
					System.out.printf("%.2f" , averageQ4);
					System.out.println(" ");
					
					//output average for the whole year 
					yearAverage = yearlyTotal / 4;
					System.out.print("The average for the entire year was $");
					System.out.printf("%.2f" , yearAverage);
					System.out.println(" ");
					
					//output the best quarter
					highQuarter = 1;
					highQuarterAmount = totalQ1;
					
					if (totalQ2 > highQuarterAmount) {
						highQuarter = 2;
						highQuarterAmount = totalQ2;
					}if (totalQ3 > highQuarter) {
						highQuarter = 3;
						highQuarterAmount = totalQ3;
					}if (totalQ4 > highQuarter) {
						highQuarter = 4;
						highQuarterAmount = totalQ4;}

					System.out.print("The best quarter was Quarter " + highQuarter + " with: $");
					System.out.printf("%.2f" , highQuarterAmount);
					System.out.println(" ");
					
					
					//output the worst quarter
					lowQuarter = 1;
					lowQuarterAmount = totalQ1;
					
					if (totalQ2 < lowQuarterAmount) {
						lowQuarter = 2;
						lowQuarterAmount = totalQ2;
					}if (totalQ3 < highQuarter) {
						lowQuarter = 3;
						lowQuarterAmount = totalQ3;
					}if (totalQ4 < highQuarter) {
						lowQuarter = 4;
						lowQuarterAmount = totalQ4;}

					System.out.print("The worst quarter was Quarter " + lowQuarter + " with: $");
					System.out.printf("%.2f" , lowQuarterAmount);
					System.out.println(" ");
					
					
					
					employeeCounter = 11;
					break;
					
				//error check
				default:
					System.out.println("Error. Invalid input. Program will continue");
					break;
			
			}
		
		}//end of while loop
		
	}

}
