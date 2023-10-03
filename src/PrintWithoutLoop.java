public class PrintWithoutLoop {

    public static void main(String[] args) {

        String name = "Surendhar\n";
        String template = "0";
        template = template.replaceAll("0", "0000000000");
        template = template.replaceAll("0" , "0000000000");
        template = template.replaceAll("0" , name );
        System.out.println(template);

   }
}