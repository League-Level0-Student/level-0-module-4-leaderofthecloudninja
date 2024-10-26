package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class Test {
public static void main(String[] args) {
String answer = JOptionPane.showInputDialog("What score did you get on your test?", args);
int answerint = Integer.parseInt(answer);
JOptionPane.showMessageDialog(null,"You got a " + answer + "." + " yay");	
}
}