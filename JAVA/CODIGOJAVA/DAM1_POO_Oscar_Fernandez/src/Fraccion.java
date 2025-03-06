public class Fraccion {
    protected int num;
    protected int den;

    Fraccion(){
        this(0,1);
    }

    Fraccion(int num){
        this(num,1);
    }

    Fraccion(int num, int den) {
        this.num = num;
        this.den = den;
        if (den==0){
            throw new DivisionPorCero("No se puede poner un denominador 0");
        }
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
        if (den==0){
            throw new DivisionPorCero("No se puede poner un denominador 0");
        }
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;

    }

    public Fraccion sumar(Fraccion fraccion){
        int operacion1 = this.num *fraccion.getDen();
        int operacion2 = this.den *fraccion.getNum();
        int numerador_Resultado = operacion1 + operacion2;
        int denominador_Resultado = this.den*fraccion.getDen();
        return new FraccionSimplificada(numerador_Resultado,denominador_Resultado).simplificar();
    }

    public Fraccion restar(Fraccion fraccion){
        int operacion1 = this.num *fraccion.getDen();
        int operacion2 = this.den *fraccion.getNum();
        int numerador_Resultado = operacion1 - operacion2;
        int denominador_Resultado = this.den*fraccion.getDen();
        return new FraccionSimplificada(numerador_Resultado,denominador_Resultado).simplificar();
    }


    public Fraccion multiplicar(Fraccion fraccion){
        int numerador_Resultado = this.num*fraccion.getNum();
        int denominador_Resultado = this.den*fraccion.getDen();
        return new FraccionSimplificada(numerador_Resultado,denominador_Resultado).simplificar();
    }

    public Fraccion dividir(Fraccion fraccion){
        int numerador_Resultado = this.num*fraccion.getDen();
        int denominador_Resultado = this.den*fraccion.getNum();
        return new FraccionSimplificada(numerador_Resultado,denominador_Resultado).simplificar();
    }



    @Override
    public String toString(){
        return num+"/"+den;
    }
}
