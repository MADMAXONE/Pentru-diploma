package org.example;

import org.example.AbstractGraduate;

public class NullGraduate extends AbstractGraduate {

    @Override
    public String getName() {
        return "Person did not graduate.";
    }

    @Override
    public boolean isNull() {
        return true;
    }
}