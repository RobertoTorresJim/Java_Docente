class Docente{
	
	private String name;
	private String lastName;
	private int hours;
	private String type;
	private static double salary;
	
	public Docente(){
		name="name";
		lastName="lastName";
		hours=0;
		type="Ciencias";
		salary=200.0;
	
	}
	
	public void setName(String name){
		this.name=name;
	}

	public String getName(){
		return name;
	}

	public void setLastName(String lastName){
		this.lastName=lastName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public void setHours(int hours){
		this.hours=hours;
	}

	public int getHours(){
		return hours;
	}
	public void setType(String type){
		this.type=type;
	}
	public String getType(){
		return type;
	}

	public void setSalary(double salary){
		this.salary=salary;
	}

	public double getSalary(){
		return salary;
	}
	
	public String getFullName(){
		return name+" "+lastName+" ";
	}

	public double getSalaryBrute(){
		switch(type){
			case "Ciencias":
				return (salary/3)*hours;
			case "Letras":
				return (salary/5)*hours;
		}
		return 0.0;
	}
	public double getSalaryDiscount(){
		return getSalaryBrute()*0.10;
	}

	public double getNetSalary(){
		return getSalaryBrute()-getSalaryDiscount();
	}	
}

