package com.jccc;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the GradeManager class.
 *
 * @author Daniel Terreros
 */

public class GradeManager {

  private static List<ClassGrade> classGrades = new ArrayList<>();

  public static void addClassGrade(ClassGrade classGrade) {
    classGrades.add(classGrade);
  }

}
