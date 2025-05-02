public class ExamResults {
         void checkResults(int marks){
            if(marks >=40){
                System.out.println("PASS");
            }
            else{
                System.out.println("FAIL");
            }
         }
        public static void main(String[] args) {
            ExamResults obj = new ExamResults();
            obj.checkResults(50);
        }
    }
