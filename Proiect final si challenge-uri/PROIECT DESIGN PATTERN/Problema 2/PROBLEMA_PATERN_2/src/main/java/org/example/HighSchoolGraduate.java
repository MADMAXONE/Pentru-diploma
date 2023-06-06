package org.example;

public class HighSchoolGraduate extends AbstractGraduate {

    public HighSchoolGraduate(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNull() {
        return false;
    }
}

