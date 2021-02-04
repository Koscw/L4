package Hw4.TransportPearson;

public class Pearson {

        public static class PearsonY {
            private String name;
            private PearsonY mother;
            private PearsonY father;

            public PearsonY(String name) {
                this.name = name;
            }

            public PearsonY(String name, PearsonY mother, PearsonY father) {
                this.name = name;
                this.mother = mother;
                this.father = father;
            }

            @Override
            public String toString() {
               String res="Name "+name+" , ";
               res += "Father "+(this.father !=null? this.father.name:" no father ");
               res+= "Mother "+(this.mother!=null ? this.mother.name:" no mother ");
               return res;
            }
        }

}
