<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
   <% response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
    /*HTTP 1.1*/ response.setHeader("Pragma", "no-cache");
    /*HTTP 1.0*/ response.setDateHeader("Expires", -1);
%> 
<%@ page import="Entity.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width-device-width, initial-scale=1.0">
<title>SUST Judge</title>
<link href="<c:url value="/resources/css/topbar.css" />"
	rel="stylesheet" type="text/css" />
<link href="<c:url value="/resources/css/buttonstyles.css"/>"
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
                            
                                </c:when>
                                <c:when test="${tracker == 'student'}">
                            <li><a>${student.getRegno()}</a></li>
                                </c:when>
                            </c:choose>
                                <c:if test="${tracker=='teacher'}">
                                <li><a href="${pageContext.request.contextPath}/ToCourse">Courses</a></li>
                                <li><a href="${pageContext.request.contextPath}/ExamPage?courseId=${course.getCourseId()}">Exams</a></li>
                                <li><a href="QuestionPage?examId=${exam.getExamId()}">Questions</a></li>
                                <li><a href="StudentListPage?examId=${exam.getExamId()}">Students</a></li>
				<li><a href="${pageContext.request.contextPath}/ToDashboard">Performance</a></li>
				</c:if>
                                <li><a href="Logout">Log out</a></li>
			       
                            </ul>
		</div>
	</div>
	</nav>

	<div class="container">
            <form action="StudentListPage" method="post" >
		<div class="row searchbar">
			<div class="col-xs-8">
                            <p class="table-headertext">
                               
                            </p>
			</div>
                     <div class="col-xs-2">
                         <button class="deletion3" onclick="removeAll()" type="button">Remove All</button>
			</div>
                        <div class="col-xs-2">
                            <input class="addition3" type="submit" value="Add Students" />
			</div>
			
                </div>       
                 
	<!--	<div class="clearfix"></div> -->
		<!-- TABLE -->
                
                     Batch Name <input type="text" name="batch" /> 
                     <br>
                     <br>
		<div class="panel">
                    
                       
			<table id="studentTable"
				class="table table-striped table-bordered table-hover">
				<thead>
					<tr>						
						<th class="col-md-3 col-sm-3 col-xs-3">Student Id</th>						
						<th class="col-md-3 col-sm-3 col-xs-3">Registration Number</th>					
						<th class="col-md-2 col-sm-2 col-xs-2">Actions</th>
					</tr>
				</thead>
				<tbody>			
                                    <c:forEach items="${studentsEntered}" var="studentsEntered">
                                	<tr>
                                            <td>${studentsEntered.getCounter()}</td>
                                            <td>${studentsEntered.getRegno()}</td>
                                            <td><input type="checkbox" name="studentsIds" value="${studentsEntered.getStudentId()}" /> </td>
					</tr>
                                     </c:forEach>   
				</tbody>
			</table>
                        
                    
                    
		</div>
                </form> 
		<!-- panel -->


		

<!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
        <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Question</h4>
      </div>
      <div class="modal-body">
           <textarea id="text1" cols="80" rows="20" ></textarea>
      </div>
      <div class="modal-footer">
        
      </div>
    </div>
  </div>
</div>
	
	</div>
	<!-- body container -->
</body>

<script>   
    $(document).ready(function () {
            $('#studentTable').DataTable();
            
        });
function removeAll(){
    var result = confirm('Are you sure ?');
    if (result){
        window.location.href = "DeleteStudents";
    }
}
function loadDoc(path) {
    var xhttp = new XMLHttpRequest();
    xhttp.open("GET", path, false);
    xhttp.send();
    document.getElementById("text1").innerHTML = xhttp.responseText;
}    
</script>
</html>
<!-- data-toggle="modal" data-target="#myModal" -->