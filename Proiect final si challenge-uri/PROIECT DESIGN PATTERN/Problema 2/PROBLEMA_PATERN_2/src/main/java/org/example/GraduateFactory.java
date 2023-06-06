package org.example;

public class GraduateFactory {

    public static final String[] names = {"Rob", "Joe", "Julie"};

    public static AbstractGraduate getGraduate(String name){

        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name) && !names[i].equalsIgnoreCase("Marius")){
                return new HighSchoolGraduate(name);
            }
            else if(names[i].equalsIgnoreCase("Marius")){
                return new UniversityGraduate(name);
            }
        }
        return new NullGraduate();
    }

}
