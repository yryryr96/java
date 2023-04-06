package chap_06;

public class _04_ParameterAndMethod {
      public static int getpower(int number) {
          int result = number*number;
          return result;
      }

//
//    public static void powerByExp(int number, int exponent){
//        int result = 1;
//        for (int i = 0; i < exponent ; i++) {
//            result *= number;
//        }
//        System.out.println(result);
//    }

    public static int getPowerByExp(int number, int exponent) {
          int result = 1;
        for (int i = 0; i < exponent ; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        int retVal = getpower(2);
        System.out.println(retVal);

        retVal = getpower(3);
        System.out.println(retVal);

        retVal = getPowerByExp(3,3);
        System.out.println(retVal);
    }
}
