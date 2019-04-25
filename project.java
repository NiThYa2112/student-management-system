import java.util.Scanner;
import java.io.*;
class subjects
{
int mark;

int ndp;
static int twd;

float attendence;
public void addattendence()
{
 Scanner inp = new Scanner(System.in);
 twd++;
  int att;
 System.out.println("enter 1 if the student was present");
 att= inp.nextInt();
if(att == 1)
{ndp ++;

attendence = ndp*100/att;}
inp.close();
 }
public void addmarks()
{

 Scanner inp = new Scanner(System.in);
System.out.println("enter marks in the subject");
mark = inp.nextInt();




}
public int retmark()
{return mark;

}
public float retattendence()
{
return attendence;
}

}



class student
{subjects s[] = new subjects[5];
public String name;
public int regno;

int password;
student(String s,int rno,int p)
{name = s;
 regno = rno;
password = p;
};

 student()
{Scanner inp = new Scanner(System.in);

System.out.println("Enter name of the student:");
name = inp.nextLine();
System.out.println("Enter regno of the student:");
regno = inp.nextInt();
System.out.println("Enter the student password:");
password = inp.nextInt();


inp.close(); 



}
public void dispdetails(int[] attnull,int[] atnull )
{System.out.println("Student name:"+name);
System.out.println("regno:"+regno);
System.out.println("Subject                    marks               attendence");
System.out.print("English                    ");
if(atnull[0] !=0)
System.out.print(s[0].retmark()+"                 ");
else
System.out.print("not updated                 ");
if(attnull[0] !=0)
System.out.println(s[0].retattendence()+"                 ");
else
System.out.println("not updated                 ");
System.out.print("Physics                    ");
if(atnull[1] !=0)
System.out.print(s[1].retmark()+"                 ");
else
System.out.print("not updated                 ");
if(attnull[1] !=0)
System.out.println(s[1].retattendence()+"                 ");
else
System.out.println("not updated                 ");
System.out.print("Maths                      ");
if(atnull[2] !=0)
System.out.print(s[2].retmark()+"                 ");
else
System.out.print("not updated                 ");
if(attnull[2] !=0)
System.out.println(s[2].retattendence()+"                 ");
else
System.out.println("not updated");
System.out.print("Computer programming       ");
if(atnull[3] !=0)
System.out.print(s[3].retmark()+"                 ");
else
System.out.print("not updated                 ");
if(attnull[3] !=0)
System.out.println(s[3].retattendence()+"                 ");
else
System.out.println("not updated                 ");
System.out.print("Chemistry                  ");
if(atnull[4] !=0)
System.out.print(s[4].retmark()+"                 ");
else
System.out.print("not updated                 ");
if(attnull[4] !=0)
System.out.println(s[4].retattendence()+"                 ");
else
System.out.println("not updated                 ");



}
public void addattendence1(int tc,int attnull,int atnull)
{
if(tc == 1)
{if(attnull == 0 && atnull == 0)
{s[0] = new subjects();

}
if(attnull==0)
attnull++;

s[0].addattendence();}
else if(tc == 2)
{if(attnull == 0 && atnull == 0)
{s[1] = new subjects();}
if(attnull == 0)
attnull++;

s[1].addattendence();}
else if(tc == 3)
{if(attnull == 0 && atnull == 0)
{s[2] = new subjects();}
if(attnull == 0)
attnull++;

s[2].addattendence();}
else if(tc == 4)
{if(attnull == 0 && atnull == 0)
{s[3] = new subjects();}
if(attnull == 0)
attnull++;

s[3].addattendence();}
else if(tc == 5)
{if(attnull == 0 && atnull == 0)
{s[4] = new subjects();}
if(attnull == 0)
attnull++;

s[4].addattendence();}



}



public int retregno()
{
return regno;
}
public int retpass()
{
return password;
}


public void entermarks(int c,int[] atnull,int[] attnull)
{



switch(c)
{  

case 1:  if(attnull[0] == 0 && atnull[0] == 0)
	{s[0] = new subjects();}
	if (atnull[0] == 0)
         attnull[0]++;
	
	 s[0].addmarks();
        
         break;


case 2: if(attnull[1] == 0 && atnull[1] == 0)
	{s[1] = new subjects();}
	if (atnull[1] == 0)
         attnull[1]++;
         s[1].addmarks();
        
        break;


case 3: if(attnull[2] == 0 && atnull[2] == 0)
	{s[2] = new subjects();}
	if (atnull[2] == 0)
         attnull[2]++;
	s[2].addmarks();
       
        break;



case 4: if(attnull[3] == 0 && atnull[3] == 0)
	{s[3] = new subjects();}
	if (atnull[3] == 0)
         attnull[3]++;
	s[3].addmarks();
         
        break;




case 5:if(attnull[4] == 0 && atnull[4] == 0)
	{s[4] = new subjects();}
	if (atnull[4] == 0)
         attnull[4]++;
	 s[4].addmarks();
        
         break;



}
}

}

public class project
{
public static void main(String[] args)
{   	int choice;int count= 29;
        int[] attnull = new int[5];
attnull[0] = 0;
attnull[1] = 0;
attnull[2] = 0;
attnull[3] = 0;
attnull[4] = 0;
int[] atnull = new int[5];
atnull[0] = 0;
atnull[1] = 0;
atnull[2] = 0;
atnull[3] = 0;
atnull[4] = 0;
	student st[] = new student[100];
	Scanner inp = new Scanner(System.in);	
	st[0] = new student("sneha",1000,0000);
	st[1] = new student("harshita",1001,0000);
	st[2] = new student("Karthik",1002,0000);
	st[3] = new student("Rithvik",1003,0000);
	st[4] = new student("Vivek",1004,0000);
	st[5] = new student("Akhila",1005,0000);
	st[6] = new student("Ramesh",1006,0000);
	st[7] = new student("Rahul",1007,0000);
	st[8] = new student("Rithika",1008,0000);
	st[9] = new student("Siddharth",1009,0000);
	st[10]= new student("Mythri",1010,0000);
	st[11]= new student("Krishna",1011,0000);
	st[12]= new student("Tejaswi",1012,0000);
	st[13]= new student("Sampath",1013,0000);
	st[14]= new student("Srinath",1014,0000);
	st[15]= new student("Vineeth",1015,0000);
	st[16]= new student("Vidya",1016,0000);
	st[17]= new student("Veha",1017,0000);
	st[18]= new student("Vishal",1018,0000);
	st[19]= new student("Rakshith",1019,0000);
	st[20]= new student("Sara",1020,0000);
	st[21]= new student("Shwetha",1021,0000);
	st[22]= new student("Impna",1022,0000);
	st[23]= new student("Vageesha",1023,0000);
	st[24]= new student("Prathyusha",1024,0000);
	st[25]= new student("Shahanaaz",1025,0000);
	st[26]= new student("Vineetha",1026,0000);
	st[27]= new student("Hrithik",1027,0000);
	st[28]= new student("Pawan",1028,0000);
	st[29]= new student("Praveen",1029,0000);
     /* st[0].name = "Sneha";
      st[0].regno = 1000;
      st[0].password = 0000;
      st[1].name ="Harshitha";
      st[1].regno=1001;
      st[1].password=0000;
      st[2].name ="Karthik";
      st[2].regno =1002; 
      st[2].password=0000;
      st[3].name="Rithvik";
      st[3].regno=1003;
      st[3].password=0000;
      st[4].name="Vivek";
      st[4].regno=1004;
      st[4].password=0000;
      st[5].name="Akhila";
      st[5].regno=1005;
      st[5].password=0000;
      st[6].name="Ramesh";
      st[6].regno=1006;
      st[6].password=0000;
      st[7].name="Rahul";
      st[7].regno=1007;
      st[7].password=0000;
      st[8].name="Rithika";
      st[8].regno=1008;
      st[8].password=0000;
      st[9].name="Siddharth";
      st[9].regno=1009;
      st[9].password=0000;
      st[10].name="Mythri";
      st[10].regno=1010;
      st[10].password=0000;
      st[11].name="Krishna";
      st[11].regno=1011;
      st[11].password=0000;
      st[12].name="Tejaswi";
      st[12].regno=1012;
      st[12].password=0000;
      st[13].name="Sampath";
      st[13].regno=1013;
      st[13].password=0000;
      st[14].name="Srinath";
      st[14].regno=1014;
      st[14].password=0000;
      st[15].name="Vineeth";
      st[15].regno=1015;
      st[15].password=0000;
      st[16].name="Vidya";
      st[16].regno=1016;
      st[16].password=0000;
      st[17].name="Neha";
      st[17].regno=1017;
      st[17].password=0000;
      st[18].name="Vishal";
      st[18].regno=1018;
      st[18].password=0000;
      st[19].name="Rakshith";
      st[19].regno=1019;
      st[19].password=0000;
      st[20].name="Sara";
      st[20].regno=1020;
      st[20].password=0000;
      st[21].name="Shwetha";
      st[21].regno=1021; 
      st[21].password=0000;
      st[22].name="Impna";
      st[22].regno=1022;
      st[22].password=0000;
      st[23].name="Vageesha";
      st[23].regno=1023;
      st[23].password=0000;
      st[24].name="Prathyusha";
      st[24].regno=1024;
      st[24].password=0000;
      st[25].name="Shahanaz";
      st[25].regno=1025;
      st[25].password=0000;
      st[26].name="Vineetha";
      st[26].regno=1026;
      st[26].password=0000;
      st[27].name="Hrithik";
      st[27].regno=1027;
      st[27].password=0000;
      st[28].name="Pavan";
      st[28].regno=1028;
      st[28].password=0000;
      st[29].name="Praveen";
      st[29].regno=1029;
      st[29].password=0000;

*/int tt;


do{Scanner ww = new Scanner(System.in);

	System.out.println("  STUDENT MANAGEMENT SYSTEM");
    	System.out.println("  1.Student");
    	System.out.println("  2.Administrator");

	choice = ww.nextInt();
	if(choice == 1){int tempreg;int tflag = -1;

                        int temppass ;
			System.out.println("enter ur regno");
                        tempreg = inp.nextInt();
                        System.out.println("enter password"); 
                        
                        temppass = inp.nextInt();
                        
		
			for(int i =0;i<count;i++)
                                     {       if(st[i].retregno()==tempreg)
                                            { if(st[i].retpass() == temppass)
						{ tflag++;
                                                 st[i].dispdetails(attnull,atnull);
                                                 }
                                             }
                                            if(tflag == -1)
                                             System.out.println("wrong id/password");
				      }
                                             


                                            


	                 }
	else if(choice == 2){ 
				int temppass;
                    		int fl = -1;
                    		int teachercode;

				System.out.println("enter passcode");
				      
					temppass = ww.nextInt();
                                 
				      
					 if( temppass != 1111)
  					 {fl++;
                                        }
				
				if(fl== -1)
				{
					System.out.println("enter ur subject");
					System.out.println("1.English");
					System.out.println("2.Physics");
					System.out.println("3.Maths");
					System.out.println("4.Computer Programming");
					System.out.println("5.Chemistry");
					teachercode= inp.nextInt();
					int ch1;
					System.out.println("1.View Student list");
					System.out.println("2.Add attendence");
					System.out.println("3.Edit marks");
					System.out.println("4.Add new students");
					ch1 = inp.nextInt();

                                
                                        if(ch1 == 1)
                                        {for(int i=0;i<count;i++)
					    st[i].dispdetails(attnull,atnull);

					} 
				
                                     
                                        
                                        if(ch1 == 2)
                                    { 

                                               int temprno;int flag = -1;
						System.out.println("enter the regno of the student");
						temprno= inp.nextInt();
                                              for(int i =0;i<count;i++)
                                     {       if(st[i].retregno()==temprno)
                                              {
                                                flag++;

						st[i].addattendence1(teachercode,attnull[i],atnull[i]);

                                              }
                                      }
                                            if(flag == -1)
                                           {System.out.println("incorrect register no");}
                                               
                                       }
                                         if(ch1 == 3)
					{ int temprno;int flag = -1;
						System.out.println("enter the regno of the student");
						temprno= inp.nextInt();
                                              for(int i =0;i<count;i++)
                                     {       if(st[i].retregno()==temprno)
                                              {flag++;
						st[i].entermarks(teachercode,atnull,attnull);
                                     
                                              }
        
                              }
                                            if(flag == -1)
                                           {System.out.println("incorrect register no");}
                                          

					}
					if(ch1 == 4)
					{	
                                            count++;
                                            st[count] = new student();
                                            

					}	



				 }
  else
    System.out.println("incorrect password");}

                             
	else
	System.out.println("invalid entry");

System.out.println("press 1 if u wanna continue");
    
if(inp.hasNext())
     {tt = inp.nextInt();
}  
else
  { tt = 1;
}
}while(tt == 1);
inp.next();
inp.close();

}


}

