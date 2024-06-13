package ExceptionHandling;

import java.io.FileInputStream;
import java.util.Scanner;

// need of clossing the sc and file object

// public class TryWithRes {
//     static Scanner sc;
//     public static void devide() throws Exception{
//         FileInputStream f1 = new FileInputStream("C:\\programming\\java\\Alpha\\ExceptionHandling\\inp.txt");
//         sc = new Scanner(f1);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         System.out.println(a/b); if there will be / by zero exception then close will not work it will remains open so we have to handle it
//         f1.close();
        // sc.close();  
//     }
//     public static void main(String[] args) throws Exception{
//         devide();
//         System.out.println(sc.nextInt());
//     }
// }

// Solve using finally block

// public class TryWithRes {
//     static Scanner sc;
//     public static void devide() throws Exception{
//         FileInputStream f1 = new FileInputStream("C:\\programming\\java\\Alpha\\ExceptionHandling\\inp.txt");
//         try{
//             sc = new Scanner(f1);
//             int a = sc.nextInt();
//             int b = sc.nextInt();
//             System.out.println(a/b);
//         }finally{
//             f1.close();
//             sc.close();
//         }
//     }
//     public static void main(String[] args) throws Exception{
//         devide();
//         System.out.println(sc.nextInt());
//     }
// }

// we can also with ty with resources so that we don't have to use finally block in our program

public class TryWithRes {

    public static void devide() throws Exception{
        

        try(FileInputStream f1 = new FileInputStream("C:\\programming\\java\\Alpha\\ExceptionHandling\\inp.txt"); Scanner sc = new Scanner(f1)){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a/b);
        }
    }
    public static void main(String[] args) throws Exception{
        devide();
    }
}