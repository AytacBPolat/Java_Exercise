public class Fighter {
    String name;
    int health;
    int weight;
    int damage;
    int dodge;
    Fighter(String name, int health, int weight, int damage, int dodge) {
        this.name = name;
        this.weight =  weight;
        this.health = health;
        this.damage = damage;
        this.dodge = dodge;
    }
    int hit(Fighter opponent){
        System.out.println(this.name +" hit " + opponent.name +" => "+this.damage);
        if (opponent.isDodge()){
            System.out.println(opponent.name +" is dodged the attack !");
            return opponent.health;
        }
    if(opponent.health - this.damage < 0){
        return 0;
    }
    return opponent.health - this.damage;
    }
    boolean isDodge(){
        double randomNumber = Math.random()*100;
        return randomNumber < this.dodge;
    }
}
