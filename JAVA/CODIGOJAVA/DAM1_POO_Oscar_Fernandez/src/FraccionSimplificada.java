public class FraccionSimplificada extends Fraccion{

    public FraccionSimplificada() {
        super(0, 1);
    }

    public FraccionSimplificada(int num) {
        super(num);
    }

    public FraccionSimplificada(int num, int den) {
        super(num, den);
    }

    public FraccionSimplificada simplificar() {
        int mcd = mcd();

        if (mcd > 0) {
            int numeradorSimplificado = this.num / mcd;
            int denominadorSimplificado = this.den / mcd;
            return new FraccionSimplificada(numeradorSimplificado, denominadorSimplificado);
        }
        else {
            return new FraccionSimplificada(this.num, this.den);
        }
    }

    public int mcd(){
        int u = Math.abs(num);
        int v = Math.abs(den);
        while (v != 0){
            int r = u%v;
            u = v;
            v = r;
        }
        return u;
    }


}
