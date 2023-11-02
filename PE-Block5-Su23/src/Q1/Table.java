
package Q1;

public class Table {
    private String name;
    private int leg;

    public Table() {
    }

    public Table(String name, int leg) {
        this.name = name;
        this.leg = leg;
    }

    public String getName() {
        String s= name.substring(name.length()-3);
        String a = String.valueOf(s.charAt(2));
        String toLowerCase;
        toLowerCase = a.toLowerCase();
        return String.valueOf(s.charAt(1))+a+String.valueOf(s.charAt(3)) ;
    }

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }
    
    
}
