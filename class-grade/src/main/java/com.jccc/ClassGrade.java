package com.jccc;

import java.util.List;

/**
 * This is the ClassGrade class.
 *
 * @author Daniel Terreros
 */

public class ClassGrade {

  private String subject;
  private String courseNumber;
  private String className;
  List<Assignment> assignments;

  /**
   * This is the constructor for the ClassGrade class.
   **/

  public ClassGrade(String subject, String courseNumber,
                    String className, List<Assignment> assignments) {
    this.subject = subject;
    this.courseNumber = courseNumber;
    this.className = className;
    this.assignments = assignments;
  }

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public String getCourseNumber() {
    return courseNumber;
  }

  public void setCourseNumber(String courseNumber) {
    this.courseNumber = courseNumber;
  }

  public String getClassName() {
    return className;
  }

  public void setClassName(String className) {
    this.className = className;
  }

  public List<Assignment> getAssignments() {
    return assignments;
  }

  public void setAssignments(List<Assignment> assignments) {
    this.assignments = assignments;
  }

  /**
   * This calculates the current class grade.
   */

  public double calculateCurrentClassGrade() {
    double receivedPoints = 0;
    double totalPoints = 0;
    for (Assignment assignment : assignments) {
      receivedPoints += assignment.getReceivedPoints();
      totalPoints += assignment.getTotalPoints();
    }
    if (totalPoints == 0) {
      return 0;
    }
    return Math.round(receivedPoints / totalPoints) * 1000.0 / 100.0;
  }

  @Override
  public String toString() {
    return "ClassGrade{"
            +
            "subject='" + subject + '\''
            +
            ", courseNumber='" + courseNumber + '\''
            +
            ", className='" + className + '\''
            +
            ", assignments=" + assignments
            +
            '}';
  }
}