package com.epam.TDDandJunit;

class RemoveCharAInFirstTwoPlaces{
	public String removeAinFirst2Places(String s) {
		String res="";
		if (s.length()==1 && s.charAt(0)=='A')
			res="";
		//if string length is 2 for ex:AA-->none,AB-->B,BA-->B,BB-->BB
		else if(s.length()==2) {
			if(s.charAt(0)=='A' && s.charAt(1)=='A')
				res="";
			else if(s.charAt(0)=='A' && s.charAt(1)!='A')
				res=""+s.substring(1);
			else if(s.charAt(0)!='A' && s.charAt(1)=='A')
				res=""+s.substring(0);
			else
				res=s.substring(0);
		}
		//if string length is greater than 2 for ex:AABB-->BB,BABB-->BBB,ABAA-->BAA etc
		else if(s.length()>2)
		{
			if(s.charAt(0)=='A' && s.charAt(1)=='A')
				res=s.substring(2);
			else if(s.charAt(0)!='A' && s.charAt(1)=='A')
				res=""+s.charAt(0)+s.substring(2);
			else if(s.charAt(0)=='A' && s.charAt(1)!='A')
				res=""+s.substring(1);
			else
				res=s;
		}
		return res;
	}
}