package org.example;


        public class Car {
            private String make;
            private String Modelnum;


            public Car(String make, String model) {
                this.make = make;
                this.Modelnum = model;
            }


            public String getMake() {
                return make;
            }


            public void setMake(String make) {
                this.make = make;
            }


            public String getModel() {
                return model;
            }


            public void setModel(String model) {
                this.model = model;
            }


            public void displayInfo() {
                System.out.println("Data is: "+make+", Model: "+Modelnum);
            }
        }
