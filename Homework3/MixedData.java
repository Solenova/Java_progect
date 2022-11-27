package Homework3;
public class MixedData {
            private double x;
            private int y;
            private int z;
        
            public MixedData(double x, int y, int z){
                this.x = x;
                this.y = y;
                this.z = z;
            }
            
              @Override
            public String toString() {
              return "(" + x + ","+ y + ","+z+ ")";
            }
             
}


        
//         List<MixedData> myParameters = new ArrayList<>();
//         myParameters.add(new MixedData(2, 4.5, 8.9, "Name"));
//     }
// }
