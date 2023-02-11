package aulasdescomplica;

public class StringBufferAndBuilder  {
    public static void main(String[] args) {
        String nome = "Patricio";
        String sobrenome = "Rios";
        
        System.out.println(nome.substring(1,5));
        
        System.out.println(nome.concat(" " + sobrenome));
        
        StringBuffer buffer = new StringBuffer();

        buffer.append(nome);
        buffer.append(sobrenome);

        System.out.println(buffer.toString()); // thread-safe
        
        StringBuilder builder = new StringBuilder();
        
        builder.append(nome);
        builder.append(sobrenome);
        System.out.println(builder.toString());
    }
}
