import java.io.File;
public class UsaAccesoXMLSAX {
public static void main(String[] args) {
File f=new File("Libros (1).xml");
AccesoXMLSAX a =new AccesoXMLSAX();
a.parsearXMLconLibrosSAXhandler(f);
}
}
