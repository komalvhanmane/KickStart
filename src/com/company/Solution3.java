package com.company;

import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char arr[][]=new char[100][100];	//will store char array of O's and I's
        int N, upperHalf_I=0, lowerHalf_I=0, leftHalf_I=0, rightHalf_I=0;
        String column[]=new String[100];
        char a[][]=new char[100][100];

        String temp;

        int T=sc.nextInt();					// Asking for num of text cases
        int[] ans=new int[T];
        for(int i=0; i<T; i++) {

            //accepting vals
            N=sc.nextInt();				// accept num of N
            sc.nextLine();
            for(int c=0; c<2*N; c++){	//take input
                column[c]=sc.nextLine();
                temp=column[c];
                for (int r=0; r<2*N; r++) {
                    a[c][r]=temp.charAt(r);


                }
            }


            //counting I

            upperHalf_I=0;lowerHalf_I=0;leftHalf_I=0;rightHalf_I=0; // initialize to 0
            arr=a;
            for(int c=0; c<N; c++){		//upperHalf
                for (int r=0; r<2*N; r++) {
                    if(a[c][r]=='I' || a[c][r]=='i') {
                        upperHalf_I++;
                    }
                }
            }

            for(int c=N; c<2*N; c++){		//lowerHalf
                for (int r=0; r<2*N; r++) {
                    if(a[c][r]=='I' || a[c][r]=='i') {
                        lowerHalf_I++;
                    }
                }
            }

            for(int c=0; c<2*N; c++){		//leftHalf
                for (int r=0; r<N; r++) {
                    if(a[c][r]=='I' || a[c][r]=='i') {
                        leftHalf_I++;
                    }
                }
            }

            for(int c=0; c<2*N; c++){		//rightHalf
                for (int r=N; r<2*N; r++) {
                    if(a[c][r]=='I' || a[c][r]=='i') {
                        rightHalf_I++;
                    }
                }
            }

            //calculating answer
            ans[i]=0;
            if(upperHalf_I - lowerHalf_I >0) {
                ans[i]= ans[i]+ upperHalf_I - lowerHalf_I ;
            }else if(upperHalf_I - lowerHalf_I <0){
                ans[i]= ans[i] - upperHalf_I + lowerHalf_I ;
            }

            if(leftHalf_I - rightHalf_I >0 ) {
                ans[i] = ans[i] *( leftHalf_I - rightHalf_I );
            }else if(leftHalf_I - rightHalf_I <0) {
                ans[i] = ans[i] * (rightHalf_I - leftHalf_I );

            }
        }

        for(int i=0; i<T; i++) {
            System.out.println("Case #"+(i+1)+":"+ans[i]);				//displaying answers
        }

    }

}
/*
3
2
iioo
oooi
iiii
oooi
1
io
oo
2
oioi
ioio
oioi
ioio

3
2
IIOO
OOOI
IIII
OOOI
1
IO
OO
2
OIOI
IOIO
OIOI
IOIO
 */