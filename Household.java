import java.util.*;
import java.io.*;
public class Household {
    public static void main(String args[]){
        Info i1 = new Info();
        Info i2 = new Info();
        Info i3 = new Info();
        System.out.println("-----------------");
        i1.InputNum();
        i1.InputInfo();
        System.out.println("-----------------");
        i1.ShowInfo();
        
        System.out.println("-----------------");
        i2.InputNum();
        i2.InputInfo();
        System.out.println("-----------------");
        i2.ShowInfo();
        
        System.out.println("-----------------");
        i3.InputNum();
        i3.InputInfo();
        System.out.println("-----------------");
        i3.ShowInfo();
        
    }
}
class Info{
    public double nf;
    public String f, fn, ln, s;
    public String nametitle,firstname, lastname, gender;
    public int age; 

    Scanner scanner = new Scanner(System.in);
    void InputNum(){ 
        System.out.print("Input number: ");
        String n = scanner.next();
        int num = Integer.parseInt(n);
        System.out.println("Family: " + num);
        System.out.println("-----------------");
        nf = num;
    }
    
    void InputInfo(){
        for (int i = 1; i <= nf; i++){
            System.out.print("Mr./Mrs./Miss/Master: ");
            String f = scanner.next();
            nametitle = f;
            
            if(f.equalsIgnoreCase("Mr.")){
                gender = "Male";
            }
            else if(f.equalsIgnoreCase("Master")){
                gender = "Male";
            }
            else if(f.equalsIgnoreCase("Mrs.")){
                gender = "FeMale";
            }
            else if(f.equalsIgnoreCase("Miss")){
                gender = "FeMale";
            }
            else{
                System.out.println("Cannot be identified.");
            }
            
            System.out.print("Firstname: ");
            String fn = scanner.next();
            firstname = fn;

            System.out.print("Lastname: ");
            String ln = scanner.next();
            lastname = ln;
            
            System.out.print("Birthday - Day: ");         
            String d = scanner.next();
            System.out.print("Birthday - Month: ");         
            String m = scanner.next();
            System.out.print("Birthday - Year(25xx): ");         
            String y = scanner.next();        
            try{                  
                int num = Integer.parseInt(y);          
                age = 2566 - num;                
            }         
            catch (NumberFormatException ee){            
                System.out.println("Incorrect input String format.");         
            } 

            s += "\n" + nametitle + " " + firstname + " " + lastname + " " +  gender + " age: "+ age;
        }
    } 
     
    void ShowInfo(){
        System.out.println(s);
    }
     
}
