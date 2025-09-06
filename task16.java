public class task16 {
    public static void main (String[] args){
        System.out.println(Math.max(5, 10));  //maximum
        System.out.println(Math.min(5, 10)); //minimum

        System.out.println(Math.sqrt(64)); //sqrt of 64 out put is 8

        System.out.println(Math.abs(-4.7)); //mod(-4.7) = 4.7

        System.out.println(Math.pow(2, 8));  // 2^8 = 256.0

        System.out.println(Math.round(4.6)); //round fig. of 4.6 is 5.00

        System.out.println(Math.ceil(4.1)); // ceill(4.1)= 5
        System.out.println(Math.floor(4.9));  //floor(4.1)= 4
        System.out.println(Math.random());   //random--0.4294001316529841


        int randomNum = (int)(Math.random() * 101);  // 0 to 100
        System.out.println(randomNum);
    }
}
