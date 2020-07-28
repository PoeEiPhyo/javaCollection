package Collection;

import java.io.Serializable;

public class Student implements Serializable{
	String name,phone,rollNo,address;
	public Student(String name,String phone,String roll,String address) {
		this.name=name;
		this.phone=phone;
		this.rollNo=roll;
		this.address=address;
	}
	public Student(){};
	public String toString() {
		return "\nName="+name+"\nPhone="+phone+"\nRoll No="+rollNo+"\nAddress="+address+"\n";
	}
	
}
