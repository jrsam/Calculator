package calculator;

/**
 *
 * @author Samyu
 */
public enum Type {
    ORDINARY("Ordinary"),SCIENTIFIC("Scientific");
    private String value;
   private Type(String value)
   {
      this.value = value;
   }

    @Override
    public String toString() {
        return this.value; //To change body of generated methods, choose Tools | Templates.
    }
   
}
