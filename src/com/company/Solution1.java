package com.company;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int j=0;j<n;j++){
                arr[j]=sc.nextInt();
            }
            int ans=0;
            for(int j=0;j<n;j++){
                int sum=0;
                for(int k=j;k<n;k++){
                    sum += arr[k];
                    if(sum>=0){
                        ans += sum;
                    }
                    else {
                        break;
                    }
                }
            }
            System.out.println("Case #"+(i+1)+": "+ans);
        }
    }
}
