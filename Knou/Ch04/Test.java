package Knou.Ch04;

import Knou.Ch04.Abst.Employee;
import Knou.Ch04.Concrete.Salesman;

public class Test {
    public static void main(String[] args) {
        Employee emp;
        emp = new Salesman();
        emp.doJob();   // "do Sales"가 출력됨

        emp = new Employee();
        emp.doJob();   // "do develoment"가 출력됨
        System.out.println(emp.nSalary);
    }
}
