package examen3.pkg1;

public class Examen31 {

    public static void main(String[] args) {
        int cin = 5;
        int x = 0;
        int sum = 0;
        int y = 0;

       for (y = 0; x < 10; y++) {
            if ((y % cin) == 0) {
                System.out.println(y);
                sum = sum + y;
                x++;
            } else {
                System.out.println(y + "no");
            }
        }
        System.out.println(sum);

        
        
        while (x < 10) {
            if ((y % cin) == 0) {
                System.out.println(y);
                sum = sum + y;
                x++;
            } else {
                System.out.println(y + "no");
            }
            y++;
        }
        System.out.println(sum);
        
  
        
        
       do{
           if ((y % cin) == 0) {
                System.out.println(y);
                sum = sum + y;
                x++;
            } else {
                System.out.println(y + "no");
            }
            y++;
       }
       while(x < 10);
       System.out.println(sum);
    }
}
