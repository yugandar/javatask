//We can make constructor as private. So that We can not create an object outside of the class.
//This property is useful to create singleton class in java.
//Singleton pattern helps us to keep only one instance of a class at any time.
//The purpose of singleton is to cprivate static singleton myObj;
private static MySingleTon myObj;
    /**
     * Create private constructor
     */
    private MySingleTon(){

    }
    /**
     * Create a static method to get instance.
     */
    public static MySingleTon getInstance(){
        if(myObj == null){
            myObj = new MySingleTon();
        }
        return myObj;
    }

    public void getSomeThing(){
        // do something here
        System.out.println("I am here....");
    }

    public static void main(String a[]){
        MySingleTon st = MySingleTon.getInstance();
        st.getSomeThing();
    }
