package za.ac.cput;




public class productTest {

    @Test
    public void testSum() {
        System.out.println("sum");
        double number1 = 0.0;
        double number2 = 0.0;
        double expResult = 0.0;
        double result = Addittion.sum(number1, number2);

        assertEquals(expResult, result, 0.0);

    }
    @Test
    public void objectEquality(double number1,double number2){
        assertEquals(number1,number2) ;
    }
    @Test
    public void testIdentity(double number1,double number2){
        assertSame(number1,number2);
    }
    @Test
    public void TestFailling(){
        fail("failed");
    }

    @Test
    @Disabled()
    public void disablingTest(){

    }

    @Test
    public void timeOutExceededTest() {



    }
}
