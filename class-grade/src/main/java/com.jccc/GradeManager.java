package com.jccc;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the GradeManager class.
 *
 * @author Daniel Terreros
 */

public class GradeManager {

  private static List<ClassGrade> classGrades;


  /**
   * This is the method to add a class grade.
   */
  public static void addClassGrade(ClassGrade classGrade) {
    classGrades.add(classGrade);
  }

  /**
   * This is the method to add an assignment.
   */

  public static boolean addAssignment(String className, Assignment assignment) {
    for (ClassGrade classGrade : classGrades) {
      if (ClassGrade.getClassName().equals(className)) {
        classGrade.setAssignments((List<Assignment>) assignment);
        return true;
      }
    }
    return false;
  }

  public static ClassGrade getClassGradeByClassName(String className) {
    for (ClassGrade classGrade : classGrades) {
      if (ClassGrade.getClassName().equals(className)) {
        return classGrade;
      }
    }
    return null;
  }






}
