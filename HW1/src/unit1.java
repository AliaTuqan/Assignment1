import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
//e
class unit1 { 

	@Test
	public void test () throws Exception {
		
		shopping cart1=new shopping();
		assertTrue(cart1.getcount()==0);
	}
@Test
public void test2() throws Exception{
	shopping cart2=new shopping();
	cart2.add("Java Book",127);
	assertTrue(cart2.count==1);
	assertTrue(cart2.price==127);
}
@Test
public void test3() throws Exception{
	shopping cart3=new shopping();
	cart3.add("Java Book",127);
	cart3.add("Web Design Book",100);
	assertTrue(cart3.count==2);
	assertTrue(cart3.price==227);
}
}
