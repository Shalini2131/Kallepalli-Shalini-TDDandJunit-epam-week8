/**
 * 
 */
package com.epam.TDDandJunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author shalu kallepalli
 *
 */
class RemoveCharAInFirstTwoPlacesTest {

	/**
	 * @throws java.lang.Exception
	 */
	/*  ----Testcases----
	 * 	1.'A' at 1st place in a string of size=1 --> "A"=>""
 		2.'A' at 1st two places in a string of size=2 --> "AA"=>"" 
	 *  3.'A' in an empty String -->""=>""
	 *  4.'A' at 1st place    --> "ABCD" => "BCD"
 		5.'A' at 1st and 2nd places -->"AACD" => "CD"
 		6.'A' at 2nd place --> "BACD" => "BCD"
 		7.'A' not at first 2 places -->"BBAA" => "BBAA"
 		8.'A' at 1st two places and also other places -->"AABBAA"=> "BBAA"
 		
 		
	 */
	RemoveCharAInFirstTwoPlaces removecharAinfirsttwoplaces;
	@BeforeEach
	void setUp() throws Exception {
		removecharAinfirsttwoplaces=new RemoveCharAInFirstTwoPlaces();
	}
	
	//Test 1
	@Test
	void testoneAatPosition1() {
		assertEquals(removecharAinfirsttwoplaces.removeAinFirst2Places("A"),"");
	}
	
	//Test 2
	@Test
	void testTwoAatFirstTwoPositions() {
		assertEquals(removecharAinfirsttwoplaces.removeAinFirst2Places("AA"),"");
	}
	
	//Test 3
	@Test
	void testifStringEmpty() {
		assertEquals(removecharAinfirsttwoplaces.removeAinFirst2Places(""),"");
	}
	
	//Test 4
	@Test
	void testAatPosition1() {
		assertEquals(removecharAinfirsttwoplaces.removeAinFirst2Places("ABCD"),"BCD");
	}
	
	//Test 5
	@Test
	void testAatPosition1and2() {
		assertEquals(removecharAinfirsttwoplaces.removeAinFirst2Places("AACD"),"CD");
	}
	
	//Test 6
	@Test
	void testAatPosition2() {
		assertEquals(removecharAinfirsttwoplaces.removeAinFirst2Places("BACD"),"BCD");
	}
	
	//Test 6
	@Test
	void testotherCharsAtPositions1and2() {
		assertEquals(removecharAinfirsttwoplaces.removeAinFirst2Places("BBAA"),"BBAA");
	}
	
	//Test 7
	@Test
	void testAinPositions1and2also() {
		assertEquals(removecharAinfirsttwoplaces.removeAinFirst2Places("AABBAA"),"BBAA");
	}
}
