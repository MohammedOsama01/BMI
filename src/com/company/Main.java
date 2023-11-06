package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {
/*
write java program that reads width and height from user ( w & h must positive not zero )
BMI = w/h*h
 */

    public static void main(String[] args) {
        String height=JOptionPane.showInputDialog(null,"Write Your Height Here : ");
        double h=Double.parseDouble(height);

        String width=JOptionPane.showInputDialog(null,"Write Your Width Here : ");
        double w=Double.parseDouble(width);

        double bmi=w/(h*h);
/*
if (h>0 && w>0){
bmi=w/Math.pow(h,2)
if(bmi>16 etc
}
 */
        if (bmi > 0) {
            if (bmi < 16) {
                JOptionPane.showMessageDialog(null, "Serious underWeight");
            }
            else if (bmi >= 16 && bmi < 18) {
                JOptionPane.showMessageDialog(null, "UnderWeight");
            }
            else if (bmi >= 18 && bmi < 24) {
                JOptionPane.showMessageDialog(null, "Normal Weight");
            }
            else if (bmi >= 24 && bmi < 29) {
                JOptionPane.showMessageDialog(null, "Over Weight");
            }
            else if (bmi >= 29 && bmi < 35) {
                JOptionPane.showMessageDialog(null, "Serious OverWeight");
            }
            else
                JOptionPane.showMessageDialog(null, "Over Weight");
        }
        else
            JOptionPane.showMessageDialog(null, "Wrong in the enter weight or height ^_~");

    }
}


