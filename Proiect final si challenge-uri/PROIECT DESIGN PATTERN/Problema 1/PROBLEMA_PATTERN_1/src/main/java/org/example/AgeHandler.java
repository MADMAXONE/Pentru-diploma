package org.example;


public class AgeHandler implements Container {
    public Integer age[] = {23,44,52 ,69 };

    @Override
    public Iterator getIterator() {
        return new AgeIterator();
    }

    private class AgeIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {

            if (index < age.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {

            if (this.hasNext()) {
                return age[index++];
            }
            return null;
        }
    }
}

