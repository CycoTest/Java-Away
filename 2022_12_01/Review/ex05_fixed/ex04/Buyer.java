package ex05_fixed.ex04;

public class Buyer {
	int money = 1000;
	int bonusPoint;
	Product item[] = new Product[10];
	int i = 0;

	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}

		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[i++] = p;
		System.out.println(p + "을/를 구입하셨습니다.");
	}

	void summary() {
		int sum = 0;
		String itemList = "";

		for (int i = 0; i < item.length; i++) {
			if (item[i] == null) {
				break;
			}
			sum += item[i].price;
			itemList += item[i] + ", ";
		}
		System.out.printf("구입하신 물품의 총 금액은 %d만원입니다.\n", sum);
		System.out.printf("구입하신 제품은 %s입니다.\n", itemList);
	}
}
