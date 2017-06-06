public class employee {

    private int id;
    private String address;
    private String city;
    private String state;
    public static void main(String...args){

    }
    public int getId() {
        return id;
    }

    public String getaddress() {
        return address;
    }

     public String getcity() {
        return city;
    }

      public String getstate() {
        return state;
    }

    public employee(int id, String address, String city, String state) {
        this.id = id;
        this.address = address;
        this.city = city;
        this.state = state;
    }

    @Override
    //this is overriden to print the user friendly information about the Employee
    public String toString() {
        return "[id=" + this.id + ", address=" + this.address + ", city=" + this.city + ", state=" +
                this.state+ "]";
    }

}
