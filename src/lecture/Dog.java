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
public class Dog extends Animal {

    private int[] x;

    @Override
    void PrintVoice() {
        System.out.println(" aw aw aw ");
    }

    @Override
    void PrintName(String name) {
        System.out.println(name + " Jamie");
    }

    private void aw_aw() {
        System.out.println("aw aw aw");
    }

    int[] generate_Array(int size) {

        x = new int[size];

        for (int i = 0; i < size; i++) {
            int a = (int) (Math.random() * 10);
            x[i] = a;

        }

        return x;

    }

    void PrintArray() {
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }

}
