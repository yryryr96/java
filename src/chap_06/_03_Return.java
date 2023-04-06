package chap_06;

public class _03_Return {
    public static String getPhoneNumber() {
        String phonenumber = "02-1234-5678";
        return phonenumber;
    }

    public static String getAddress() {
        return "서울어딘가";
    }

    public static String getActivity() {
        return "볼링장, 탁구장, 노래방";
    }

    public static void main(String[] args) {
        String contactnumber = getPhoneNumber();
        String address = getAddress();
        System.out.println(contactnumber);
        System.out.println(address);
        System.out.println(getActivity());
    }
}
