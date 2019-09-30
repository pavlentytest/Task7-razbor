package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0;i<n;i++) {
            a[i] = scan.nextInt();
        }
        int c = 0, d = 0;
        for(int i=0; i< n; i++) {
            if(a[i]<0) {
                b[c] = a[i];
                c++;
            }
        }
        for(int i=0; i< n; i++) {
            if(a[d]>=0) {
                b[c] = a[d];
                c++;
            }
            d++;
        }
        for(int i = 0; i< n;i++) {
            System.out.print(b[i] + " ");
        }

    }
}
