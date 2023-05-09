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

      if (classGrade.getClassName().equals(className)) {
        List<Assignment> assignments = classGrade.getAssignments();
        assignments.add(assignment);
        classGrade.setAssignments(assignments);
        return true;
      }
    }
    return false;
  }


  /**
   * This is the method to get a class grade by class name.
   */
  public static ClassGrade getClassGradeByClassName(String className) {
    for (ClassGrade classGrade : classGrades) {
      if (classGrade.getClassName().equals(className)) {
        return classGrade;
      }
    }
    return null;
  }

  public static List<ClassGrade> getClassGrades() {
    return classGrades;
  }
}
