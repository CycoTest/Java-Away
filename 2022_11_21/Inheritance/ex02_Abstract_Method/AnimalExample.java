package ex02_Abstract_Method;

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		System.out.println("1. ------------------");
		
		Animal animal = null;
//		Animal 클래스는 추상 클래스인 까닭에 변수 선언은 가능해도, 인스턴스 선언은 불가능
		animal = new Dog();
//		참조 변수 animal의 주소값으로 자식 클래스 Dog의 생성자를 넣는다
		animal.sound();
//		따라서, 참조 변수 animal이 부르는 메소드 sound()는 
//		자식 클래스에 메소드 오버라이딩되어 있는 메소드를 호출하는 것이다
		
		animal = new Cat();
		animal.sound();
		System.out.println("2. ------------------");
		
		animalSound(new Dog());
		animalSound(new Cat());
	}

	public static void animalSound(Animal animal) {
		animal.sound();
	}
//	animalSound(new Dog())와 animalSound(new Cat())를 호출하기 위한 메소드
}
