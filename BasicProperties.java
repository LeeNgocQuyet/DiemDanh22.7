abstract public class BasicProperties {
    private int age;
    private String ID;
    private String cage;
    private String uniqueAbility;
    private boolean moveOnGround;
    private boolean CanSwim;

    public BasicProperties(int age, String ID, String cage, String uniqueAbility,boolean moveOnGround,boolean CanSwim) {
        this.age = age;
        this.ID = ID;
        this.cage = cage;
        this.uniqueAbility = uniqueAbility;
        this.moveOnGround = moveOnGround;
        this.CanSwim = CanSwim;

    }
}