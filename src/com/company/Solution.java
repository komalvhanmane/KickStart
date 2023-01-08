package com.company;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int m=sc.nextInt();
            int n=sc.nextInt();
            int id=sc.nextInt();
            int arr[][]=new int[m][n];
            int arr1[]=new int[n];
            for(int j=0;j<m;j++){
                for(int k=0;k<n;k++){
                    arr[j][k]=sc.nextInt();
                    arr1[k]=Math.max(arr1[k],arr[j][k]);
                }
            }

            int ans=0;
            for(int j=0;j<n;j++){
                if(arr[id-1][j]<arr1[j]){
                    ans += arr1[j]-arr[id-1][j];
                }
            }
            System.out.println("Case #"+(i+1)+": "+ans);
        }
    }
}
