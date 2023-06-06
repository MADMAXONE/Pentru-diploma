package org.example;

    public class UniversityGraduate extends AbstractGraduate {

        public UniversityGraduate(String name) {
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

