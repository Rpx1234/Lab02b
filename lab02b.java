//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Lab  -


import java.io.*;
import java.util.*;
import java.math.*;
import java.lang.*;
import java.text.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.util.Collections.*;
import static java.util.Arrays.*;
import static java.lang.Double.*;
import static java.lang.Character.*;
import static java.lang.Math.*;

public class lab02b
{
 public void run()
 {
  Scanner keyboard = new Scanner(in);
  double fahrenheit;
  double celsius;
  System.out.println("Enter Fahrenheit value ::");
  fahrenheit = keyboard.nextDouble();
  celsius = ((fahrenheit - 32) * 5/9);
  out.printf("%.2f degrees Fahrenheit",fahrenheit);
  out.println();
  out.printf("%.2f degrees Celsius", celsius);
 }

 public static void main(String[] args)
 {
  lab02b test = new lab02b();
  test.run();
 }
}