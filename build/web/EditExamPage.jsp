<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
    /*HTTP 1.1*/ response.setHeader("Pragma", "no-cache");
    /*HTTP 1.0*/ response.setDateHeader("Expires", -1);
%> 


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

        <script
            src="<c:url value="/resources/javascript/jquery-1.11.3.min.js" />"
        type="text/javascript"></script>
        <script src="<c:url value="/resources/javascript/bootstrap.min.js" />"
        type="text/javascript"></script>
        <script
            src="<c:url value="/resources/javascript/jquery.dataTables.min.js" />"
        type="text/javascript"></script>
        <script
            src="<c:url value="/resources/javascript/dataTables.bootstrap.js" />"
        type="text/javascript"></script>
        <%-- <script src="<c:url value="/resources/javascript/tasks.js" />" --%>
        <!-- 	type="text/javascript"></script> -->

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
                                </c:when>
                                <c:when test="${tracker == 'student'}">
                            <li><a>${student.getRegno()}</a></li>
                                </c:when>
                            </c:choose>

                    <li><a href="sign-in.html">Log out</a></li>
                </ul>
            </div>
        </div>
    </nav>
    <div class="container">
        <h2>Edit Exam</h2>


        <form action="${pageContext.request.contextPath}/EditExamPage" method="post">



            <div class="form-group">
                <input type="hidden" class="form-control" name="examId" value="${examId}">
            </div>
            <div class="form-group">
                <label for="title">Exam Title</label>
                <input type="text" class="form-control" id="title" name="title" placeholder="Enter Exam Title">
            </div>
            <div class="form-group">
                <label for="password">Credit</label>
                <input type="password" class="form-control" id="password" name="password" placeholder="Enter Password">
            </div>
            <div class="form-group">
                <label for="date">Start Date</label>
                <input type="text" class="form-control" id="date" name="date" placeholder="Enter Start Date">
            </div>
            <div class="form-group">
                <label for="duration">Duration(Minutes)</label>
                <input type="text" class="form-control" id="duration" name="duration" placeholder="Enter Exam Duration">
            </div>
            <div class="form-group">
                <label for="Score">Score</label>
                <input type="text" class="form-control" id="score" name="score" placeholder="Enter Score">
            </div>
            <input type="submit"></input>
        </form>
    </div>


</body>
</html>