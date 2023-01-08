package com.company;

import java.util.LinkedList;
import java.util.Scanner;
class Pair{
    int x;
    int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Solution2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int Ra=sc.nextInt();
            int Rh=sc.nextInt();
            LinkedList<Double> lst=new LinkedList<>();
            LinkedList<Double> lst1=new LinkedList<>();
            int n=sc.nextInt();
            double max1=Integer.MAX_VALUE;
            double max2=Integer.MAX_VALUE;
            Pair []p=new Pair[n];
            for(int i1=0;i1<n;i1++){
                p[i1]=new Pair(sc.nextInt(),sc.nextInt());
                double distance=Math.sqrt(Math.pow(p[i1].x,2)+Math.pow(p[i1].y,2));
                if(distance<=Ra+Rh){
                    lst.add(distance);
                    max1 = Math.min(max1,distance);
                }
            }

            int m=sc.nextInt();
            Pair []p1=new Pair[m];
            for(int i1=0;i1<m;i1++){
                p1[i1]=new Pair(sc.nextInt(),sc.nextInt());
                double distance=Math.sqrt(Math.pow(p1[i1].x,2)+Math.pow(p1[i1].y,2));
                if(distance<=Ra+Rh){
                    lst1.add(distance);
                    max2 = Math.min(max2,distance);
                }
            }

            int scoreA=0;
            int scoreB=0;
//            System.out.println(lst);

            for(int j=0;j<lst.size();j++){
//                System.out.println(lst.get(j)+" "+max2);
                if(lst.get(j)<max2){
                    scoreA++;
                }
            }
//            System.out.println(lst1);
            for(int j=0;j<lst1.size();j++){
//                System.out.println(lst1.get(j)+" "+max1);
                if(lst1.get(j)<max1){
                    scoreB++;
                }
            }
            System.out.println("Case #"+(i+1)+": "+scoreA+" "+scoreB);
//            System.out.println(scoreA+" "+scoreB);
        }
    }
}
