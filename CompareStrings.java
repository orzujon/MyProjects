import java.util.Scanner;

public class CompareStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int students = scanner.nextInt();
        int n = 0;
        int AGrade = 0;
        int BGrade = 0;
        int CGrade = 0;
        int DGrade = 0;
        while(students >= n){
            String input = scanner.nextLine();
            if (input.equals("A")){
                AGrade++;
            } else if(input.equals("B")){
                BGrade++;
            } else if(input.equals("C")){
                CGrade++;
            } else if(input.equals("D")){
                DGrade++;
            }
            n++;
        }
        System.out.println(AGrade + " " + BGrade + " " + DGrade + " " + CGrade);
    }
}

