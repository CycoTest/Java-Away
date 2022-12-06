package ex06_fixed.ex04.Vector;

import java.util.Vector;

public class Buyer {
	int money = 1000;
	int bonusPoint;
	Vector item = new Vector();

	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}

		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p);
		System.out.println(p + "을/를 구입하셨습니다.");
	}

	void refund(Product p) {
		if (item.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "을/를 반품하셨습니다.");
		} else {
			System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
		}
	}

	void summary() {
		int sum = 0;
		String itemList = "";

		if (item.isEmpty()) {
			System.out.println("구입하신 제품이 없습니다.");
			return;
		}

		for (int i = 0; i < item.size(); i++) {
			Product p = (Product) item.get(i);
			sum += p.price;
			itemList += (i == 0) ? "" + p : ", " + p;
		}
		System.out.printf("구입하신 물품의 총 금액은 %d만원입니다.\n", sum);
		System.out.printf("구입하신 제품은 %s입니다.\n", itemList);
	}
}
