package Exer1;

public class Two {
    public static void main(String[] args) {

        int q = 45685;
        Integer qInt = new Integer(q);
        String strSum = qInt.toString();
        String nums[] = strSum.split("");
        for( int i = 4; i >= 0 ; i-- ) {
            System.out.println(nums[i]);
        }
    }
}
