// [자바 디자인 패턴 이해] 
// 3강 템플릿 메소드 패턴(Template Method Pattern)
// 유튜브 참고 URL - 
// https://youtu.be/qr7I18Lhsl8?si=o1qIoKHf_1I6IGc_
package DesignPattern.TemplateMethod.Test;

public abstract class AbstGameConnectHelper {
    protected abstract String doSecurity(String string);                     // 보안 과정
    protected abstract boolean authentication(String id, String password);   // 인증 과정
    protected abstract int authorization(String userName);                   // 권한 과정
    protected abstract String connection(String info);                       // 접속 과정
    
    // 템플릿 메소드 (Template Method)
    public String requestConnection(String encodedInfo) {
        String decodedInfo = doSecurity(encodedInfo);   // 보안 작업 -> 암호화 된 문자열 복호화

        // 반환된 것을 가지고 아이디, 암호를 할당한다.
        String id = "aaa";
        String password = "bbb";

        boolean result = authentication(id, password);

        if(false == result) {
            throw new Error("아이디 암호 불일치");
        }

        String userName = "userName";
        int i = authorization(userName);

        switch(i) {
            case -1:
                throw new Error("셧다운");
            case 0:   // 게임 매니저
                System.out.println();
                break;
            case 1:   // 유료 회원
                System.out.println();
                break;
            case 2:   // 무료 회원
                System.out.println();
                break;
            case 3:   // 권한 없음 
                System.out.println();
                break;
            default:  // 기타 상황

                break;
        }

        return connection(decodedInfo);
    }                   
}