package Listas;

import Equals.Pessoa;

public class Employee {
	
	private int id;
	
	private String  nome;
	
	private Double salary;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public Employee()
	{
		
	}

	public Employee(int id, String nome, Double salary)
	{
		super();
		this.id = id;
		this.nome = nome;
		this.salary = salary;
	}
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	
	public void aumento (double porcentagem)
	{
		
		salary += porcentagem * salary / 100.0;
		
	}

	public boolean equals(Object obj) {
		Employee e = (Employee) obj;
		return this.id == e.id;
	}
	
	public String toString()
	{
		return id + "," + nome + ","+ salary ;
	}
	
	
	
	/*public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Pessoa p = (Pessoa) obj;
		
		return this.cpf == p.cpf;*/
	
	

}
