package Adapte;

public class AdapterImpl implements Adapter{
    //Math math;

    @Override
    public Float twiceOf(Float f){

    return (float) Math.twoTime(f.doubleValue());
    }

    @Override
    public Float halfOf(Float f) {
        return (float) Math.half(f.doubleValue());
    }
}
