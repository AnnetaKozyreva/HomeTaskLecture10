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
    T getValueOne(T valueOne){
        return valueOne;
    }
    V getValueTwo(V valueTwo){
        return valueTwo;
    }
    A getValueThree(A valueThree){
        return valueThree;
    }

    public <T, V, A extends Number> double sum (){
        Double v1 = Double.parseDouble(getValueOne(valueOne).toString());
        Double v2 = Double.parseDouble(getValueTwo(valueTwo).toString());
        Double v3 = Double.parseDouble(getValueThree(valueThree).toString());

        return v1 + v2 + v3;
    }
}

class SumDemo{
    public static void main(String[] args) {
        GenCalculator<Integer, Double, Float> obj = new GenCalculator<Integer, Double, Float>(5, 2.4, 6.8f);

        System.out.println(obj.sum());

    }
}
