/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classe;

/**
 *
 * @author alefr
 */
public class Palindromo {
    
    public boolean palindromo(String s1) {

		String s2 = new StringBuffer(s1).reverse().toString();
		
		if (s1.equals(s2)) {
			return true;
		} else {
			return false;
		}
	}
    
}
