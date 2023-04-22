import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*conditional statements*/
        /*biggest of two numbers*/
        System.out.println("Enter numbers:");
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        System.out.println("biggest of two numbers");
        if(number1>number2)
        {
            System.out.println(number1);
        }
        else {
            System.out.println(number2);
        }
        /*Days of the week*/
        System.out.println("Days of week");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
        /*loop statements*/
        /*print odd numbers upto 100*/
        System.out.println("odd numbers");
        for(int i=1;i<=100;i++)
        {
            if(i%2!=0)
            {
                System.out.println(i);
            }
        }
        int j=1;
        while(j<=100)
        {
            if(j%2!=0)
            {
                System.out.println(j);
            }
            j++;
        }
        int k=1;
        do{
            if(k%2!=0)
            {
                System.out.println(k);
            }
            k++;
        }while(k<=100);
        System.out.println("for each loop");
        int arr1[]={2,4,5,7,8};
        for(int num:arr1)
        {
            System.out.println(num+2);
        }
        /*jump statements*/
        System.out.println("jump statements");
        System.out.println("Enter size");
        int a=sc.nextInt();
        int[] arr=new int[100];
        for(int i=0;i<=a;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<=a;i++)
        {
            if(arr[i]==5)
            {
                continue;
            }
            if(arr[i]%2==0) {
                System.out.println(arr[i]);
            }
            else {
                break;
            }
        }

    }
}