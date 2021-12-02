package generic;

class GenCalculator <T, V, A extends Number> {
     T valueOne;
     V valueTwo;
     A valueThree;

    GenCalculator(T one, V two, A three) {
        valueOne = one;
        valueTwo = two;
        valueThree = three;
    }
    T getValueOne(){
        return valueOne;
    }
    V getValueTwo(){
        return valueTwo;
    }
    A getValueThree(){
        return valueThree;
    }

    public <T, V, A extends Number> double sum (){
        Double v1 = Double.parseDouble(getValueOne().toString());
        Double v2 = Double.parseDouble(getValueTwo().toString());
        Double v3 = Double.parseDouble(getValueThree().toString());

        return v1 + v2 + v3;
    }
}

class SumDemo{
    public static void main(String[] args) {
        GenCalculator<Integer, Double, Float> obj = new GenCalculator<Integer, Double, Float>(5, 2.4, 6.8f);

        System.out.println(obj.sum());

    }
}
