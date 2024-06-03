package Knou.Ch04.Concrete;

import Knou.Ch04.Abst.Employee;

public class Developer extends Employee {
    int nSalary = 2; 
    public Developer() { szDept = "Dev. Dept"; }

    public void doJob() { System.out.println("do develoment"); }   // 메소드 재정의 
}
