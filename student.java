import java.util.Scanner;
class InvalidDateException extends Exception {
    InvalidDateException(String s) {
        super(s);
    }
}
public class student {
    private String USN, Name, DOB;
    student(String USN, String Name, String DOB) {
        this.USN = USN;
        this.Name = Name;
        this.DOB = DOB;
    }
    private void showStudent() {
        System.out.println("Name: "+Name+"\nUSN: "+USN+"\nDOB: "+DOB);
    }
    public static void validate(String date) throws InvalidDateException{
        String s[];
        s = date.split("-",0);
        int d = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        if( (d>=1 && d<=31) && (m>=1 && m<=12) )
            System.out.println("The entered date is valid.");
        else
            throw new InvalidDateException("The entered date is invalid.");
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        student st;
        String USN, Name, DOB, option;
        while(true) {
            System.out.println("Enter student information? [y/n]");
            option = sc.nextLine();
            if(option.equalsIgnoreCase("n"))
                break;
            System.out.println("Enter the Name:");
            Name=sc.nextLine();
            System.out.println("Enter the USN:");
            USN=sc.nextLine();
            System.out.println("Enter the DOB:");
            DOB=sc.nextLine();
            try {
                validate(DOB);
            }
            catch(Exception m) {
                System.out.println("Exception occured: "+m);
                continue;
            }
            st = new student(USN, Name, DOB);
            System.out.println("Student details:");
            st.showStudent();
        }
    }
}
