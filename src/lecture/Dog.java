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
}
