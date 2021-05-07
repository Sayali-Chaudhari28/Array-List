import java.util.Scanner;
import java.util.*;

class Student{
	Scanner sc = new Scanner(System.in);
	int roll_no;
	String name;
	//----------------------ACCEPT STUDENT DETAILS----------------------------
	void accept() {
		System.out.print("Enter roll number: ");
		roll_no = sc.nextInt();
		System.out.print("Enter name: ");
		name = sc.next();
	}
	//-----------------------DISPLAY STUDENT DETAILS--------------------------
	void display() {
		System.out.print("\n     "+roll_no+"       |  "+name);
	}
}
public class Array_List {
	public static void main(String args[]) {
		int choice1,choice2;
		int int_number;
		String str_element;
		
		Student student;
		ArrayList<Student> student_array = new ArrayList<Student>();
		
		ArrayList<Integer> int_array = new ArrayList<Integer>();		//CREATED INTEGER ARRAYLIST OBJET
		ArrayList<String> string_array = new ArrayList<String>();		//CREATED STRING ARRAYLIST OBJECT
		
		Scanner sc=new Scanner(System.in);
		out:
		do {
			System.out.print("\n1. Integer \n2. String \n3. Student class type \n4. Exit");
			System.out.print("\nEnter data type: ");
			choice1=sc.nextInt();
			switch(choice1) 
			{
				//----------------------------------INTEGER------------------------------------
				case 1: do {
							System.out.print("\n1. Add Element \n2. Remove Element \n3. Exit");
							System.out.print("\nChoose operation: ");
							choice2=sc.nextInt();
				
							switch(choice2) {
								//----------------ADD INTEGER ELEMENT--------------------
								case 1: System.out.print("Enter Integer Element: ");
										int_number=sc.nextInt();
										int_array.add(int_number);
										System.out.println("----------------------------");
										System.out.println(int_array);
										System.out.print("size: "+int_array.size());
										System.out.println("\n----------------------------");
										break;
								//-------------REMOVE ELEMENT FROM GIVEN INDEX-----------
								case 2: System.out.print("Enter index of element to be removed: ");
										int_number=sc.nextInt();
										int_array.remove(int_number);
										System.out.println("----------------------------");
										System.out.println(int_array);
										System.out.print("size: "+int_array.size());
										System.out.print("\n----------------------------");
										break;
								//------------------------EXIT----------------------------
								case 3: continue out;		//going to outer while without breaking loops and choosing another option
							}
	 
					}while(choice2!=3);
				//-------------------------------------STRING-----------------------------
				
				case 2: do {
							System.out.print("\n1. Add Element \n2. Remove Element \n3. Exit");
							System.out.print("\nChoose operation: ");
							choice2=sc.nextInt();
							switch(choice2) {
								//---------------------ADD STRING-------------------------
							case 1: System.out.print("Enter String Element: ");
									str_element=sc.next();
									string_array.add(str_element);
									System.out.println("----------------------------");
									System.out.println(string_array);
									System.out.print("size: "+string_array.size());
									System.out.println("\n----------------------------");
									break;
								//------------------REMOVE STRING ELEMENT-----------------
							case 2: System.out.print("\nEnter the index of string elements to be removed: ");
									int index_element = sc.nextInt();
									string_array.remove(index_element);
									System.out.println("----------------------------");
									System.out.println(string_array);
									System.out.println("size: "+string_array.size());
									System.out.println("----------------------------");
								break;
								//--------------------------EXIT--------------------------
							case 3: continue out;	
								
							}
						}while(choice2!=3);
				//---------------------------------STUDENT INPUT--------------------------
				case 3: do {
							System.out.print("\n1. Add Element \n2. Remove Element \n3. Exit");
							System.out.print("\nChoose operation: ");
							choice2=sc.nextInt();
							switch(choice2) {
							//-------------------------ADD STUDENTS-------------------------
							case 1: student=new Student();
									student.accept();
									student_array.add(student);
									System.out.println("size: "+student_array.size());
									System.out.print("\n------------------------");
									System.out.print("\n  Roll No.   |  Name    ");
									System.out.print("\n------------------------");
									for(Student i:student_array) {
										i.display();
									}
									
									System.out.print("\n------------------------");
								break;
							case 2: System.out.print("\nEnter the index of string elements to be removed: ");
									int_number = sc.nextInt();
									student_array.remove(int_number);
									System.out.print("\n------------------------");
									System.out.print("\n  Roll No.   |  Name    ");
									System.out.print("\n------------------------");
									for(Student i:student_array) {
										i.display();
									}
									break;
							case 3: continue out;
							}
					
				}while(choice2!=3);
					break;
				//----------------------------------EXIT----------------------------------
				case 4: System.exit(0);
			}
		}while(choice1!=4);
	}
}
