
package lab6;

public class Student {
    String code=""; 
    String name=""; 
    int mark=0;

    public Student() {
    }
    public Student (String code, String name, int mark){
        this.code=code.toUpperCase();
        this.name=name.toUpperCase();
        this.mark= (mark>=0 && mark <=10)? mark: 0;
    }
    @Override
    public String toString() {
        return  code + ", " + name + ", " + mark ;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getMark() {
        return mark;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
    
}
