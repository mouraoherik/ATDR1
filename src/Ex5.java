public class Ex5 {
    static void main() {
        String type = "Content-Type: text/html";
        String header = "\n" +
                "<html>\n" +
                "<head><title>Saudação CGI</title></head>\n" +
                "<body>\n" +
                "<h1>Olá, Terráqueos!</h1>\n" +
                "</body>\n" +
                "</html>";

        System.out.println(type);
        System.out.println(header);
    }
}
