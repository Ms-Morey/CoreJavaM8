//19 june 24 WAJP to count digits in a  (5 digit)number
import  java.util.Scanner;
class CountOfDigits 
{ 
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a 5 digit number : "); //123
    int num = sc.nextInt();
    int dup = num;
    int count =0 ;

    if(num >0){
        count +=1;
        num/=10;
    }
    if(num >0){
        count +=1;
        num/=10;
    }
    if(num >0){
        count +=1;
        num/=10;
    }
    if(num >0){
        count +=1;
        num/=10;
    }
    if(num >0){
        count +=1;
        num/=10;
    }
        System.out.println("Count of numbers of "+ dup +" is "+count);
            
        
}
}
