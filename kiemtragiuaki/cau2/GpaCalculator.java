/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cau2;

import java.util.List;

public class GpaCalculator {
    public static double calculateAverageGpa(List<Student> students) {
        double sum = 0;
        for (Student s : students) {
            sum += s.getGpa();
        }
        return students.isEmpty() ? 0 : sum / students.size();
    }
}
