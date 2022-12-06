package ex05_fixed.ex04;

public class Product {
	int price;
	int bonusPoint;

	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
	
	Product(){
		
	}
}
