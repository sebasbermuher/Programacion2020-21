package UNIDAD9.EntregableUNIDAD9.Transacciones;

public class ProductLine {
    private final String productLine;
    private final String textDecription;
    private final String htmlDescription;
    private final String image;


    public ProductLine(String productLine, String textDecription, String htmlDescription, String image) {
        this.productLine = productLine;
        this.textDecription = textDecription;
        this.htmlDescription = htmlDescription;
        this.image = image;

    }

    public String getProductLine() {
        return productLine;
    }

    public String getTextDecription() {
        return textDecription;
    }

    public String getHtmlDescription() {
        return htmlDescription;
    }

    public String getImage() {
        return image;
    }


}
