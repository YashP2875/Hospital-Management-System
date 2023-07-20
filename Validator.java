import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.LinkedList;

public class Validator {
    String RED = "\u001B[31m";   // remove final
    String RESET = "\u001B[0m";  // remove final
    Pattern ID_PATTERN = Pattern.compile("^\\d{1,4}$");
    Pattern AuthorTitle_Pattern = Pattern.compile("^[a-zA-Z ]+$");
    Pattern PublishYear_Pattern = Pattern.compile("^\\d{4}$");
    Pattern Doctor_Degree=Pattern.compile("^[a-zA-Z]+$");
    Scanner sc = new Scanner(System.in);
    LinkedList<doctor> docs = new LinkedList<>();

    public String validateId() {
        String bookid;
        while (true) {
            System.out.println("Enter DOCTOR ID ");
            bookid = sc.nextLine();
            
            if (!ID_PATTERN.matcher(bookid).matches()) {
                System.out.println(RED + "SORRY ! PLEASE ENTER VALID DOCTOR ID " + RESET);
            } else {
                break;
            }
        }
        return bookid;
    }

    public String validateDoctorName(String input) {
        String result;
        while (true) {
            if (input == "Name") {
                System.out.println("Enter NAME");
            } else {
                System.out.println("Enter DEGREE");
            }
            result = sc.nextLine();
            if (!AuthorTitle_Pattern.matcher(result).matches()) {
                System.out.println(RED + "Please Enter Valid " + input + RESET);
            } else {
                break;
            }

        }
        return result;
    }

    public String validatePassoutYear() {
        String year;
        while (true) {
            System.out.println("Enter PASSOUT Year of GRADUATION ");
            year = sc.nextLine();
            if (!PublishYear_Pattern.matcher(year).matches()) {
                System.out.println(RED + "Enter valid  Year" + RESET);
            } else {
                break;
            }
        }
        return year;
    }

    public String validateDegree(String input) {
        String D;
        while (true){
            System.out.println("Enter Degree");
            D=sc.nextLine();
            if (!Doctor_Degree.matcher(D).matches()){
                System.out.println(RED+"Enter Valid Degree"+RESET);
            }else {
                break;
            }
        }
        return D;

    }

}