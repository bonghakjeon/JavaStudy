package Knou.Ch03;

public class Employee {
    int nSalary;

    String szDept = null;

    public void doJob() { System.out.println("Do something"); }
}

class Salesmain extends Employee {
    public Salesmain() { szDept = "Sales Dept"; }
    public void doJob() { System.out.println("Do sales"); }
}
