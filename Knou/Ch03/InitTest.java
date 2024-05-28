package Knou.Ch03;

public class InitTest {
    int nNormal = 0;          // 일반 필드의 초기화 

    static int nStatic = 0;   // static 필드의 초기화 
    {                         // 일반 초기화 블록 
        nNormal = 1; 
    }

    static {                  // 정적 초기화 블록 
        nStatic = 1;
    }

    public InitTest() {       // 생성자
        nNormal = 2;
        nStatic = 20;
    }

    public static void main(String[] args) {
        InitTest ini = new InitTest();
        System.out.println(ini.nStatic);
        System.out.println(ini.nNormal);
    }
}
