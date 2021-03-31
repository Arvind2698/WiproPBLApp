package employee;

public class DA{
    private String DAcode;
    private String designation;
    private int DAamount;
    public DA(String DAcode,String designation,int DAamount){
        this.DAamount=DAamount;
        this.DAcode=DAcode;
        this.designation=designation;
    }
    public String getDAcode(){
        return this.DAcode;
    }
    public String getDesignation(){
        return this.designation;
    }
    public int getDAamount(){
        return this.DAamount;
    }
}
