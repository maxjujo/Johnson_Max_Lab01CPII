//String name
//String description
//String ID // should never change
//double cost
public class Product {
    private String proRec;
    private String name;

    private String desc;
    private String ID;
    private double cost;

    public Product (String ID, String name, String desc, double cost) {
        this.ID = ID;
        this.name = name;
        this.desc = desc;
        this.cost = cost;

    }


    public double getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getNameAndDesc()
    {
        return this.name +" , " +this.desc;
    }
    public String toProRecord()
    {
        return this.ID + ", "+this.name+ ", " +this.desc +" ," +this.cost;
    }

}

