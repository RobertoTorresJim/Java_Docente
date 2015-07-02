public class main{
	
	public static void main(String[] args){
		Docente docente=new Docente();
		docente.setName("Henoc");
		docente.setHours(20);
		docente.setType("Ciencias");
		System.out.println("Full Name: ");
		System.out.println(docente.getFullName());
		System.out.println("Brute Salary: ");
		System.out.println(docente.getSalaryBrute());
		System.out.println("Discount: ");
		System.out.println(docente.getSalaryDiscount());
		System.out.println("Net Salary: ");
		System.out.println(docente.getNetSalary());
	}
}
