package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        double temp=0;
        if ( salary <= 10000 && salary > 0) {
            temp = (salary*15)/100.0;
            System.out.println(salary-temp);
        } else if ( salary > 1000 && salary <= 20000) {
            temp = (salary*18)/100.0;
            System.out.println(salary-temp);
        } else if ( salary > 20000 ) {
            temp = (salary*20)/100.0;
            System.out.println(salary-temp);   
        } else if (salary < 0 ) {
            System.out.println("wrong input!");
        } 
    }
}
