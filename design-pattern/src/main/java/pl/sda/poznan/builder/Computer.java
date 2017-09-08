package pl.sda.poznan.builder;


public class Computer {
    private String processor;
    private String ram;
    private String hdd;
    private String mainboard;

    public Computer(String processor, String ram, String hdd, String mainboard) {
        this.processor = processor;
        this.ram = ram;
        this.hdd = hdd;
        this.mainboard = mainboard;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public String getMainboard() {
        return mainboard;
    }

    public void setMainboard(String mainboard) {
        this.mainboard = mainboard;
    }

    public static class ComputerBuilder {
        private String processor;
        private String ram;
        private String hdd;
        private String mainboard;

        public ComputerBuilder() {

        }

        public ComputerBuilder addProcessor(String processor) {
            this.processor = processor;
            return this;
        }

        public ComputerBuilder addRam(String ram) {
            this.ram = ram;
            return this;
        }

        public ComputerBuilder addHdd(String hdd) {
            this.hdd = hdd;
            return this;
        }

        public ComputerBuilder addMainboard(String mainboard) {
            this.mainboard = mainboard;
            return this;
        }

        public Computer build() {
            return new Computer(processor, ram, hdd, mainboard);
        }
    }
}
