public class Main  {
    public static void main(String[] args) {
       // System.out.println("Hello world!");//
        Biocarrots biocarrots = new Biocarrots();
        biocarrots.setName("Jirka Uhl");
        System.out.println(biocarrots.getName());
        biocarrots.setAddress("Svobody 5, Praha");
        System.out.println(biocarrots.getAddress());
        //2.prodejce mrkve
        biocarrots.setName("Jana Nová");
        System.out.println(biocarrots.getName());
        biocarrots.setAddress("Nerudova 10, Praha");
        System.out.println(biocarrots.getAddress());
    }
}