
package slot.pkg10;

public class AntiqueShop {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int choice = 0;
            do {
                System.out.println("1. add a new vase");
                System.out.println("2. add a new statue");
                System.out.println("3. add a new painting");
                System.out.println("4. display all items");
                System.out.println("5. find the items by the creator ");
                System.out.println("6. update the item by its index");
                System.out.println("7. remove the item by its index");
                System.out.println("8. display the list of vase items ");
                System.out.println("9. sorts items in ascending order based on their values ");
                System.out.println("10. exit");
                System.out.println("input your choice:");
                choice = sc.nextInt();
                switch (choice) {
}
