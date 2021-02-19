/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture;

/**
 *
 * @author Jamie Eduardo Rosal <Jamiewertalmighty@gmail.com>
 */
public class Cat extends Animal {

    String name = "tiger";

    @Override
    void PrintVoice() {
        System.out.println("meow meow meow");
    }

    class Cat_woman {

        void PrintCat_woman_Voice() {

            System.out.println(name);
        }
    }

    void PrintArray(int[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }

}
