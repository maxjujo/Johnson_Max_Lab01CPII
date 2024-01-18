import java.util.Calendar;
import java.util.GregorianCalendar;
public class Person {
    private String ID;
    private String firstName;
    private String lastName;
    private String title;
    private int YOB;

    public Person (String ID, String firstName, String lastName, String title, int YOB) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.YOB = YOB;
    }
        public String getID() {
            return ID;
        }
        public void setID (String ID){
            this.ID = ID;
        }
    public void setfirstName (String firstName){
        this.firstName = firstName;
    }
    public void setlastName (String lastName){
        this.lastName = lastName;
    }
    public void settitile (String title){
        this.title = title;
    }
    public void setYOB (int YOB){
        this.YOB = YOB;
    }
        public String getfirstName () {
            return firstName;
        }
        public String getlastName () {
            return lastName;
        }
        public String gettitle () {
            return title;
        }
        public int getYOB () {
            return YOB;
        }

        public String getFullName()
        {
            return this.firstName +" " +this.lastName;
        }

        public String getFormalName()
        {
            return this.title+ " " +this.firstName +" " +this.lastName;
        }

        public int getAge()
        {
           return 2024 - YOB;

        }
    public static String getAge(int yearOfBirth) {

        Calendar currentCalendar = new GregorianCalendar();
        int currentYear = currentCalendar.get(Calendar.YEAR);
        int age = currentYear - yearOfBirth;
        return "Age for year " + currentYear + ": " + age + " years";
    }

    public String toCSVDataRecord()
    {
        return this.ID + ", "+this.title+ " " +this.firstName +" " +this.lastName +", "+this.YOB;
    }
}
