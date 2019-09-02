/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;

import org.junit.Assert;
import org.junit.Test;
import Classe.Palindromo;
/**
 *
 * @author alefr
 */
public class TestePalindromo {
    
    Palindromo poli = new Palindromo();

	@Test
	public void palindromo() {

		boolean resultado = poli.palindromo("ana");

		Assert.assertEquals(true, resultado);
	}
    
}
