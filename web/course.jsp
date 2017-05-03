<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@page import="Entity.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <meta name="viewport" content="width-device-width, initial-scale=1.0">
        <title>SUST Judge</title>
        <link href="<c:url value="/resources/css/topbar.css" />"
              rel="stylesheet" type="text/css" />

        <link href="<c:url value="/resources/css/bootstrap.min.css" />"
              rel="stylesheet" type="text/css" />
        <link href="<c:url value="/resources/css/bootstrap-theme.min.css" />"
              rel="stylesheet" type="text/css" />
        <link href="<c:url value="/resources/css/jquery.dataTables.min.css" />"
              rel="stylesheet" type="text/css" />
        <link href="<c:url value="/resources/css/dataTables.bootstrap.css" />"
              rel="stylesheet" type="text/css" />
        <link href="<c:url value="/resources/css/thesis-list.css"/>"
              rel="stylesheet" type="text/css" />
        <link href="<c:url value="/resources/css/footer-distributed.css"/>"
              rel="stylesheet" type="text/css" />

        <script
            src="<c:url value="/resources/javascript/jquery-1.11.3.min.js" />"
        type="text/javascript"></script>
        <script src="<c:url value="/resources/javascript/bootstrap.min.js" />"
        type="text/javascript"></script>
        <script
            src="<c:url value="/resources/javascript/jquery.dataTables.min.js" />"
        type="text/javascript"></script>

    </head>
    <body>

    <nav class="navbar navbar-default navbar-fixed-top">
        <div class="row topbar">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div
                class="
                col-sm-4 col-sm-offset-1
                col-xs-12">
                <a class="navbar-brand" href="${pageContext.request.contextPath}/login.jsp">SUST Judge<sup>alpha</sup></a>
            </div>
            <div
                class="
                col-sm-5 col-sm-offset-1
                col-xs-12">
                <ul class="nav navbar-nav navbar-right">
                    <c:choose>
                    <c:when test="${tracker == 'teacher'}">
                       <li><a>${teacher.getFullName()}</a></li>
                       <li><a href="Logout">Log out</a></li>
                    </c:when>
                    <c:when test="${tracker == 'student'}">
                       <li><a>${student.getRegno()}</a></li>
                       <li><a href="Logout">Log out</a></li>
                    </c:when>
                    </c:choose>
                            <%-- 			<li><a href="#">${UserRole.getUserName()}</a></li> --%>
                    <!-- 			<li><a href="#">Settings</a></li> -->
                    <!-- 			<li><a href="sign-in.html">Log Out</a></li> -->
                </ul>
            </div>
        </div>
    </nav>
    <c:choose>
        <c:when test="${empty tracker}">
            <div class="container"> Sorry not allowed to view this page </div>
        </c:when>
        <c:otherwise>
            <div class="container">
                <!-- THIS -->
                
                
                <!-- THIS -->
                
                <!-- NEW -->
                <div class="row searchbar">
            <div class="col-xs-8">
                <p class="table-headertext">
                    Session: <span id="course_code">${courseSession}</span>
                </p>
            </div>
                
                    <div class="col-xs-2">
                        
                    </div>
                <div class="col-xs-2">
                        
                        <select id="filter_session" class="form-control" onChange="go()">
                            <option selected disabled>Choose Session</option>
                            <option value="2010">2010</option>
                            <option value="2011">2011</option>
                            <option value="2012">2012</option>
                            <option value="2013">2013</option>
                            <option value="2016">2016</option>
                            <option value="1000">Show All</option>
                        </select>
                    </div>
                        
            
            </div>  
                
                
                
                <div class="panel">
                    <table id="courseTable"
                           class="table table-striped table-bordered table-hover">
                        <thead>
                            <tr>
                                <th class="col-md-1 col-sm-1 col-xs-1">ID</th>
                                <th class="col-md-2 col-sm-2 col-xs-2">Course Title</th>
                                <th class="col-md-2 col-sm-2 col-xs-2">Session</th>
                                
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${courses}" var="courses">
                                <tr>
                                    <td><c:out value="${courses.getCourseCount()}" /></td>
                                    <td><a
                                            href="${pageContext.request.contextPath}/ExamPage?courseId=${courses.getCourseId()}">
                                            <c:out value="${courses.getTitle()}" />
                                        </a></td>
                                    <td><c:out value="${courses.getSession()}" /></td>
                                    
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
                
            </div>
        </c:otherwise>
    </c:choose>
            
<footer class="footerme"><a style="color:white" href="Copyright.jsp">Copyright &copy; CSE, SUST</a></footer>


</body>
<script>
    $(document).ready(function () {
        $('#courseTable').DataTable();
    });

    function go() {
        var t = document.getElementById('filter_session').value.toString();
        var jspcall = "CourseBySession?session=" + t;
        window.location.href = jspcall;
    }
</script>
</html>