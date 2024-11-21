package week8;

public class FireMon extends Pokemon{
    public FireMon(int number, String name, String type){
        super(number, name, type);
    }

    @Override
    public void learnSkills(String move){
        for(String skill : this.getSkillsSet()){
            if(move.equals(skill)){
                System.out.println("Can not learn same skills");
            }
            this.getSkillsSet()[3] = move;
        }
    }
    
}
