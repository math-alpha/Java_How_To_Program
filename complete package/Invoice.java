class Invoice{

    private String number;
    private String description;
    private int quantity;
    private double UnitPrice;
    
    public Invoice(){
      this.number = "No number to display";
      this.description = " No description available ";
      this.quantity = 0;
      this.UnitPrice = 0.0; 
    }
    
    public void setNumber (String number){
       this.number = number;
    }
    
    public void setDescription(String Description){
       this.description = description;
    }
    
    public void setQuantity(int quantity){
       this.quantity = quantity;
    }
    
    public void setUnitPrice(float UnitPrice){
       this.UnitPrice = UnitPrice;
    }
    
    public String getNumber(){
      return number;
    }
    
    public String getDescription(){
      return description;
    }
    
    public int getQuantity(){
      return quantity;
    }
    
    public double getUnitPrice(){
      return UnitPrice;
    }

    public double getInvoiceAmount(){
      return (getQuantity()*getUnitPrice());
    }
    
}
