class Invoice{

    private Stirng number;
    private String description;
    private int quatity;
    private double UnitPrice;
    
    public Invoice(){
      this.number = " No number to display";
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
       this.quantity = qauntity;
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
      return quatity;
    }
    
    public float getUnitPrice(){
      return UnitPrice
    }
    
    public float getInvoiceAmount(){
      return (getQuantity()*getUnitPrice());
    }
    
}
