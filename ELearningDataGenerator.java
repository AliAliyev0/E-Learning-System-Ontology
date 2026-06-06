package com.sahibinden.elearningdatagenerator;

import com.github.javafaker.Faker;
import java.util.Locale;
import java.util.Random;

public class ELearningDataGenerator {

    public static void main(String[] args) {
        // Sahte veri üreticiyi başlatalım (İngilizce isimler üretsin)
        Faker faker = new Faker(new Locale("en"));
        Random rand = new Random();

        System.out.println("=== E-LEARNING ONTOLOGY SENTETİK VERİ ÜRETİCİ ===");
        System.out.println("Bu veriler Madde 3 (Data Acquisition) kapsamında üretilmiştir.\n");

        // 1. Öğrenci Verileri Üretimi (Person, Student sınıfları için)
        System.out.println("--- GENERATED STUDENTS (ÖĞRENCİLER) ---");
        for (int i = 1; i <= 5; i++) {
            String name = faker.name().fullName();
            String email = name.toLowerCase().replace(" ", ".") + "@student.example.edu";
            System.out.println("Student_" + i + " -> hasName: '" + name + "', hasEmail: '" + email + "'");
        }

        // 2. Ders Verileri Üretimi (AcademicContent, Course sınıfları için)
        System.out.println("\n--- GENERATED COURSES (DERSLER) ---");
        for (int i = 1; i <= 3; i++) {
            String courseCode = "CS-" + faker.number().numberBetween(100, 599);
            String courseTitle = faker.educator().course();
            System.out.println("Course_" + i + " -> courseCode: '" + courseCode + "', courseTitle: '" + courseTitle + "'");
        }

        // 3. Not/Değerlendirme Verileri Üretimi (Evaluation, Grade sınıfları için)
        System.out.println("\n--- GENERATED GRADES (NOTLAR) ---");
        for (int i = 1; i <= 5; i++) {
            float score = 50 + rand.nextFloat() * 50; // 50 ile 100 arası rastgele not
            System.out.printf("Grade_%d -> score: '%.2f'\n", i, score);
        }
    }
}