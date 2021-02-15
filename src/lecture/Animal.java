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
public class Animal {

    private String Name;
    private String Type;
    private int age;
    private String Kind;
    private String Gender;
    private String Voice = "rawr rawr rawr ";
    private static int number = 10;

    public Animal() {
    }

    public Animal(String name, String type) {
        Name = name;
        this.Type = type;

    }

    public Animal(String Name, String Type, int age, String Kind, String Gender) {
        this.Name = Name;
        this.Type = Type;
        this.age = age;
        this.Kind = Kind;
        this.Gender = Gender;
    }

    void PrintName() {
        System.out.println(this.Name);
    }

    void PrintName(String name) {
        System.out.println(name);
    }

    int Sum(int num1, int num2) {
        return num1 + num2;
    }

    void SetName(String name) {
        this.Name = name;
    }

    String GetName() {
        return this.Name;
    }

    public static int getNumber() {
        return number;
    }

    public static void setNumber(int number) {
        Animal.number = number;
    }

    void PrintVoice() {

        System.out.println(this.Voice);
    }

}
