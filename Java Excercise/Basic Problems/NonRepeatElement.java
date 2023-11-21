import java.util.*;

class NonRepeatElements{
  static int count=0;
  void elimination (int[] A1, int[] A2){
    for(int i=0;i<A1.length;i++){
      boolean flag=false;
      
      for(int j=0;j<A2.length;j++){
        if(A1[i]==A2[j]){
          flag=true;
          break;
        }
        
      }
      if(flag==false){
        System.out.print(A1[i]+" ");
        count++;
      }
      
    }
    
  }
}

public class NonRepeatElement {
    public static void main(String[] args) {
       int[] A1={1,2,8,6,5};
       int[] A2={2,6,8,10};
       NonRepeatElements np= new NonRepeatElements();
       np.elimination(A1,A2);
       np.elimination(A2,A1);
       System.out.println("count="+NonRepeatElements.count);
        }
}