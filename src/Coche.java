public class Coche {
    public int velocidad;

    public void acelerar_JuanManuel_Belaunde_Martinez(int aceleracion) {
        velocidad += aceleracion;
    }

    public void decelerar_JuanManuel_Belaunde_Martinez(int deceleracion) {
        velocidad -= deceleracion;
        if (velocidad <0)velocidad =0;
    }
}
