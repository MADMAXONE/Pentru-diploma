package org.example;

public class NullPatternDemo {
    public static void main(String[] args) {

        AbstractGraduate graduate1 = GraduateFactory.getGraduate("Rob");
        AbstractGraduate graduate2 = GraduateFactory.getGraduate("Bob");
        AbstractGraduate graduate3 = GraduateFactory.getGraduate("Julie");
        AbstractGraduate graduate4 = GraduateFactory.getGraduate("Laura");
        AbstractGraduate graduate5 = GraduateFactory.getGraduate("Marius");

        System.out.println("Graduates");
        System.out.println(graduate1.getName());
        System.out.println(graduate2.getName());
        System.out.println(graduate3.getName());
        System.out.println(graduate4.getName());
        System.out.println(graduate5.getName());
    }
}