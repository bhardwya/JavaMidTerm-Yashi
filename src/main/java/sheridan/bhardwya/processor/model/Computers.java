package sheridan.bhardwya.processor.model;

public class Computers {

        private String processorName;
        private String manufacturer;
        private boolean windows11Ready;

        // Add constructor, getters, and setters

        // Default constructor
        public Computers() {
            this.manufacturer = "Intel";
        }

        // Parameterized constructor
        public Computers(String processorName, String manufacturer, boolean windows11Ready) {
            this.processorName = processorName;
            this.manufacturer = manufacturer;
            this.windows11Ready = windows11Ready;
        }
}
