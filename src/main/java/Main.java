
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jamie Eduardo Rosal <Jamiewertalmighty@gmail.com>
 */
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a value ");

        int a = input.nextInt();
        int x = input.nextInt();

        switch (a) {

            case 1:
                System.out.println("waaw ang galing ");

                if (a == 1) {
                    System.out.println("OMG ang galing talagas");
                }

                break;

            case 2:
                System.out.println("oh no! galing parin");
                System.out.println("");
                break;

            default:

                System.out.println("wala sa choises ");
                System.out.println("hahah");

        }

    }
}
