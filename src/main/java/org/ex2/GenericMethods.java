package org.ex2;

public class GenericMethods<T> {
    private T obj1;
    private T obj2;
    private T obj3;

    public GenericMethods(T obj1, T obj2, T obj3) {
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;

        printObject(this.obj1);
        printObject(this.obj2);
        printObject(this.obj3);
    }

    public void printObject(T obj) {
        System.out.println(obj);
    }

}
