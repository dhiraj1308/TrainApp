package main;

public class TrainApp {

    // 🔥 Custom Runtime Exception
    public static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    // 🔥 Goods Bogie
    public static class GoodsBogie {
        private String shape;
        private String cargo;

        public GoodsBogie(String shape) {
            this.shape = shape;
        }

        public String getShape() {
            return shape;
        }

        public String getCargo() {
            return cargo;
        }

        // 🔥 Assignment with try-catch-finally
        public void assignCargo(String cargo) {
            try {
                // Unsafe condition
                if (shape.equalsIgnoreCase("Rectangular") &&
                        cargo.equalsIgnoreCase("Petroleum")) {
                    throw new CargoSafetyException("Unsafe cargo assignment!");
                }

                // Safe assignment
                this.cargo = cargo;

            } catch (CargoSafetyException e) {
                System.out.println("Error: " + e.getMessage());

            } finally {
                System.out.println("Assignment attempt completed.");
            }
        }
    }
}