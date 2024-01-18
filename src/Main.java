public class Main {
    public static void main(String[] args)
    {
     Person tom = new Person("000001", "Tom", "Wulf", "Prof.", 1960);
        Person bilbo = new Person("000002", "Bilbo", "Baggins", "Esq.", 1200);
        System.out.println("Person test:");
        System.out.println(tom.getID());
        System.out.println(tom.getFullName());
        System.out.println(tom.getFormalName());

        bilbo.setYOB(1600);
        System.out.println(bilbo.getYOB());
        System.out.println(tom.toCSVDataRecord());
        System.out.println(tom.getAge());
        System.out.println(bilbo.getAge());
        System.out.println("Product Test:");
        Product lembas = new Product("000002", "Lembas", "Elven Wayfare Bread", 200.0);
        Product pipeweed = new Product("000001", "Pipeweed", "Long Bottom Leaf", 600.0 );
        System.out.println(lembas.getName());
        System.out.println(lembas.getCost());
        System.out.println(pipeweed.getNameAndDesc());
        System.out.println(pipeweed.toProRecord());

    }
}