import java.util.*;
public class Main {
public static Scanner ent=new Scanner(System.in);
public static void main(String[] args) {
for(byte i=0;i<10;i++) {
System.out.println("View Records of \n1.Students\t2.Instructors");
byte a=ent.nextByte();
	Student []s1=new Student[10];
	s1[0]=new Student("S001","Aashita",2000,"Biology");
	s1[1]=new Student("S002","Aman",1999,"Mathematics");
	s1[2]=new Student("S003","Bittu",2002,"Chemistry");
	s1[3]=new Student("S004","Chanchal",2001,"Hindi");
	s1[4]=new Student("S005","Chandan",1999,"Bio-Technology");
	s1[5]=new Student("S006","Deepak",2000,"Mathematics");
	s1[6]=new Student("S007","Ravi",1999,"Chemistry");
	s1[7]=new Student("S008","Rakesh",2002,"Biology");
	s1[8]=new Student("S009","Vishnu",2001,"Business");
	s1[9]=new Student("S010","Zoya",2000,"Accounts");
	Instructor []ins=new Instructor[6];
	ins[0]=new Instructor("Miss.Kabita",1993,"Biology   " ,13000); 
	ins[1]=new Instructor("Mrs.Karishma",1987,"Hindi    " ,10000);
	ins[2]=new Instructor("Mrs.Ratna",1987,"Accounts" ,15000 );
	ins[3]=new Instructor("Mr.Ravi     ",1992,"Mathematics" ,20000);
	ins[4]=new Instructor("Miss Ritika",1995,"Bio-Technology" ,17000 );
	ins[5]=new Instructor("Mrs.Roshni",1990,"Business" ,12000);
if(a==1) {
	byte s=1;
	System.out.println("List of Students are\nSr.No.\tSID\tName    \tYOB\tMajor");
	for(byte j=0;j<10;j++) {
	System.out.println(s+"\t"+s1[j].gets()+"\t"+s1[j].getn()+"    \t"+s1[j].gety()+"\t"+s1[j].getm());
	s++;
	}}
else if(a==2) {
	byte s=1;
	System.out.println("List Of Instructors are:\nSr.No.\tName\t\tYOB\tSubject\t\t   Salary");
	for(byte k=0;k<6;k++) {
	System.out.println(s+"\t"+ins[k].getn()+"\t"+ins[k].gety()+"\t"+ins[k].getsu()+"\tRs."+ins[k].gets()+"/Month");
	s++;
	}}
else
		System.out.println("!!!Wrong Input!!!");
	continue;
}
	}}