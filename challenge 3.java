public class ExamResults {
    void CheckResults(int marks) {
     
        // Assign values to the variables
        if (marks >= 50) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }
        }
    public static void main(String[] args) {
        ExamResults exam = new ExamResults();
        exam.CheckResult(45); 
