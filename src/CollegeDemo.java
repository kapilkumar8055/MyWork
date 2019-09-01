import java.util.Scanner;
public class CollegeDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        College input2 = new College();
        System.out.println("Enter Name");
        input2.name = input.nextLine().trim();
        System.out.println("Enter Branch");
        input2.branch = input.nextLine().trim();
        System.out.println("Enter course");
        input2.course = input.nextLine().trim();
        System.out.println("Enter University Roll No");
        input2.universityRollNo = input.nextInt();
        System.out.print(input2.name + "\n" + input2.course + "\n" + input2.branch + "\n" + input2.universityRollNo);
    }

}

class College {
    String name;
    String branch;
    String course;
    int universityRollNo;
}
