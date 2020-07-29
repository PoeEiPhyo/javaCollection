package Collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
public class StudentInfo {
	
	String name,phone,rollNO,address;
	public StudentInfo(String name,String phone,String roll,String address) {
		this.name=name;
		this.phone=phone;
		this.rollNO=roll;
		this.address=address;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		Map<String,StudentInfo> stdList=new HashMap<String,StudentInfo>();
		
		stdList.put("Nge Nge", new StudentInfo("Nge Nge","456","5CS-10","Yangon"));
		stdList.put("Phyo Phyo", new StudentInfo("Phyo Phyo","987","5CS-50","Monywa"));
		stdList.put("Aye Aye", new StudentInfo("Aye Aye","768","5CS-18","Mandalay"));
		stdList.put("Mg Mg", new StudentInfo("Mg Mg","875","5CS-5","Monywa"));
		stdList.put("Ma Ma", new StudentInfo("Ma Ma","1234","5CS-1","Yangon"));
				
		System.out.println("Enter Start Name:");
		String st=sc.nextLine();
		Set set=stdList.entrySet();
		Iterator i=set.iterator();
		StudentInfo s;
		while(i.hasNext()) {
			Map.Entry me = (Map.Entry)i.next();
			s=(StudentInfo) me.getValue();
			if(s.name.toLowerCase().startsWith(st.toLowerCase())) {
				System.out.println("Name:"+s.name+"\nPhone:"+s.phone+"\nRoll No:"+s.rollNO+"\nAddress:"+s.address);
				System.out.println();
			}
		}   
	}

}
