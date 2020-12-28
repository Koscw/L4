package HW4;

public class PearsonMain {
    public static void main(String[] args) {
        Pearson.PearsonY pearsonGrandFather=new Pearson.PearsonY("Alex");
        Pearson.PearsonY pearsonGradMother = new Pearson.PearsonY("Kate");
        Pearson.PearsonY pearsonMother = new Pearson.PearsonY("Alexa",pearsonGradMother,null);
        Pearson.PearsonY pearsonFather = new Pearson.PearsonY("Oleg",null,pearsonGrandFather);
        Pearson.PearsonY pearsonSon=new Pearson.PearsonY("Scott",pearsonMother,pearsonFather);
        System.out.println(pearsonMother);
        System.out.println(pearsonFather);
        System.out.println(pearsonGrandFather);
        System.out.println(pearsonGradMother);
        System.out.println(pearsonSon);
    }
}
