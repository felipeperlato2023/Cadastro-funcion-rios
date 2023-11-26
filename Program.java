package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		List<Employee> lista = new ArrayList<>();

		System.out.println("Informe a quantidade de employees");
		int qtd = ler.nextInt();

		for (int i = 0; i < qtd; i++) {

			System.out.println("Informe o Id");
			int id = ler.nextInt();

			System.out.println("Informe o Name");
			ler.nextLine();
			String name = ler.next();

			System.out.println("Informe o Salary");
			double salary = ler.nextDouble();

			Employee emp = new Employee(id, name, salary);

			lista.add(emp);
		}

		Integer pos;

		System.out.print("Informe o id da pessoa que irá receber o aumento do salary: ");
		int idsalario = ler.nextInt();
		pos = position(lista, idsalario);

		if (pos == null) {
			System.out.println("id não existe");
		} else {

			double porcentagem = ler.nextDouble();

			lista.get(pos).aumento(porcentagem);
		}

		System.out.println("Listas de employees: ");

		for (Employee emp : lista) {
			System.out.println(emp);
		}

	}

	public static Integer position(List<Employee> lista, int id) {
		for (int i = 0; i < lista.size(); i++) // size: tamanho
		{
			if (lista.get(i).getId() == id) {
				return i;
			}
		}

		return null;
	}

}
