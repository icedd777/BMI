/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Risad Duamatubun
 */
public class bmi {
public static void kalkulatorBMI(double tinggi, double berat) {
        double bmi = berat / (tinggi * tinggi);
        System.out.printf("BMI Anda adalah: %.2f\n", bmi);
        
        // Menentukan kategori BMI
        if (bmi < 18.5) {
            System.out.println("Kekurangan berat badan");
        } else if (bmi < 24.9) {
            System.out.println("Berat badan normal");
        } else if (bmi < 29.9) {
            System.out.println("Kelebihan berat badan");
        } else {
            System.out.println("Kegemukan");
        }
    }
}
