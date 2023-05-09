<%@ page import="com.jccc.Assignment" %>
<%@ page import="com.jccc.ClassGrade" %>
<%@ page import="com.jccc.GradeManager" %>
<%@ page import="java.util.List" %>

<!DOCTYPE html>
<html>
<head>
    <title>Assignment</title>
</head>
<body>
<h1>Assignment</h1>

<%
    // Get the parameters from the form
    String className = request.getParameter("classNa");
    String assignmentName = request.getParameter("assignmentNa");
    double receivedPoints = Double.parseDouble(request.getParameter("rPoints"));
    double totalPoints = Double.parseDouble(request.getParameter("tPoints"));

    // Create a new Assignment
    Assignment assignment = new Assignment(assignmentName, receivedPoints, totalPoints);

    // Add the Assignment to the class grade.
    boolean success = GradeManager.addAssignment(className, assignment);

    if (success) {
        // ClassGrade updated
        ClassGrade classGrade = GradeManager.getClassGradeByClassName(className);

        // Calculate the grade
        double assignmentGrade = assignment.calculateGrade();
%>
<h2>Assignment Grade: <%= assignmentGrade %></h2>
<%
} else {
%>
<h2>Failed to add Assignment to <%= className %></h2>
<%
    }
%>


</body>
</html>
