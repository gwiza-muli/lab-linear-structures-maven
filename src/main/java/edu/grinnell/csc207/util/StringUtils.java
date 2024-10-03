package edu.grinnell.csc207.util;

import edu.grinnell.csc207.linear.Stack;
import edu.grinnell.csc207.linear.LinkedStack;

import java.io.PrintWriter;

/**
 * Assorted utilities for working with strings.
 * 
 * @author Samuel A. Rebelsky
 * @author Your Name Here
 */ 
public class StringUtils {
  // +------------------+--------------------------------------------
  // | Provided methods |
  // +------------------+
    
  /**
   * Determine whether the parens match in string.
   */
  public static boolean checkMatching(String str) {
    Stack<Character> parens = new LinkedStack<Character>();

    for (int i = 0; i < str.length(); i++){
      if (str.charAt(i) == ('(') || str.charAt(i) == ('[') ){
        try {
          parens.put(str.charAt(i));
        } catch (Exception e) {
          e.printStackTrace();
        }
      } else if (str.charAt(i) == (')') ){
          try {
            if (parens.get() == ('[')){
              return false;
            }
          } catch (Exception e) {
            e.printStackTrace();
          }
      } else if (str.charAt(i) == (']') ){
        try {
          if (parens.get() == ('(')){
            return false;
          }
        } catch (Exception e) {
          e.printStackTrace();
        }
    }

    }
    if (parens.isEmpty()){
      return true;
    }
    return false;      
  } // checkMatching

  

} // class StringUtils    

