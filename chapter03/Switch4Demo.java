// Coding By 김용선.

public class Switch4Demo {
    public static void main(String[] args) {
        whoIsIt("호랑이");
        whoIsIt("참새");
        whoIsIt("고등어");
        whoIsIt("곰팡이");
    }

    static void whoIsIt(String bio) {
        
        // 개선된 switch문, 자바14버전부터 사용가능.
        String kind = switch(bio) {
            case "호랑이", "사자" -> "포유류";
            case "독수리", "참새" -> "조류";
            case "고등어", "연어" -> "어류";
            default -> {
                System.out.print("어이쿠! ");
                yield "...";
            }
        };

        // String kind = switch(bio) {
        //     case "호랑이", "사자":
        //         yield "포유류";
        //     case "독수리", "참새":
        //         yield "조류";
        //     case "고등어", "연어":
        //         yield "어류";
        //     default:
        //         System.out.print("어이쿠! ");
        //         yield "...";
        //     };

        System.out.printf("%s는 %s이다.\n", bio, kind);
    }
}
