package com.jccc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import java.util.ArrayList;
import java.util.List;

public class GradeManagerTest {

  @Test
  public void testAddClassGrade() {
    ClassGrade classGrade = new ClassGrade("CIS", "240", "Java", new ArrayList<>());
    GradeManager.addClassGrade(classGrade);
    List<ClassGrade> classGrades = GradeManager.getClassGrades();
    assertTrue(classGrades.contains(classGrade));
  }

  @Test
  public void testAddAssignment() {
    ClassGrade classGrade = new ClassGrade("CIS", "240", "Java", new ArrayList<>());
    GradeManager.addClassGrade(classGrade);
    Assignment assignment = new Assignment("Week 1 Lab", 80, 100);
    boolean result = GradeManager.addAssignment("Java", assignment);
    assertTrue(result);
    assertEquals(assignment, classGrade.getAssignments().get(0));
  }

  @Test
  public void testAddAssignmentWithInvalidClassName() {
    Assignment assignment = new Assignment("Week 1 Lab", 80, 100);
    boolean result = GradeManager.addAssignment("NOT REAL", assignment);
    assertFalse(result);
  }

  @Test
  public void testGetClassGradeByClassName() {
    ClassGrade classGrade1 = new ClassGrade("CS", "260", "SQL", new ArrayList<>());
    Assignment assignment1 = new Assignment("Week 2 Lab", 80, 100);
    GradeManager.addClassGrade(classGrade1);
    GradeManager.addAssignment("SQL", assignment1);
    ClassGrade result1 = GradeManager.getClassGradeByClassName("SQL");
    System.out.println(result1);
    assertEquals(classGrade1, result1);
  }

  @Test
  public void testGetClassGradeByClassNameWithInvalidClassName() {
    ClassGrade result = GradeManager.getClassGradeByClassName("I DO NOT EXIST!");
    assertNull(result);
  }

  @Test
  public void testGetClassGrades() {
    ClassGrade classGrade1 = new ClassGrade("Math", "101", "Mathematics 101", new ArrayList<>());
    ClassGrade classGrade2 = new ClassGrade("English", "201", "English 201", new ArrayList<>());
    GradeManager.addClassGrade(classGrade1);
    GradeManager.addClassGrade(classGrade2);
    List<ClassGrade> classGrades = GradeManager.getClassGrades();
    assertTrue(classGrades.contains(classGrade1));
    assertTrue(classGrades.contains(classGrade2));
  }
}
