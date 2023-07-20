import java.util.InputMismatchException;
import java.util.Scanner;


public class hospitalmanage{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DocServiceInterface service=new docimple() ;


        do{
            System.out.println("Welcome to Book Management Application");
            System.out.println("1.Add Doctor\n"+
                    "2.Show All Doctor\n"+
                    "3.Show Available Doctor\n"+
                    "4.Book Appointment\n"+
                    "5.Cancel Booking\n"+
                    "6.Exit\n");

        try{
            System.out.println("Enter Your Choice !");
            int ch = sc.nextInt();

            switch (ch){
                case 1:
                    service.addDoctor();
                    break;
                case 2:
                    service.showAllDoct();
                    break;
                case 3:
                    service.showAllAvailableDoct();
                    break;
                case 4:
                    service.bookappointment();
                    break;
                case 5:
                    service.returnBook();
                    break;
                case 6:
                    System.out.println("Thank you for Using Application !!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please Enter Valid Choice !");

            }
        }
        catch(InputMismatchException e){
            System.out.println("Enter valid choice");
            break;
        }
    }
        while(true);
   
    }
}
