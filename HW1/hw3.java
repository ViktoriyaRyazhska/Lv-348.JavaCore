package com.edu;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class hw3 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

System.out.println("c1");
int c1 = Integer.parseInt(br.readLine());

System.out.println("c2");
int c2 = Integer.parseInt(br.readLine());

System.out.println("c3");
int c3 = Integer.parseInt(br.readLine());

System.out.println("t1");
int t1 = Integer.parseInt(br.readLine());

System.out.println("t2");
int t2 = Integer.parseInt(br.readLine());

System.out.println("t3");
int t3 = Integer.parseInt(br.readLine());



System.out.println("ct1=" + (c1*t1));  

System.out.println("ct2=" + (c2*t2));

System.out.println("ct3=" + (c3*t3));  

System.out.println("pl=" + ((c1*t1)+(c2*t2)+(c3*t3)));


  }
}