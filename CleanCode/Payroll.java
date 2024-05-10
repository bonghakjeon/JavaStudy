public class Payroll {
    // throws 문법 - 예외 처리를 해당 메소드를 호출한 상위 메소드로 미루어 처리하는 기능 
    // 참고 URL -  https://bvc12.tistory.com/196
    // public Money calculatePay(Employee e) throws InvalidEmployeeType {
    //     switch (e.type) {
    //         case COMMISSIONED:
    //             return calculateCommissionedPay(e);
    //         case HOURLY:
    //             return calculateHourlyPay(e);
    //         case SALARIED:
    //             return calculateSalariedPay(e);
    //         default:
    //             throw new InvalidEmployeeType(e.Type); 
    //     }
    // }

    
}

public abstract class Employee {
    public abstract boolean isPayday();
    public abstract Money calculatePay();
    public abstract void deliverPay(Money pay);
}
    
public interface EmployeFactory {
    public Employee makEmployee(EmployeeRecord r) throws InvalidEmployeeType;
        
}

public class EmployeeFactoryImpl implements EmployeFactory {
    public Employee makEmployee(EmployeeRecord r) throws  {
        switch (r.type) {
            case COMMISIONED:
                return new CommissionedEmployee(r) ;
            case HOPURLY:
                return new HourlyEmployee(r);
            case SALARIED:
                return new SalariedEmployee(r);
            default:
                throw new InvalidEmployeeType(r.type);
        }
    }
}


