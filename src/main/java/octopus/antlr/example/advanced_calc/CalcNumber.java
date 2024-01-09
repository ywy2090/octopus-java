package octopus.antlr.example.advanced_calc;

public class CalcNumber implements IType {
    private Double _value;

    public CalcNumber(String str) {
        _value = Double.valueOf(str);
    }

    public void setValue(Double d) {
        _value = d;
    }

    @Override
    public Double getValue() {
        return _value;
    }

    @Override
    public Boolean isValue() {
        return true;
    }

    @Override
    public Boolean isVarb() {
        return false;
    }

    @Override
    public String toString() {
        return "CalNumber{" + "_value=" + _value + '}';
    }
}
