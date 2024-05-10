package Knou.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator(6, 4);
        
        // System.out.println(cal.num1);  // 오류 - 접근 제한자 private 설정(같은 패키지 여도 클래스가 서로 다르면 데이터 필드 접근 불가) 
        // System.out.println(cal.num2);  // 오류 - 접근 제한자 private 설정(같은 패키지 여도 클래스가 서로 다르면 데이터 필드 접근 불가) 

        System.out.println("더한 결과 : " + cal.getAdd());            // 두 수 (6, 4) 더 한 결과 출력
        System.out.println("뺀 결과 : " + cal.getSub());              // 두 수 (6, 4) 뺀 결과 출력
        System.out.println("곱한 결과 : " + cal.getMul());            // 두 수 (6, 4) 곱한 결과 출력
        System.out.println("나눈 몫 결과 : " + cal.getQuo());         // 두 수 (6, 4) 나눈 몫 결과 출력 
        System.out.println("나눈 나머지 결과 : " + cal.getRemain());   // 두 수 (6, 4) 나눈 나머지 결과 출력
    }
}
