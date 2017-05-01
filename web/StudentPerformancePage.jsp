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
<link href="<c:url value="/resources/css/buttonstyles.css"/>"
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
		     
                 
	<!--	<div class="clearfix"></div> -->
		<!-- TABLE -->
                <div class="row searchbar">
                    <div class="col-xs-8">
                    </div>
                    <div class="col-xs-2">
                        
                    </div>
                    <div class="col-xs-2">
                        <c:if test="${tracker == 'teacher'}">
                            <select id="filter_session" class="form-control" onchange="go()">
                            <option selected disabled>Choose a Batch</option>
                            <c:forEach items="${batches}" var="batches">
                                <option value="${batches}">${batches}</option>
                            </c:forEach>
                            <option value="all">Show All</option>
                        </select>
                    </div>
                    
                        </c:if>
                </div>
		<div class="panel">

			<table id="taskTable"
                           class="table table-striped table-bordered table-hover">
                        <thead>
                            <tr>
                                <th class="col-md-1 col-sm-1 col-xs-1">ID</th>
                                <th class="col-md-2 col-sm-2 col-xs-2">Registration Number</th>
                                <th class="col-md-2 col-sm-2 col-xs-2">Number Of Accepted Submissions</th>
                                <th class="col-md-2 col-sm-2 col-xs-2">Total Marks</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${studentPerformances}" var="studentPerformances">
                                <tr>
                                    <td><c:out value="${studentPerformances.getCounter()}" /></td>
                                    <td><a href="${pageContext.request.contextPath}/ToIndividualSubmissionPage?sId=${studentPerformances.getStudentId()}"><c:out value="${studentPerformances.getStudentRegNo()}" /></a>
                                    </td>
                                    <td><c:out value="${studentPerformances.getNumOfAccepted()}" />
                                    </td>
                                    <td><c:out value="${studentPerformances.getSumOfScores()}" /></td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
		</div>
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
<div class="modal fade" id="myModal2" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Upload Test Case FIle(.txt format)</h4>
      </div>
      <div class="modal-body">
          <form action="AddTestCase" method="post" enctype="multipart/form-data">
                <input type="file" name="file" size="50" />
                <input type="hidden" name="qId" id="qId" />
<!--                <input type="hidden" name="type" value="test"/>-->
<input type="submit" value="Submit" />
          </form>
      </div>
      <div class="modal-footer">
        
      </div>
    </div>
  </div>
</div>
<div class="modal fade" id="myModal3" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Upload Output FIle(.txt format)</h4>
      </div>
      <div class="modal-body">
          <form action="AddOutputFile" method="post" enctype="multipart/form-data">
                <input type="file" name="file" size="50" />
                <input type="hidden" name="qId2" id="qId2" />
<!--                <input type="hidden" name="type" value="output"/>-->
<input type="submit" value="Submit" />
          </form>
      </div>
      <div class="modal-footer">
        
      </div>
    </div>
  </div>
</div>
	
	</div>
	<footer class="footerme">Copyright &copy; CSE, SUST</footer>
</body>

<script>   
    $(document).ready(function () {
            $('#taskTable').DataTable();
            
        });
function loadDoc(path) {
    //alert(path);
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
    if (this.readyState == 4 && this.status == 200) {
      document.getElementById("text1").innerHTML =
      this.responseText;
    }
  };
    xhttp.open("GET", "SendFile?"+"path="+path, false);
    xhttp.send();
    
    //document.getElementById("text1").innerHTML = xhttp.responseText;
}    
function goToAddQuestionPage(){
    window.location.href = "AddQuestionPage"
}
function go(){
   var batch = document.getElementById("filter_session").value;
   window.location.href = "StudentPerformanceBatchwise?batch="+batch;
}
 $(document).ready(function () {
            $('#taskTable').DataTable();
            $(".addition").click(function(){
                var id=$(this).data('id');
                document.getElementById('qId').value=id;
               $('#myModal2').modal('show'); 
            });
            $(".addition2").click(function(){
                var id=$(this).data('id');
                alert(id);
                document.getElementById('qId2').value=id;
               $('#myModal3').modal('show'); 
            });
        });
</script>
</html>
 