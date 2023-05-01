package com.jccc;

import java.util.List;

public class ClassGrade {

  private String subject;
  private String courseNumber;
  private String className;
  List<Assignment> assignments;

  public double calculateCurrentClassGrade() {
    double receviedPoints = 0;
    double totalPoints = 0;
    for (Assignment assignment : assignments) {
      receviedPoints += assignment.getPointsEarned();
      totalPoints += assignment.getPointsPossible();
    }
    return receviedPoints / totalPoints;
  }



}