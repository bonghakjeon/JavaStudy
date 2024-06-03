package Knou.Ch04.Concrete;

import Knou.Ch04.Abst.Employee;

public class Salesman extends Employee {
    int nSalary = 1; 
    public Salesman() { szDept = "Sales Dept"; }
    public void doJob() { System.out.println("do sales"); }   // 메소드 재정의
}
