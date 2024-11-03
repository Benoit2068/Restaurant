import java.util.Scanner;

public class ConfigurationFactory {
    static AbstractFactory configureAbstractFactory() {
        AbstractFactory factory;
        System.out.println("chose your table type : pleasure, diet or vegan");
        Scanner sc = new Scanner(System.in);
        String tableType = sc.nextLine();

        if (tableType.equalsIgnoreCase("pleasure")) {
            factory = new PleasureFactory();
        } else if (tableType.equalsIgnoreCase("diet")) {
            factory= new DietFactory();
        } else if (tableType.equalsIgnoreCase("vegan")) {
            factory = new VeganFactory();
        } else {
            System.out.println("your choice doesn't exist");
            return configureAbstractFactory();
        }
        return factory;
    }
}
