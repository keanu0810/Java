package com.kh.SetEx;

import java.util.HashSet;

public class SetPre {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		//set.add »õ¿ì±ø °í·¡¹ä ²É°Ô¶û ¸Àµ¿»ê ¿ÀÂ¡¾î¶¥Äá ¾Ë»õ¿ìÄ¨ ²É°Ô¶û ²É°Ô¶û ²É°Ô¶û
		set.add("»õ¿ì±ø");
		set.add("°í·¡¹ä");
		set.add("²É°Ô¶û");
		set.add("¸Àµ¿»ê");
		set.add("¿ÀÂ¡¾î¶¥Äá");
		set.add("¾Ë»õ¿ìÄ¨");
		set.add("²É°Ô¶û");
		set.add("²É°Ô¶û");
		set.add("²É°Ô¶û");
		//System.out.println(set);
		System.out.println(set);
		
		//size() Å©±âÈ®ÀÎ
		System.out.println(set.size());
		
		//contains »ç¿ëÇØ¼­ ¸Àµ¿»êÀÌ Á¸Àç ÇÏ´ÂÁö È®ÀÎ
		set.contains("¸Àµ¿»ê");
		System.out.println("¸Àµ¿»êÀÌ ÀÖ½À´Ï±î? " + set.contains("¸Àµ¿»ê"));
		
		//set.reomve("°í·¡¹ä") Á¦°Å
		set.remove("°í·¡¹ä");
		
		//set.isEmpty() µ¥ÀÌÅÍ°¡ ¸ðµÎ Á¦°ÅµÇ¾ú´ÂÁö È®ÀÎ
		set.isEmpty();
		System.out.println(set);
		
	}
}
