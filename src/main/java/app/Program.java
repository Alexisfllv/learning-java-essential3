package app;

import model.Car;
import model.Subaru;
import model.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Program {


    //  Upper Bounded
    // "Acepta cualquier tipo que sea Tipo o una subclase de Tipo".

    public <S> S m1(List<? extends Vehicle> list){
        return null;
    }
    // lower bounded
    // "Acepta cualquier tipo que sea Tipo o una superclase de Tipo".
    public void m2 (List<? super Car> list){

    }

    public static void main(String[] args) {

        Program p = new Program();
        List<Subaru> list = new ArrayList<>();
        p.m1(list);

        List<Car> list2 = new ArrayList<>();
        p.m2(list2);
    }
}
