package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        // 배열 : 같은 자료형의 값 여러 개를 저장하는 연속된 공간

        // 배열 선언 첫 번째 방법
        // String[] coffees = new String[4];

        // 배열 선언 두 번째 방법
        // String coffees[] = new String[4];
//        coffees[0] = "아메리카노";
//        coffees[1] = "카페모카";
//        coffees[2] = "라떼";
//        coffees[3] = "카푸치노";

        // 배열 선언 세 번재 방법
        // String[] coffees = new String[] { "아메리카노", "카페모카","라떼","카푸치노"};

        // 배열 네번째 방법
        String[] coffees = {"아메리카노","카페모카","라떼","카푸치노"};
        for (int i = 0; i < coffees.length ; i++) {
            System.out.println(coffees[i]);
        }

        int[] i = new int[3];
        for (int j = 0; j < 3 ; j++) {
            i[j] = j;
        }

        for (int j = 0; j < i.length ; j++) {
            System.out.println(i[j]);
        }

        // enhanced for (for-each) 반복문
        for (String coffee : coffees){
            System.out.println(coffee);
        }

        for (int num : i ){
            System.out.println(num);
        }
    }
}
