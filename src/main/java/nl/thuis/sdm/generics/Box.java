package nl.thuis.sdm.generics;

import java.math.BigInteger;

public class Box<T> {

    private T t;          

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public <U extends Number> void inspect(U u){
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }

    public static void main(String[] args) {
        Box<BigInteger> bigintegerBox = new Box<BigInteger>();
        bigintegerBox.set(new BigInteger("1234567890"));
        bigintegerBox.inspect(new BigInteger("32423567823")); // error: this is still String!
    }
}