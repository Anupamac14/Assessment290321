	class Student
	{
	    public static void main(String s[])
	    {
	        Student1 students[] = new Student1[5];
	    
	        students[0] = new Student1();
	        students[0].id = 100;
	        students[0].name = "Anu";
	        students[0].d1 = "31.2.21";
	        
	        //students[0].d2 = ;
	        students[0].section = 'A';
	        students[0].address = "Mysore";
	        students[0].fathername = "Chandrasheka";
	        students[0].mothername = "Rajkala";
	        students[0].bloodgroup = "B+";
	        
	       
		    
	        students[1] = new Student1();
	        students[1].id = 101;
	        students[1].name = "Anu";
	        // students[0].d1 = ;
	        //students[0].d2 = ;
	        students[1].section = 'A';
	        students[1].address = "Mysore";
	        students[1].fathername = "Chandrasheka";
	        students[1].mothername = "Rajkala";
	        students[1].bloodgroup = "B+";
	        
	        students[2] = new Student1();
	        students[2].id = 102;
	        students[2].name = "Buff";
	        // students[0].d1 = ;
	        //students[0].d2 = ;
	        students[2].section = 'B';
	        students[2].address = "Mysore";
	        students[2].fathername = "Chandrasheka";
	        students[2].mothername = "Rajkala";
	        students[2].bloodgroup = "A+";
	        
	        
	        
	        
	        students[3] = new Student1();
	        students[3].id = 103;
	        students[3].name = "Netty";
	        // students[0].d1 = ;
	        //students[0].d2 = ;
	        students[3].section = 'B';
	        students[3].address = "Mysore";
	        students[3].fathername = "Chandrasheka";
	        students[3].mothername = "Rajkala";
	        students[3].bloodgroup = "O+";
	        
	        students[4] = new Student1();
	        students[4].id = 104;
	        students[4].name = "Hemi";
	        // students[0].d1 = ;
	        //students[0].d2 = ;
	        students[4].section = 'B';
	        students[4].address = "Mysore";
	        students[4].fathername = "Chandrasheka";
	        students[4].mothername = "Rajkala";
	        students[4].bloodgroup = "B-";
	        
 
	        for(int i = 0; i < students.length; i++)
	        {
	            System.out.println(students[i].id +" "+ students[i].name + " in section " + students[i].section + "  " + students[i].d1 + " " + students[i].address + " " + students[i].fathername + " "+ students[i].mothername + " "+ students[i].bloodgroup + " ");
	        }
	        System.out.println("Comparing student[0] and student[1]");
	        System.out.println(students[0].name.compareTo(students[1].name));
	        System.out.println("Comparing student[1] and student[2]");
	        System.out.println(students[1].name.compareTo(students[2].name));
	        System.out.println("Comparing student[3] and student[4]");
	        System.out.println(students[3].name.compareTo(students[4].name));
	        
	    }
	   

	}

	class Student1 
	{
		int id;
	    String name;
	    String d1;
//	    Date d2;
	    char section;
	    String address;
	    String mobile;
	    String fathername;
	    String mothername;
	    String bloodgroup;
	    
	}