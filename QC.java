import com.ibm.quantum.circuit.*;
import com.ibm.quantum.circuit.library.*;
import com.ibm.quantum.transpiler.*;
import com.ibm.quantum.utils.*;

public class GroverExample {
   public static void main(String[] args) {
      Circuit circuit = new Circuit(3);
      
      circuit.add(Gate.h(0));
      circuit.add(Gate.h(1));
      circuit.add(Gate.h(2));
      
      circuit.add(Gate.x(2));
      circuit.add(Gate.h(2));
      circuit.add(Controlled.not(2, 0));
      circuit.add(Gate.h(2));
      circuit.add(Gate.x(2));
      
      circuit.add(Gate.x(0));
      circuit.add(Controlled.x(1, 0));
      circuit.add(Gate.x(0));
      
      circuit.add(Gate.h(0));
      circuit.add(Gate.h(1));
      circuit.add(Gate.h(2));
      
      System.out.println(circuit);
   }
}
