package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if ( salary <= 10000 && salary > 0) {
            System.out.println(salary*1.5);
        } else if ( salary > 1000 && salary <= 20000) {
            System.out.println(salary*1.8);
        } else if ( salary > 20000 ) {
            System.out.println(salary*2.0);   
        } else if (salary < 0 ){
            System.out.println("wrong input!");
        } 
    }
}
