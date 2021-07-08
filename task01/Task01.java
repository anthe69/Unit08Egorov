package com.epam.unit08.task01;

public class Task01 {

	public static void main(String[] args) {

		// Создать класс Customer, спецификация которого приведена ниже. Создать
		// второй класс, агрегирующий массив типа Customer, с подходящими
		// конструкторами и методами. Задать критерии выбора данных и вывести эти
		// данные на консоль.
		// Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной
		// карточки, номер банковского счета.
		// Найти и вывести (критерии выбора):
		// a) список покупателей в алфавитном порядке;
		// b) список покупателей, у которых номер кредитной карточки находится в
		// заданном интервале.

		CustomersList buyers = new CustomersList();

		buyers.add(new Customer("Anton", "Egorov", "Yuryevich", 897123, "293487"));
		buyers.add(new Customer("Maria", "Melynikova", "Sergeevna", 897223, "234578"));
		buyers.add(new Customer("Igor", "Filippov", "Vasilyevich", 897323, "234162"));
		buyers.add(new Customer("Dmitriy", "Kudryavcev", "Viktorovich", 897423, "234850"));

		System.out.println("Список покупателей в алфавитном порядке:");

		buyers.sortCustomers();

		for (int i = 0; i < buyers.size(); i++) {
			System.out.printf(buyers.getCustomer(i).toString());
		}

		System.out.println("\n\nСписок покупателей, у которых номер кредитной карточки находится в заданном интервале:"
				+ buyers.findByCardNumber(897200, 897400).toString() + "\n");

	}

}
