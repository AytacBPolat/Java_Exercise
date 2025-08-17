public class EmployeeSalary {
    String name;
    double salary;
    int workHours;
    int hireYear;
    EmployeeSalary(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    double tax(){
        if(this.salary >= 1000){
            return this.salary * 0.03;
        }else{
            return this.salary;
        }
    }
    double bonus(){
        double extraShiftPrice = 0.0;
        if(this.workHours > 40){
            return extraShiftPrice = this.salary + (30 * (this.workHours - 40));
        }else{
           return extraShiftPrice +=this.salary;
        }
    }
    double raiseSalary(){
        int thisyear = 2025;
        int yearsWorked = thisyear - this.hireYear;
        if(yearsWorked < 10){
           return this.salary *= 0.05;
        }else if( yearsWorked < 20){
            return this.salary *= 0.1;
        }else {
             return this.salary *= 0.15;
        }
    }
    public String toString(){
        double tax = tax();
        double bonus = bonus();
        double raise = raiseSalary();
        double salaryWithTaxAndBonus = this.salary - tax + bonus;
        double totalSalary = this.salary + raise;

        return "Name-Surname: "+this.name+"\nSalary: " + salaryWithTaxAndBonus + "\nWork Hours : "+this.workHours+"\nHire Year : "+this.hireYear+"\nTax : "+tax+"\nBonus : "+bonus+"\nRaise : "+raise+ "\nSalary with tax and bonuses :"+salaryWithTaxAndBonus + "\nTotal Salary : "+salaryWithTaxAndBonus+"\nTotal :"+totalSalary;
    }
}
