public class BonusMilesService {
    public int calculate(int cost) {
        int ticket = 1_000;
        int mile = 20;
        int bonus = ticket / mile;

        return bonus;
    }
}