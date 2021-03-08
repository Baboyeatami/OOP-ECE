package lecture;

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
public class Main_jamie {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = 0, b = 0;

        System.out.println("Enter a");
        a = input.nextInt();

        while (a == 1) {
            System.out.println("Welcome to b");
            b = input.nextInt();

            if (b == 2) {
                break;
            } else if (b == 3) {
                System.out.println("welcome to looper ");
                System.out.println("Enter loop limit");

                int x = 0, limit;
                limit = input.nextInt();
                do {
                    System.out.println(x);
                    x++;
                } while (x <= limit);

            }

        }

    }
}
