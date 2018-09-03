package com.edu;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class hw2 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

System.out.println("r");
int r = Integer.parseInt(br.readLine());

double p;p=3.14;

System.out.println("pr=" + (2*r*p));  
System.out.println("pl=" + (p*(r^2)));



  }
}
