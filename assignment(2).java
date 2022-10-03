
public class App {
    public static void main(String[] args) throws Exception {
    //for loop with break 
        for (int firstnamecount = 5; firstnamecount != 0; firstnamecount--) {
            if ( firstnamecount== 4) {
                System.out.println("Teka lah na akong boses");
                break;
            }

            System.out.println("Shalimar");
        }
    //while loop with continue      
          int nicknamecount = 5;

        while (nicknamecount != 0) {
              if ( nicknamecount == 3) {
                System.out.println("Ganda ko");
                nicknamecount--;
                continue;
            }
            System.out.println("Salma");
            nicknamecount--;
        }
    //do-while loop
          int surnamecount = 5;

        do {
            System.out.println("Gilo");
            surnamecount--;
        } while (surnamecount != 0);
    }
    
     
}