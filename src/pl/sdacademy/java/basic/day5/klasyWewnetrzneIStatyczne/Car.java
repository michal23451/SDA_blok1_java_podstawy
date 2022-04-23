package pl.sdacademy.java.basic.day5.klasyWewnetrzneIStatyczne;

public class Car {
    private int fuel;
    private static int staticFuel;
    private Engine engine;

    public Car() {
        this.engine = new Engine("V5");
    }


    /*private*/ class Engine { //klasa wewnętrzna też może być private
        private String engineType;

        public Engine(String engineType) {
            this.engineType = engineType;
        }

        public void refuel() {
            System.out.println((fuel += 10));
        }
    }


        //z elementów statycznych nie możemy odwoływać się do elementów niestatycznych!!!
    // z elementów niestatycznych możemy się odwoływać do statycznych i niestatycznych
         static class staticEngine {
            private String engineType;

            public staticEngine(String engineType) {
                this.engineType = engineType;
            }

            public void refuel() {
                System.out.println((staticFuel += 10));
            }

    }
}
