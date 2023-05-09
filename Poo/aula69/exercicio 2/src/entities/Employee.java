package entities;

public class Employee {

	public String name;
	public Double grossSalary;
	public Double tax;

	public Employee() {

	}

	public Employee(String name, Double grossSalary, Double tax) {
		this.name = name;
		this.grossSalary = grossSalary;
		this.tax = tax;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(Double grossSalary) {
		this.grossSalary = grossSalary;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public double NetSalary() {

		return grossSalary - tax;
	}

	public void IncreaseSalary(double porcentage) {

		System.out.println(name + ", $ " + String.format("%.2f", (((grossSalary * porcentage) / 100) + NetSalary())));
	}

	@Override
	public String toString() {
		return "Employee: " + name + ", $ " + String.format("%.2f", NetSalary());
	}

}
