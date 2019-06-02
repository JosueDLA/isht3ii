package gt.edu.umg.ingenieria.sistemas.isht3ii;

public class main {

    public static void main(String[] args) {
        // TODO code application logic here
        
        String input0 = "1234567";
        String input1 = "No on";
        String input2 = "yo dono onod oy";
        String input3 = "amor roma";
        String input4 = "AMOR ROMA";
        String input5 = "reconocer";
        String input6 = "yovoy";
        String input7 = "somos";
        String input8 = "arañara";
        String input9 = "55555";
         
        System.out.println("Probando: " + input0 + " - Resultado: " + evaluate(input0));
        System.out.println("Probando: " + "null" + " - Resultado: " + evaluate(input1));
        System.out.println("Probando: " + input2 + " - Resultado: " + evaluate(input2));
        System.out.println("Probando: " + input3 + " - Resultado: " + evaluate(input3));
        System.out.println("Probando: " + input4 + " - Resultado: " + evaluate(input4));
        System.out.println("Probando: " + input5 + " - Resultado: " + evaluate(input5));
        System.out.println("Probando: " + input6 + " - Resultado: " + evaluate(input6));
        System.out.println("Probando: " + input7 + " - Resultado: " + evaluate(input7));
        System.out.println("Probando: " + input8 + " - Resultado: " + evaluate(input8));
        System.out.println("Probando: " + input9 + " - Resultado: " + evaluate(input9));
        
    }
    
    public static boolean evaluate(String word) {
        if (word == null) {
          throw new IllegalArgumentException("You can't pass a null String as input.");
        }
        
        boolean result = true;
        int length = word.length();
        
        for (int i = 0; i < length / 2; i++) {
          if (word.charAt(i) != word.charAt(length - 1 - i)) {
            result = false;
            break;
          }
        }
        return result;
    }
    
}
