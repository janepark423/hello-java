package stratge;

public class GameCharacter {

    //접근점
    private Weapon weapon;

    //교환 가능하게 해줌
    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public void attack(){
        //weapon.attack 델리게이트를 의미함
        //weapon이 어떤 무기로 공격할지 weapon에게 위임
        weapon.attack();
    }
}
