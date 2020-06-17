package c_array_and_method;


public	class	demo<E> {

    private static final int INITIAL_SIZE = 16;
    private E[] elements;
    private int count = 0;
    public demo(){
        elements = (E[]) new Object[INITIAL_SIZE];
    }
}