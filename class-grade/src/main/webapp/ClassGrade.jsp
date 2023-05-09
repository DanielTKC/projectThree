<%@ page import="com.jccc.ClassGrade" %>
<%@ page import="com.jccc.GradeManager" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
    <title>Class Grade</title>
</head>
<body>
<h1>Class Grade</h1>


<% String subject = request.getParameter("classSubject"); %>
<% String courseNo = request.getParameter("courseNo"); %>
<% String className = request.getParameter("classNa"); %>


<% if (request.getParameter("addClass") != null) { %>

<% ClassGrade classGrade = new ClassGrade(subject, courseNo, className, new ArrayList<>()); %>

<% GradeManager.addClassGrade(classGrade); %>

<% double currentGrade = classGrade.calculateCurrentClassGrade(); %>

<p>Current class grade: <%= currentGrade %></p>
<% } %>

</body>
</html>