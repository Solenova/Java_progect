package Laptop;

//import java.util.Objects;

public class Laptop {
    String company; 
    String diagonal;
    String ram;
    String processor;
    String hd;
    
        
    @Override
    public String toString() {
      return "(" + company+ ", "+ diagonal +"''"+ ", " + processor+", " + hd+ "ГБ"+", " + ram+"ГБ"+")";
    }

    // @Override
    // public boolean equals(Object obj) {
    //     if (obj instanceof Laptop) {
    //         Laptop anotherLaptop=(Laptop) obj;
    //         return company.equals(anotherLaptop.company);
    //     }
    //     return false;
    // }

    // @Override
    // public int hashCode() {
        
    //     return Objects.hash(company);
    // }
}
