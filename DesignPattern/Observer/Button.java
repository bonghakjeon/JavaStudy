// [자바 디자인 패턴 이해] 스터디
// 15강 옵저버 패턴 (Observer) - 1
// 유튜브 참고 URL - 
// https://youtu.be/4w4AV1HURJs?si=_fO_KoOqfJts71iF

package DesignPattern.Observer;

public class Button {
    public void onClick() {
        // 이벤트 처리 
        // 클릭 이벤트 발생했을 때, onClickListner가 null이 아닐 때, 
        // 자기 자신(this)을 인자로 넘기는 
        // 함수 onClick을 업데이트 처리 
        if(onClickListner != null) onClickListner.onClick(this);
    }

    public interface OnClickListner {
        public void onClick(Button button);
    }

    private OnClickListner onClickListner;

    public void setOnClickListner(OnClickListner onClickListner) {
        this.onClickListner = onClickListner;
    }
}
