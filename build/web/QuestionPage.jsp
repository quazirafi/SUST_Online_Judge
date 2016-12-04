<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
   <% response.setHeader("Cache-Control","no-cache"); 
/*HTTP 1.1*/ response.setHeader("Pragma","no-cache"); 
/*HTTP 1.0*/ response.setDateHeader ("Expires", 0);
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
			<a class="navbar-brand" href="${pageContext.request.contextPath}/sign-in.html">SUST Judge<sup>alpha</sup></a>
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
                                <c:if test="${tracker=='teacher'}">
                                <li><a href="#">Questions</a></li>
				<li><a href="#">Student Performance</a></li>
				</c:if>
                                <li><a href="sign-in.html">Log out</a></li>
			       
                            </ul>
		</div>
	</div>
	</nav>

	<div class="container">
		<div class="row searchbar">
			<div class="col-xs-8">
                            <p class="table-headertext">
                                <c:if test="${tracker=='test'}">
				Summary: <span id="course_code">54 Students attended,101 submissions</span>
                            </c:if>
                              </p>
			</div>
			<c:choose>
                <c:when test="${course.getIsRunning() eq 1}">
                    <div class="col-xs-2">
                        <c:if test="${tracker=='teacher'}">
                        <button id="button_add_task" class="btn btn-success col-xs-12" onClick="goToAddTaskPage()">
                            <i class="glyphicon glyphicon-plus-sign"></i> Add New Question
                        </button>
                        </c:if>
                    </div>
                    
                </c:when>
            </c:choose>
                </div>       
                 
	<!--	<div class="clearfix"></div> -->
		<!-- TABLE -->
		<div class="panel">

			<table id="taskTable"
				class="table table-striped table-bordered table-hover">
				<thead>
					<tr>						
						<th class="col-md-3 col-sm-3 col-xs-3">Ques. Id</th>						
						<th class="col-md-3 col-sm-3 col-xs-3">Title</th>
						<th class="col-md-3 col-sm-3 col-xs-3">Score</th>						
						<th class="col-md-2 col-sm-2 col-xs-2">Actions</th>
					</tr>
				</thead>
				<tbody>			
                                    <c:forEach items="${questions}" var="questions">
                                	<tr>
						<td>${questions.getCounter()}</td>
                                                <td><button style="border: none;cursor: pointer" data-toggle="modal" data-target="#myModal" value="${questions.getPath()}" onclick="loadDoc(this.value)">${questions.getTitle()}</button>				
						<td>${questions.getScore()}</td>
                                               
						<td>
                                                     <c:if test="${tracker=='teacher'}">
                                                    <a class="btn btn-info btn-sm removebutton" onclick="" title="Remove"><i
									class="glyphicon glyphicon-remove "></i></a>
                                                            <a class="btn btn-info btn-sm editbutton" onclick="" title="Edit Test Case File"><i
									class="glyphicon glyphicon-edit "></i></a>
                                                            <a class="btn btn-info btn-sm editbutton" onclick="" title="Edit Question File"><i
									class="glyphicon glyphicon-edit "></i></a>
						</c:if>
                                                     <c:if test="${tracker=='student'}">
                                                         <c:out value="Not Allowed"/>
                                                     </c:if>
                                                     </td>
                                                
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
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        
      </div>
    </div>
  </div>
</div>
	<a href="${pageContext.request.contextPath}/courseback">Previous Page</a>
	</div>
	<!-- body container -->
</body>

<script>   
    $(document).ready(function () {
            $('#taskTable').DataTable();
            
        });
function loadDoc(path) {
    var xhttp = new XMLHttpRequest();
    xhttp.open("GET", path, false);
    xhttp.send();
    document.getElementById("text1").innerHTML = xhttp.responseText;
}    
</script>
</html>
<!-- data-toggle="modal" data-target="#myModal" -->