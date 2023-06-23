class SingletonObject {
    private static SingletonObject obj; // There should be only one instance of the object
    private SingletonObject() {} // Same as above, so make constructor private
    
    // This should be the only way to get an instance of SingletonObject
    public static SingletonObject getInstance() {
        if (obj == null) {
            obj = new SingletonObject();
        }
        
        return obj;
    }
    
    // This method will be used to verify that the address is same for all variables made
    public void hello()
    {
        System.out.println("Hello, my address is: " + this);
    }
} 

public class Main
{
	public static void main(String[] args) {
		SingletonObject o1 = SingletonObject.getInstance();
		SingletonObject o2 = SingletonObject.getInstance();
		
		o1.hello();
		o2.hello();
	}
}
