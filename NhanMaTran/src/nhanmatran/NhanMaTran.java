/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhanmatran;

import java.util.Scanner;

public class NhanMaTran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row1, row2;
        int col1, col2;
        int a[][], b[][];
        System.out.print("Enter number of rows for matrix 1: ");
        row1=sc.nextInt();
        System.out.print("Enter number of cols for matrix 1: ");
        col1=sc.nextInt();
        a=new int[row1][col1];
         for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                System.out.print("\nm["+i+"]["+j+"]=");
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix inputted:");
        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){    
                System.out.format("%3d",a[i][j]);
            }
            System.out.println("\n");
        }
        System.out.print("Enter number of rows for matrix 2: ");
        row2=sc.nextInt();
        System.out.print("Enter number of cols for matrix 2: ");
        col2=sc.nextInt();
        a=new int[row2][col2];
        
    }
    
}
