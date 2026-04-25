import java.util.ArrayList;
import java.util.List;

enum BogieShape {
    RECTANGULAR, CYLINDRICAL
}

enum CargoType {
    GRAIN, COAL, PETROLEUM, CHEMICALS
}

class GoodsBogie {
    private String id;
    private BogieShape shape;
    private CargoType cargo;

    public GoodsBogie(String id, BogieShape shape, CargoType cargo) {
        this.id = id;
        this.shape = shape;
        this.cargo = cargo;
    }

    public boolean isSafetyCompliant() {
        if (shape == BogieShape.CYLINDRICAL) {
            // Cylindrical bogies are restricted to liquid/hazardous cargo
            return cargo == CargoType.PETROLEUM || cargo == CargoType.CHEMICALS;
        } else if (shape == BogieShape.RECTANGULAR) {
            // Rectangular bogies are for solid bulk cargo
            return cargo == CargoType.GRAIN || cargo == CargoType.COAL;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Bogie " + id + " [" + shape + "] carrying " + cargo +
                " - Compliant: " + isSafetyCompliant();
    }
}

public class TrainSafetyApp {
    public static void main(String[] args) {
        List<GoodsBogie> consist = new ArrayList<>();
        consist.add(new GoodsBogie("GB001", BogieShape.CYLINDRICAL, CargoType.PETROLEUM));
        consist.add(new GoodsBogie("GB002", BogieShape.RECTANGULAR, CargoType.GRAIN));
        consist.add(new GoodsBogie("GB003", BogieShape.RECTANGULAR, CargoType.PETROLEUM)); // Invalid

        System.out.println("--- Train Safety Compliance Report ---");
        for (GoodsBogie bogie : consist) {
            System.out.println(bogie);
        }
    }
}