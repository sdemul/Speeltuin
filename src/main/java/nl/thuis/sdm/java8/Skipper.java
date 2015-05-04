package nl.thuis.sdm.java8;

@FunctionalInterface
public interface Skipper<T> 	{
	
	boolean skip(T s);

}
