public class Produit {
    private long id;
    private String nom;
    private String marque;
    private double prix;
    private String description;
    private int stock;

    public Produit(long id, String nom, String marque, double prix, String description, int stock) {
        this.id = id;
        this.nom = nom;
        this.marque = marque;
        this.prix = prix;
        this.description = description;
        this.stock = stock;
    }

    // Getters and Setters
    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getMarque() { return marque; }
    public void setMarque(String marque) { this.marque = marque; }

    public double getPrix() { return prix; }
    public void setPrix(double prix) { this.prix = prix; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    @Override
    public String toString() {
        return String.format(
                "ID: %d | Nom: %s | Marque: %s | Prix: %.2f | Stock: %d | Description: %s",
                id, nom, marque, prix, stock, description
        );
    }
}
