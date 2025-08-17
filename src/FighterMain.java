public class FighterMain {
    public static void main(String[] args) {
    Fighter f1 = new Fighter("A",100,120,12,40);
    Fighter f2 = new Fighter("B",100,120,6,100);
    Match fight = new Match(f1,f2,100, 120);
    fight.run();
    }
}
