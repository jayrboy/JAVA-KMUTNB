package Class2;

public class BloodPressure {
    
    private int systolic;
    private int diastolic;
    private String name; 
    
    public BloodPressure(String name,int s, int d) {
        this.systolic = s;
        this.diastolic = d;
        this.name = name;
    } 
    public boolean isHigh() { return systolic > 140 && diastolic > 90; }    // (140/90)
    // 100 <= systolic <= 200
    // 50 <= diastolic <= 90
    
    @Override
    public String toString() {
        return name + "-->"+ "(" + systolic + "/" + diastolic + ")";
    }
    public String getName() { return name; }
    public int getSystolic() { return this.systolic; }
    public int getDiastolic() { return this.diastolic; }
    public void updateSystolic(int s) { this.systolic += s; }
    public void updateDiastolic(int s) { this.diastolic += s; }
    
    
}
