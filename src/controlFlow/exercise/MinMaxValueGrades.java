package controlFlow.exercise;

public class MinMaxValueGrades {
    public static void main(String[] args) {
        int[] grades = {85, 90, 78, 92, 88};
        int max = grades[0];
        int min = grades[0];

        for (int grade : grades){
            if(grade > max){
                max = grade;
            }
            if (grade < min){
                min = grade;
            }
        }

        System.out.println("The Max Value is :"+max);
        System.out.println("The Min Value is :"+min);
    }
}
