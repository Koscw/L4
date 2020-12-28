package HW4;

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
            public String toString()
            {
                if ( ( mother == null ) && ( father == null ) )
                {
                    return "Grandparent name is " + name + ", no mother, no father";
                }
                else if ( ( mother == null ) && ( father != null ) )
                {
                    return "Father name is " + name + ", no mother, father is " + father.name;
                }
                else if ( ( mother != null ) && ( father == null ) )
                {
                    return "Mother name is " + name + ", mother is " + mother.name + ", no father";
                }
                else
                {
                    return "Child name is " + name + ", mother is " + mother.name + ", father is " + father.name;
                }
            }

        }

}
