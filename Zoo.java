import java.util.List;
public class Zoo {
    protected List<String> cage;
    int numerOfmoveOnGround;
    int numerOfCanSwim;

    public Zoo() {
        
    }
    public int countOnGround(){
        int count =0;
        for (int i=0;i<cage.size();i++){
            if (BasicProperties.moveOnGround == true) count ++;
        }
        return count;
    }
    public int countOnGround(){
        int count =0;
        for (int i=0;i<cage.size();i++){
            if (BasicProperties.moveOnGround == true) count ++;
        }
        return count;
    }

}
