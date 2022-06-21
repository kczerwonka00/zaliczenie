
import java.time.LocalDate;  
import java.time.Period;  
import java.util.Scanner;  
public class Main
{  
public static void main(String args[])   
{  
System.out.print("Poda datę urodzenia w formacie YYYY-MM-DD: ");  
Scanner scanner = new Scanner(System.in);  
 
String input = scanner.nextLine();  
scanner.close();  

LocalDate dob = LocalDate.parse(input);  

System.out.println("Masz " + calculateAge(dob)+" lat.");  
}  
 
public static int calculateAge(LocalDate dob)   
{  
   
LocalDate curDate = LocalDate.now();  
 
if ((dob != null) && (curDate != null))   
{  
return Period.between(dob, curDate).getYears();  
}  
else  
{  
return 0;  
}  
}  
}  