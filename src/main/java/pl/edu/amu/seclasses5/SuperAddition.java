/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.amu.seclasses5;

/**
 * @author jsiwek
 */
public class SuperAddition {

    public static String superaddition(String a, String b) {
        if (a.equals("312") && b.equals("2")) {
            return "3122";
        }
        else if (a.equals("7")&&(b.equals("7"))){
            return "49";
        }
        else if(a.equals("9")&&(b.equals("9"))) {
            return "81";
        } else if (a.equals("V") && b.equals("IV")) {
            return "IX";
        } else if (a.equals("3") && b.equals("b")) {
            return "3b";
        } else if (a.equals("4") && b.equals("2")) {
            return "16";
        } else if (a.equals("6") && b.equals("2")) {
            return "36";
        } else if (a.equals("4") && b.equals("4")) {
            return "Hamilton";
        } else if (a.equals("3") && b.equals("3")) {
            return "Verstappen";
        }else if (a.equals("2") && b.equals("6")) {
                return "Eight";
        } else if (a.equals("3") && b.equals("6")) {
                return "Nine";
        } else if (isNumeric.isNumeric(a) && isNumeric.isNumeric(b)) {
            return Integer.toString(Integer.parseInt(a) + Integer.parseInt(b));
        }
         else {

            return a + b;
        }
    }
}


class isNumeric {
    public static boolean isNumeric(String str) {

        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c) && c != 45) return false;
        }
        return true;
    }
}
