package oop.object;
import java.util.Scanner;

public class SinhVien {
	private String id;
	private String nameStudent;
	private String dob;
	private String address;
	private String email;
	private String nameClass;
	private String phoneNumber;
	private boolean gender;
	private double score1;
	private double score2;
	private double score3;
	private double averageScore;
	private String classification;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNameStudent() {
		return nameStudent;
	}
	public void setNameStudent(String nameStudent) {
		this.nameStudent = nameStudent;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNameClass() {
		return nameClass;
	}
	public void setNameClass(String nameClass) {
		this.nameClass = nameClass;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public double getScore1() {
		return score1;
	}
	public void setScore1(double score1) {
		this.score1 = score1;
	}
	public double getScore2() {
		return score2;
	}
	public void setScore2(double score2) {
		this.score2 = score2;
	}
	public double getScore3() {
		return score3;
	}
	public void setScore3(double score3) {
		this.score3 = score3;
	}
	public double getAverageScore() {
		return averageScore;
	}
	public String getClassification() {
		return classification;
	}
	public void setClassification(String classification) {
		this.classification = classification;
	}
	public double calculateAverageScore() {
		return this.averageScore=(this.score1+this.score2+this.score3)/3;
	}
	public void classificationStudent() {
		if(this.averageScore>=8 && this.averageScore<=10) {
			this.classification = "Excellent";
		}
		else if(this.averageScore>=7 && this.averageScore<8) {
			this.classification = "Good";
		}
		else if(this.averageScore>=5 && this.averageScore<7) {
			this.classification = "Average";
		}
		else if(this.averageScore<5 && this.averageScore>=0) {
			this.classification = "Average";
		}
		else {
			this.classification="Can not classification";
		}
	}
	
	public SinhVien() {}
	
	public SinhVien(String id,String nameStudent,String dob,String address,String email,String nameClass,String phoneNumber,boolean gender,double score1,double score2,double score3) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.nameStudent = nameStudent;
		this.dob = dob;
		this.address = address;
		this.email = email;
		this.nameClass=nameClass;
		this.phoneNumber=phoneNumber;
		this.gender = gender;
		this.score1 = score1;
		this.score2 = score2;
		this.score3 = score3;
	}
	
	@SuppressWarnings("resource")
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ID Student: ");
		this.id = sc.nextLine();
		System.out.print("Name: ");
		this.nameStudent = sc.nextLine();
		System.out.print("Day of birth: ");
		this.dob= sc.nextLine();
		System.out.print("Address: ");
		this.address = sc.nextLine();
		System.out.print("Phone number: ");
		this.phoneNumber = sc.nextLine();
		System.out.print("Email: ");
		this.email = sc.nextLine();
		System.out.print("Score 1: ");
		this.score1 = Double.parseDouble(sc.nextLine());
		System.out.print("Score 2: ");
		this.score2 = Double.parseDouble(sc.nextLine());
		System.out.print("Score 3: ");
		this.score3 = Double.parseDouble(sc.nextLine());
	}
	
	public void output() {
		classificationStudent();
		System.out.println("ID Student: "+this.id);
		System.out.println("Name: "+this.nameStudent);
		System.out.println("Day of birth: "+this.dob);
		System.out.println("Address: "+this.address);
		System.out.println("Phone number: "+this.phoneNumber);
		System.out.println("Email: "+this.email);
		System.out.println("Score 1: "+this.score1);
		System.out.println("Score 2: "+this.score2);
		System.out.println("Score 3: "+this.score3);
		System.out.println("Average score : "+this.averageScore);
		System.out.println("Classification : "+this.classification);
	}
}
