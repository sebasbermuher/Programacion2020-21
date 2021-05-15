package UNIDAD9.EntregableUNIDAD9.Transacciones;

public class Products {
    private final String productCode;
    private final String productName;
    private final String productLine;
    private final String productScale;
    private final String productVendor;
    private final String productDescription;
    private final String quantityInStock;
    private final String buyPrice;
    private final String MSRP;


    public Products(String productCode, String productName, String productLine, String productScale, String productVendor, String productDescription, String quantityInStock, String buyPrice, String MSRP) {
        this.productCode=productCode;
        this.productName = productName;
        this.productLine = productLine;
        this.productScale = productScale;
        this.productVendor = productVendor;
        this.productDescription = productDescription;
        this.quantityInStock = quantityInStock;
        this.buyPrice = buyPrice;
        this.MSRP = MSRP;
    }

    public String getProductCode() {
        return productCode;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductLine() {
        return productLine;
    }

    public String getProductScale() {
        return productScale;
    }

    public String getProductVendor() {
        return productVendor;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public String getQuantityInStock() {
        return quantityInStock;
    }

    public String getBuyPrice() {
        return buyPrice;
    }

    public String getMSRP() {
        return MSRP;
    }

}
