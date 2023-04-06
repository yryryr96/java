package chap_06;

public class _08_MainMethod {
    public static void main(String[] args) {
        for (String s :
                args) {
            System.out.println(s);
        }

        if (args.length==1) {
            switch (args[0]) {
                case "1":
                    System.out.println("도서조회");
                    break;
                case "2":
                    System.out.println("도서대출");
                    break;
                case "3":
                    System.out.println("도서반납");
                    break;
            }
        } else {
            System.out.println("사용법) 1~3");
        }

    }
}
