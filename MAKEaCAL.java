23
import java.util.Scanner ;
public class MAKEaCAL {
   public static void main (String args[]){
       Scanner sc=new Scanner (System.in);
         int n1,n2,opration,isAns;
        System.out.print ("Enter a first number : = ");
        n1=sc.nextInt();
        System.out.print ("Enter a second number : = ");
        n2=sc.nextInt();
         System.out.print ("Enter a any opratin : = ");
        opration=sc.nextInt();
        if(opration == 1){
              isAns =n1+n2;
        System.out.print("ADDITION IS : = " + isAns);
       }else if(opration ==2){
           isAns =n1-n2;
        System.out.print("SUBTRACTION IS : = " + isAns);
       }else if( opration ==3){
           isAns =n1*n2;
        System.out.print("MULTIPLAY IS : = " + isAns);
       }else if (opration ==4){
          isAns =n1/n2;
        System.out.print("DIVISION IS : = " + isAns);
       }else if(opration==5){
       isAns =n1%n2;
        System.out.print("REMINDER IS : = " + isAns);
       }else {
         System.out.print("PLEASE CHOSE A VALID NUM AND OPRATION ");
       }
    }
  }
