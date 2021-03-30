import java.util.ArrayList;
public class studentDetails {
	public static void main(String[] args) {
		ArrayList<StudentReq> list= new java.util.ArrayList<StudentReq>();
		StudentReq s1=new StudentReq(1,'A',"Anu","Mysore","9880591071","Chandru","Kala","B+");
		StudentReq s2=new StudentReq(2,'B',"Racchu","Mysore","9880591071","Chandru","Kala","B+");
		StudentReq s3=new StudentReq(3,'C',"Buff","Mysore","9880591071","Chandru","Kala","B+");
		StudentReq s4=new StudentReq(4,'A',"Netty","Mysore","9880591071","Chandru","Kala","B+");
		StudentReq s5=new StudentReq(5,'B',"Hemi","Mysore","9880591071","Chandru","Kala","B+");
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
  		
//		System.out.println("Comparing");
//	    System.out.println(s1.compareTo(s2));
//	    System.out.println(s2.compareTo(s3));
//	    System.out.println(s3.compareTo(s4));
//	    System.out.println(s4.compareTo(s5));
//	    System.out.println(s5.compareTo(s1));
		for(StudentReq sub:list) {
			System.out.println("ID:"+sub.id+" "+" Section : "+sub.section+" "+" Student Name : "+sub.name+" "+" Address : "+sub.address+" "+" Mobile : "+sub.mobile+" "+" Father Name : "+sub.fathername+" "+" Mother Name : "+sub.mothername+" "+" Blood Group : "+sub.bloodgroup+" ");
		}
	    int studId = 1;
	    	    switch (studId) {
	    	      case 1:
	    	        System.out.println("Anu");
	    	        break;
	    	      case 2:
	    	        System.out.println("Racchu");
	    	        break;
	    	      case 3:
	    	        System.out.println("Buff");
	    	        break;
	    	      case 4:
	    	        System.out.println("Netty");
	    	        break;
	    	      case 5:
	    	        System.out.println("Hemi");
	    	        break;
	    	      default:
	    	        System.out.println("Please check the Entered ID");
	    	        break;
	    	     }
	    	}
		}
class StudentReq 
{
	public StudentReq(int id, char section,String name, String address, String mobile, String fathername, String mothername, String bloodgroup) {
		super();
		this.id = id;
		this.section = section;
		this.name = name;
		this.address = address;
		this.mobile = mobile;
		this.fathername = fathername;
		this.mothername = mothername;
		this.bloodgroup = bloodgroup;
	}
	int id;
    char section;
    String name,address,mobile,fathername,mothername,bloodgroup; 
}