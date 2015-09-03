package Grades;

public class Records {
private static float savegrade;
private static float exams;
public static void main(String[] args)

{
	Average.GetNumbers();
	System.out.println(Average.fourexams());
/*savegrade=Average.sum();   // THIS IS REFERENCING THE AVERAGE CLASS
System.out.println(savegrade);
exams= Average.threenumbers(50, 75, 100);
System.out.println(exams);
*/
}

}