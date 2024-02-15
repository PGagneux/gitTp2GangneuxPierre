import org.junit.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
public class TestsPetitsCalculs{
    @Test
    public void testAddition() {
        assertEquals(2, 1 + 1);
    }
    @Test
    public void testMultiplication1() {
        assertEquals(72, 8 * 9);
    }
    @Test
    public void testMultiplication2() {
        assertEquals(1664, 32 * 52);
    }
    @Test
    public void testHexa() {
        assertEquals(256, 0x10 * 0x10);
    }

    @Test
    public void testLength(){
        assertEquals("abc".length(), 3);
    }
    
    public String inverseMot(String leMot){
        String inverse = "";
        for (int i=leMot.length()-1; i>=0; i -= 1){
            inverse = inverse + leMot.charAt(i); 
        }
        return inverse;
    }

    @Test
    public void testInverseMot(){
        assertNotEquals(inverseMot("abc"), "ab");
        assertEquals(inverseMot("abc"), "cba");
    }

    public boolean palindrome(String mot){
        String inverse = inverseMot(mot);
        return inverse.equals(mot);
    }

    @Test
    public void testPalindrome(){
        assertTrue(palindrome("aba"));
        assertFalse(palindrome("bbc"));
        assertTrue(palindrome("a"));
    }


}