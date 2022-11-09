package Trabalho2;

public class Sabor {
    
    private String Sabor;
    private Integer ID;

    public Sabor(String sabor, Integer id) {
        Sabor = sabor;
        ID = id;
    }

    public String getSabor() {
        return Sabor;
    }

    public Integer getID() {
        return ID;
    }

    public void setSabor(String sabor) {
        Sabor = sabor;
    }

    public void setID(Integer iD) {
        ID = iD;
    }

    @Override
    public String toString() {
        return "Sabor"+ Sabor +"\nID = " + ID ;
    }
    
}
