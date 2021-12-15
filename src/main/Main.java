package main;
import oop.object.SinhVien;

public class Main {
	public static void main(String[] args) {		
		SinhVien sinhVien = new SinhVien();
		sinhVien.input();
		sinhVien.calculateAverageScore();
		sinhVien.classificationStudent();
		System.out.println(System.lineSeparator().repeat(100));
		sinhVien.output();
	}
}
