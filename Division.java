/** Copyright (c) [2023] [rudainah]
 *  All rights reserved.
 */

public class Division {
    public static void main(String[] args) throws Exception {
        System.out.println("Divisible by three and five from 1 to 100 ");

        for(int i = 1; i <= 100; i++){
            if((i % 3 == 0) && (i % 5 == 0)){
                System.out.println(i + " Divisible by 3 and 5. ");
            }else if (i % 3 == 0){
                System.out.println(i + " Divisible by 3. ");
            }else if(i % 5 == 0){
                System.out.println(i + " Divisible by 5. ");
            }
                
        }
    }
}
