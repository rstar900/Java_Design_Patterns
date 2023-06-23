class MonostateObject
{
    // Similar to Singleton but allows to create multiple objects, but share same state (data)
    private static int dataPoint = 0;
    public MonostateObject() {};
    
    // Getter and Setter
    int getDataPoint()
    {
        return dataPoint;
    }
    
    void setDataPoint(int x)
    {
        dataPoint = x;
    }
}

public class Main
{
	public static void main(String[] args) {
		
		MonostateObject o1 = new MonostateObject();
		MonostateObject o2 = new MonostateObject();
		
		o1.setDataPoint(10);
		
		// the value of dataPoint will be same for both objects
		System.out.println("o1 DataPoint: " + o1.getDataPoint());
		System.out.println("o2 DataPoint: " + o2.getDataPoint());
		
	}
}
