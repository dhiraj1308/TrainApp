public class SafetyComplianceTest {
    public static void main(String[] args) {
        testCylindricalValid();
        testCylindricalInvalid();
        testRectangularValid();
        testRectangularInvalid();
        System.out.println("All safety compliance tests passed!");
    }

    static void testCylindricalValid() {
        GoodsBogie bogie = new GoodsBogie("T1", BogieShape.CYLINDRICAL, CargoType.PETROLEUM);
        assert bogie.isSafetyCompliant() : "Cylindrical bogie with Petroleum should be valid";
    }

    static void testCylindricalInvalid() {
        GoodsBogie bogie = new GoodsBogie("T2", BogieShape.CYLINDRICAL, CargoType.GRAIN);
        assert !bogie.isSafetyCompliant() : "Cylindrical bogie with Grain should be invalid";
    }

    static void testRectangularValid() {
        GoodsBogie bogie = new GoodsBogie("T3", BogieShape.RECTANGULAR, CargoType.COAL);
        assert bogie.isSafetyCompliant() : "Rectangular bogie with Coal should be valid";
    }

    static void testRectangularInvalid() {
        GoodsBogie bogie = new GoodsBogie("T4", BogieShape.RECTANGULAR, CargoType.CHEMICALS);
        assert !bogie.isSafetyCompliant() : "Rectangular bogie with Chemicals should be invalid";
    }
}