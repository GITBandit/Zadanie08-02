import java.util.Scanner;

public class FurnitureShop {

    public static void main(String[] args) {

        Furniture[] furnitures = new Furniture[3];

        Scanner scanner = new Scanner(System.in);


        for (int i=0; i<furnitures.length; ){
            Furniture fur = new Furniture();

            System.out.println("Podaj nazwę mebla ");
            fur.setName(scanner.nextLine());
            System.out.println("Podaj ilość mebli tego typu");
            fur.setAmount(scanner.nextInt());
            scanner.nextLine();
            boolean isDuplicated = false;
            for (Furniture x: furnitures) {
                if (fur.equals(x)) {
                    System.out.println("Taki obiekt już istnieje");
                    isDuplicated = true;
                }
            }
            if (!isDuplicated){
                furnitures[i] = fur;
                i++;
            }
        }
        System.out.println("Tablica pełna!");

        for (Furniture z : furnitures)
              {
                  System.out.println(z.toString());
        }

    }
}
