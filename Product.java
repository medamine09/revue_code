@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nom;
    private float price;
    private String barcode;
    @Nullable private String state;

    // tous les getters and setters sont implémentés
}