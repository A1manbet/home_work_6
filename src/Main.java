public class Main {
    public static void main(String[] args) {

        Weapon weapon = new Weapon(WeaponType.COLD_WEAPON, "ss22");

        Boss adamSmasher = new Boss(700, 70, weapon);

        System.out.println("Health: " + adamSmasher.getHealth() + " Damage: " + adamSmasher.getDamage() + " Weapon: " +
                adamSmasher.getWeapon().getWeaponType());

    }
}