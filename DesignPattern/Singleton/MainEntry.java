package DesignPattern.Singleton;

public class MainEntry {
    public static void main(String[] args) {
        // King king = new King();  // 오류 발생 - King 클래스의 생성자 "King"에 접근할 수 없다.
        King king = King.getInstance();

        king.say();

        // King 클래스 객체 king2가 이전에 메서드 King.getInstance(); 호출 결과로 
        // 반환된 객체 king와 동일한지 확인하기 
        King king2 = King.getInstance();
        if(king == king2) {
            System.out.println("same object");
        }
        else {
            System.out.println("different object");
        }
    }
}
