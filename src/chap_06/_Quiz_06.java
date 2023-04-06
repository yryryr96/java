package chap_06;

public class _Quiz_06 {
    public static String getHiddenData(String name, int cnt){
        String result = name.substring(0,cnt);
        for (int i = 0; i <name.length()-cnt ; i++) {
            result += '*';
        }
        return result;
    }

    public static void main(String[] args) {
        String name = "나동빈";
        String id = "990130-1234567";
        String phone = "010-4848-2717";
        System.out.println(getHiddenData(name,1));
        System.out.println(getHiddenData(id,8));
        System.out.println(getHiddenData(phone,9));

    }
}
