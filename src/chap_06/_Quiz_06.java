package chap_06;

public class _Quiz_06 {
    public static String getHiddenData(String st, int idx){
        String result = st.substring(0,idx);
        for (int i = idx; i < st.length() ; i++) {
            result += "*";
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
