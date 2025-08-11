import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MetierProduitImpl metier = new MetierProduitImpl();

        boolean exit = false;
        while (!exit) {
            System.out.println("\n=== Menu Gestion Produits ===");
            System.out.println("1. Afficher la liste des produits");
            System.out.println("2. Rechercher un produit par ID");
            System.out.println("3. Ajouter un produit");
            System.out.println("4. Supprimer un produit");
            System.out.println("5. Quitter");
            System.out.print("Choix > ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    if (metier.getAll().isEmpty()) {
                        System.out.println("Aucun produit disponible.");
                    } else {
                        metier.getAll().forEach(System.out::println);
                    }
                    break;

                case 2:
                    System.out.print("ID du produit à rechercher : ");
                    long idSearch = Long.parseLong(scanner.nextLine());
                    Produit found = metier.findById(idSearch);
                    if (found != null) {
                        System.out.println(found);
                    } else {
                        System.out.println("Produit introuvable.");
                    }
                    break;

                case 3:
                    System.out.print("ID : ");
                    long id = Long.parseLong(scanner.nextLine());
                    System.out.print("Nom : ");
                    String nom = scanner.nextLine();
                    System.out.print("Marque : ");
                    String marque = scanner.nextLine();
                    System.out.print("Prix : ");
                    double prix = Double.parseDouble(scanner.nextLine());
                    System.out.print("Description : ");
                    String description = scanner.nextLine();
                    System.out.print("Stock : ");
                    int stock = Integer.parseInt(scanner.nextLine());

                    metier.add(new Produit(id, nom, marque, prix, description, stock));
                    System.out.println("Produit ajouté avec succès.");
                    break;

                case 4:
                    System.out.print("ID du produit à supprimer : ");
                    long idDel = Long.parseLong(scanner.nextLine());
                    metier.delete(idDel);
                    System.out.println("Produit supprimé.");
                    break;

                case 5:
                    exit = true;
                    System.out.println("Au revoir !");
                    break;

                default:
                    System.out.println("Choix invalide.");
            }
        }

        scanner.close();
    }
}
