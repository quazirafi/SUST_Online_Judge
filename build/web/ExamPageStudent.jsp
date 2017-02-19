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
                <a class="navbar-brand" href="${pageContext.request.contextPath}/">SUST Judge<sup>alpha</sup></a>
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
                            <li><a href="${pageContext.request.contextPath}/ToCourse">Courses</a></li>
                            <li><a href="${pageContext.request.contextPath}/Logout">Logout</a></li>
                                </c:when>
                            </c:choose>

                    <li><a href="Logout">Log out</a></li>
                </ul>
            </div>
        </div>
    </nav>

    <div class="container">
        <div class="row searchbar">
            <div class="col-xs-8">
                <p class="table-headertext">
                    Course Title: <span id="course_code">${courseTitle}</span>
                </p>
            </div>
            <c:choose>
                <c:when test="${course.getIsRunning() eq 1}">
                    <div class="col-xs-2">
                        <c:if test="${tracker == 'teacher'}">

                       <button id="button_add_task" data-toggle="modal" data-target="#myModal1" class="btn btn-success col-xs-12" onClick="goToAddTaskPage()">
                            <i class="glyphicon glyphicon-plus-sign"></i> Add New Exam
                        </button>
                                 </c:if>
                    </div>
                    <div class="col-xs-2">
                        <c:if test="${tracker == 'teacher'}">
                            <button id="button_add_task" class="btn btn-success col-xs-12" onClick="goToAddTaskPage()">
                            <i class="glyphicon glyphicon-plus-sign"></i> Add From Previous
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
                            <th class="col-md-1 col-sm-1 col-xs-1">Exam. Id</th>						
                            <th class="col-md-3 col-sm-3 col-xs-3">Title</th>
                            <th class="col-md-2 col-sm-2 col-xs-2">Start Time</th>						
                            <th class="col-md-2 col-sm-2 col-xs-2">Duration(Minutes)</th>
                            <th class="col-md-2 col-sm-2 col-xs-2">Score</th>
                            
                            <th class="col-md-2 col-sm-2 col-xs-2">Status</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${exams}" var="exams">


                            <tr>
                                <td><c:out value="${exams.getExamCount()}" /></td>
                                <td>
                                    <c:if test="${tracker=='student'}">
                                        <c:set var="idNo"  value="${exams.getExamId()}"/>
                                        <button style="border: none;cursor: pointer" data-toggle="modal" class="exambtn" data-id=${exams.getExamId()}>
                                            <c:out value="${exams.getTitle()}" />
                                                
                                            
                                        </button>
                                    </c:if>
                                    <c:if test="${tracker=='teacher'}">
                                    <a
                                        href="${pageContext.request.contextPath}/QuestionPage?examId=${exams.getExamId()}">
                                        <c:out value="${exams.getTitle()}" />
                                    </a>
                                    </c:if>
                                
                                </td>					
                                <td><c:out value="${exams.getStartTime()}" /></td>
                                <td><c:out value="${exams.getDuration()}" /></td>
                                <td><c:out value="${exams.getScore()}" /></td>
                                

                                <td><c:out value="${exams.getStatus()}" /></td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
            <!-- panel -->


            <div class="modal fade" id="modalTaskInfo" tabindex="-1" role="dialog"
                 aria-labelledby="myModalLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal"
                                    aria-label="Close">
                                <span aria-hidden="true">&times;</span>
                            </button>
                            <h4 class="modal-title" id="myModalLabel">Task details</h4>
                        </div>
                        <div class="modal-body">
                            <div class="row">
                                <div class="col-md-1">
                                    <label>ID</label>
                                </div>
                                <div class="col-md-1">
                                    <p id="view_task_id"></p>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-3">
                                    <label>Title</label>
                                </div>
                                <div class="col-md-3">
                                    <p id="view_task_title"></p>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-1">
                                    <label>Type</label>
                                </div>
                                <div class="col-md-1">
                                    <p id="view_task_type"></p>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-1">
                                    <label>Description</label>
                                </div>
                                <div class="col-md-1">
                                    <p id="view_task_description"></p>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-2">
                                    <label>Deadline</label>
                                </div>
                                <div class="col-md-2">
                                    <p id="view_task_deadline"></p>
                                </div>
                            </div>

                            <div class="row">
                                <div class="col-md-2">
                                    <label>Total Group</label>
                                </div>
                                <div class="col-md-2">
                                    <p id="view_task_total_group"></p>
                                </div>
                            </div>

                            <div class="row">
                                <div class="col-md-2">
                                    <label>Total Submission</label>
                                </div>
                                <div class="col-md-2">
                                    <p id="view_task_total_submission"></p>
                                </div>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                        </div>
                    </div>
                </div>
            </div>
            <!-- Modal Details -->

            <div class="modal fade" id="modalTaskEdit" tabindex="-1" role="dialog"
                 aria-labelledby="myModalLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <form id="edit_task" name="edit_task" method="post">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal"
                                        aria-label="Close"">
                                    <span aria-hidden="true">&times;</span>
                                </button>
                                <h4 class="modal-title" id="modal_label">Edit Task</h4>
                            </div>
                            <div class="modal-body">
                                <input type="hidden" name="taskId" id="edit_task_id"></input>
                                <div class="row bottom-buffer">
                                    <div class="col-md-8">
                                        <label>Session</label>
                                    </div>
                                    <div class="col-md-4">
                                        <select name="session" id="session" type="text"
                                                class="form-control"></select>
                                    </div>
                                </div>
                                <div class="row bottom-buffer">
                                    <div class="col-md-4">
                                        <label>Title</label>
                                    </div>
                                    <div class="col-md-8">
                                        <input name="taskTitle" id="edit_task_title" type="text"
                                               class="form-control"></input>
                                    </div>
                                </div>

                                <div class="row bottom-buffer">
                                    <div class="col-md-4">
                                        <label>Description</label>
                                    </div>
                                    <div class="col-md-8">
                                        <textarea name="taskDesc" id="edit_task_description"
                                                  type="text" class="form-control"></textarea>
                                    </div>
                                </div>

                                <div class="row bottom-buffer">
                                    <div class="col-md-4">
                                        <label>Final Submission Deadline</label>
                                    </div>
                                    <div class="col-md-8">
                                        <textarea name="taskDeadline" id="edit_task_deadline"
                                                  type="text" class="form-control"></textarea>
                                    </div>
                                </div>

                                <div class="row bottom-buffer">
                                    <div class="col-md-4">
                                        <label>Maximum Allowed Groups</label>
                                    </div>
                                    <div class="col-md-8">
                                        <select name="taskTotalGroupNo" id="edit_task_group_number"
                                                class="form-control">
                                            <option selected="selected">1</option>
                                            <option>2</option>
                                            <option>3</option>
                                            <option>4</option>
                                            <option>5</option>
                                        </select>
                                    </div>
                                </div>

                                <div class="row bottom-buffer">
                                    <div class="col-md-4">
                                        <label>Maximum Allowed Submissions</label>
                                    </div>
                                    <div class="col-md-8">
                                        <textarea name="taskTotalSubmissonNo"
                                                  id="edit_task_total_submission" type="text"
                                                  class="form-control"></textarea>
                                    </div>
                                </div>

                                <div class="row bottom-buffer">
                                    <div class="col-md-8 col-md-offset-4">
                                        <input type="checkbox" name="isOpen" id="edit_task_sopen"
                                               value="true" checked> Submissions open<br>
                                    </div>
                                </div>

                                <div class="row bottom-buffer">
                                    <div class="col-md-4">
                                        <label>Type</label>
                                    </div>
                                    <div class="col-md-8">
                                        <!-- Changed name from 'taskTypeId' to 'taskType' for switching from Entity to Bean -->
                                        <select name="taskType" id="edit_task_type"
                                                class="form-control">
                                            <option>Assignment</option>
                                            <option selected="selected">Project</option>
                                        </select>
                                    </div>
                                </div>




                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-default"
                                        data-dismiss="modal">Close</button>
                                <!-- <button type="submit" class="btn btn-info">Save changes</button> -->
                                <input type="submit" value="Submit" class="btn btn-info">
                            </div>
                        </form>
                    </div>
                </div>
            </div>
            <!--Modal Edit -->

            <div class="modal fade" id="modalTaskDelete" tabindex="-1"
                 role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <form id="delete_task" name="delete_task" method="post">

                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal"
                                        aria-label="Close" disabled="isMe">
                                    <span aria-hidden="true">&times;</span>
                                </button>
                                <h4 class="modal-title">Delete Task</h4>
                            </div>
                            <div class="modal-body">Are you sure you want to delete this
                                entry?</div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-default"
                                        data-dismiss="modal">Cancel</button>
                                <input type="submit" value="Delete" class="btn btn-info">
                            </div>

                        </form>
                    </div>
                </div>
            </div>
            <!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
       Modal content
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Exam Password</h4>
        </div>
        <div class="modal-body">
            <form action="QuestionPage" method="post">
             <input type="hidden" id="hid" name="examId" value=""><br>
             
  Password: <input type="password" name="password"><br>
  <input type="submit" value="Submit">
</form>
        </div>
        
      </div>
      
    </div>
  </div>
            <div class="modal fade" id="myModal2" role="dialog">
    <div class="modal-dialog">
    
       Modal content
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Exam Password</h4>
        </div>
        <div class="modal-body">
            <form action="QuestionPage" method="post">
             <input type="hidden" id="hid2" name="examId" value=""><br>
             
  Password: <input type="password" name="password"><br>
  <input type="submit" value="Submit">
</form>
        </div>
        
      </div>
      
    </div>
  </div>
            <!-- Modal delete -->
            <a href="${pageContext.request.contextPath}/courseback">Previous Page</a>
        </div>
       
    </body>

    <script>
        //alert("alert");
        var id="";
        $(document).ready(function () {
            $('#taskTable').DataTable();
            $(".exambtn").click(function(){
                var id=$(this).data('id');
                document.getElementById('hid').value=id;
               $('#myModal').modal('show'); 
            });
        });
        
       
    </script>
</html>