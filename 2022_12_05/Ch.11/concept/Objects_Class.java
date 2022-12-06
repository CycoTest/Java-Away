package concept;

public class Objects_Class {

}
/*
 * 4-1. 객체 비교: Object.compare(T a, T b, Comparator<T> c)
 *  	-> 두 객체를 비교자(Comparator)로 비교해서 int값을 리턴
 *  
 * 4-2. 동등 비교
 * 	(1) Objects.equals(a, b)
 * 		a. not null || not null = a.equals(b)의 리턴값
 * 		b. null     || not null = false
 * 		c. not null || null     = false
 * 		d. null		|| null		= true
 * 
 * 	(2) Objects.deepEquals(a, b)
 * 		a. not null (not array) || not null (not array) = a.equals(b)의 리턴값
 * 		b. null (array) 		|| not null(array)		= Array.deepEquals(a,b)의 리턴값
 * 		c. not null 			|| null					= false
 * 		d. null					|| not null				= false
 * 		e. null					|| null					= true
 * 
 * 	ex) ex01_equals.Comparator
 * 
 * 
 */
