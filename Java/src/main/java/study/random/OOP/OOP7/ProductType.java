package study.random.OOP.OOP7;

public enum ProductType {
    ELECTRONIC("ABCD"),
    ORGANIC("DABC") {
        @Override
        public void showProductType() {
            super.showProductType();
            System.out.println("Attention: ORGANIC PRODUCT");
        }
    };

    public final String PRODUCT_TYPE_CODE;

    ProductType(String productTypeCode) {
        this.PRODUCT_TYPE_CODE = productTypeCode;
    }

    public void showProductType() {
        System.out.println("Product type: " + this.PRODUCT_TYPE_CODE);
    }
}
