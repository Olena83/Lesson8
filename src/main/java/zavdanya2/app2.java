package zavdanya2;
import java.io.*;
import java.util.Scanner;

public class app2 {
    public static void main(String[] args) {
        try { int a, b, c;
        int D;
        System.out.println("Програма рoзвязує квадратне рівняння такого виду:");
        System.out.println("ax^2 + bx + c = 0");
        System.out.println("Введіть a, b і c:");

        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Корні рівняння: x1 = " + x1 + ", x2 = " + x2);
        }
        else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Рівняння має один корінь: x = " + x);
        }
        else {
            System.out.println("Рівняння не має коренів!");
        }}catch (Exception ex) {

            System.out.println(ex.getMessage());
    }
}}
