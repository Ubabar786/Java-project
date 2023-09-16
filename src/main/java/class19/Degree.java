package class19;

public class Degree {
    public void getPrerequisite(){
         System.out.println("To get a degree you need high school diploma");
    }
}
class Bachelors extends Degree{
    public void getPrerequisite(){
        super.getPrerequisite();
    }
}
class Masters extends Degree {
    @Override
        public void getPrerequisite(){
            System.out.println("To get a Masters you need a Bachelors");
    }
}


