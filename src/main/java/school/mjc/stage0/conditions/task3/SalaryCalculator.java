package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if ( salary <= 10000 ) {
            System.out.println(salary*0.15);
        } else if ( salary > 1000 && salary <= 20000) {
            System.out.println(salary*0.18);
        } else if ( salary > 20000 ) {
            System.out.println(salary*0.2);   
        } else if (salary < 0 ){
            System.out.println("wrong input!");
        } 
    }
}
