package calculator;

/**
 *
 * @author Samyu
 */
public enum Operators{
   PLUS("+"),
   MINUS("-"),
   MULTIPLY("*"),
   DIVIDE("/ "),
   MEMORYPLUS("M+"),
   SQRT("Sqrt"),
   INVERSE("1/x");
   
   
   

   private String value;
   private Operators(String value)
   {
      this.value = value;
   }

   public String toString()
   {
      return this.value; 
   }
}