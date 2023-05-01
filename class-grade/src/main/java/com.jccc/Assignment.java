package com.jccc;

/**
 * This is the Assignment class.
 *
 * @author Daniel Terreros
 */

public class Assignment {

  private String name;
  private double receivedPoints;
  double totalPoints;

  /**
   * This is the constructor for the Assignment class.
   */

  public Assignment(String name, double receivedPoints, double totalPoints) {
    this.name = name;
    this.receivedPoints = receivedPoints;
    this.totalPoints = totalPoints;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getReceivedPoints() {
    return receivedPoints;
  }

  public void setReceivedPoints(double receivedPoints) {
    this.receivedPoints = receivedPoints;
  }

  public double getTotalPoints() {
    return totalPoints;
  }

  public void setTotalPoints(double totalPoints) {
    this.totalPoints = totalPoints;
  }

  public double calculateGrade() {
    return Math.round(receivedPoints / totalPoints) * 1000.0 / 100.0;
  }

  @Override
  public String toString() {
    return "Assignment{"
            +
            "name='" + name + '\''
            +
            ", receivedPoints=" + receivedPoints
            +
            ", totalPoints=" + totalPoints
            +
            '}';
  }
}






