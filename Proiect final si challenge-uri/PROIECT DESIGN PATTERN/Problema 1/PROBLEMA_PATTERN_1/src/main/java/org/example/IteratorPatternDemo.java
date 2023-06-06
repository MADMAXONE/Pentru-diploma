package org.example;

public class IteratorPatternDemo {

    public static void main(String[] args) {
        AgeHandler ageHandler = new AgeHandler();

        for (Iterator iter = ageHandler.getIterator(); iter.hasNext(); ) {
            Integer age = (Integer) iter.next();
            System.out.println("Age : " + age);
        }
    }
}

