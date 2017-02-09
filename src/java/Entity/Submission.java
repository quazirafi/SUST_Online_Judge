
package Entity;

public class Submission {
    private int submissionCount = 0;
    private int studentId;
    private int questionid;
    private String verdict;
    private String submissionFileName;
    private int marks;

    public int getSubmissionCount() {
        return submissionCount;
    }

    public void setSubmissionCount(int submissionCount) {
        this.submissionCount = submissionCount;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getQuestionid() {
        return questionid;
    }

    public void setQuestionid(int questionid) {
        this.questionid = questionid;
    }

    public String getVerdict() {
        return verdict;
    }

    public void setVerdict(String verdict) {
        this.verdict = verdict;
    }

    public String getSubmissionFileName() {
        return submissionFileName;
    }

    public void setSubmissionFileName(String submissionFileName) {
        this.submissionFileName = submissionFileName;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
    
}
