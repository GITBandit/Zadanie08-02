public class Furniture {

    private int amount;
    private String name;

    public Furniture(int amount, String name) {
        this.amount = amount;
        this.name = name;
    }

    public Furniture (){

    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Furniture))
            return false;
        Furniture other = (Furniture) obj;
        if (name == null){
            if(other.name != null)
                return false;
        } else if (!name.equals(other.name)){
            return false;
        }
        if (amount != other.amount)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "amount=" + amount +
                ", name='" + name + '\'' +
                '}';
    }
}
