package octopus.antlr.example.advanced_calc;

import java.util.Hashtable;
import java.util.Map;

public class CalcVarb implements IType {
    private String _name;
    private static Map<String, CalcNumber> _map = new Hashtable<>();

    public CalcVarb(String str) {
        _name = str;
    }

    public static void cleanmem() {
        //        System.out.println("clean");
        _map.clear();
        _map = new Hashtable<>();
    }

    @Override
    public Double getValue() {
        //        System.out.println(_map);
        return _map.get(_name).getValue();
    }

    @Override
    public void setValue(Double d) {
        _map.put(_name, new CalcNumber(d.toString()));
    }

    @Override
    public Boolean isValue() {
        return false;
    }

    @Override
    public Boolean isVarb() {
        return true;
    }

    @Override
    public String toString() {
        return "CalVarb{" + "_name='" + _name + '\'' + '}';
    }
}
