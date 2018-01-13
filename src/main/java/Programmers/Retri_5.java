package Programmers;

import java.util.ArrayList;
import java.util.List;

public class Retri_5 {

    public class Monster{
        int x;
        int y;

        public Monster(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

    public int solution(int[][] monsters, int[][] bullets) {

        List<Monster> deadMonsterList = new ArrayList<>();
        boolean divideX = false;
        boolean divideY = false;

        for(int i = 0; i < bullets.length; i ++){
            int bulletX = bullets[i][0];
            int bulletY = bullets[i][1];
            for(int q = 0; q < monsters.length; q++){
                divideX = false;
                divideY = false;

                int monsterX = monsters[q][0];
                int monsterY = monsters[q][1];

                if(Math.abs(bulletX) >= Math.abs(monsterX) && Math.abs(bulletY) >= Math.abs(monsterY)){
                    if(bulletX != 0 && monsterX != 0) {
                        if (bulletX % monsterX == 0)
                            divideX = true;
                    }

                    if(bulletX == 0 && monsterX == 0){
                        divideX = true;
                        if((bulletY > 0 && monsterY > 0) || (bulletY < 0 && monsterY < 0)) {
                            divideY = true;
                        }
                    }

                    if(bulletY != 0 && monsterY != 0) {
                        if (bulletY % monsterY == 0) {
                            divideY = true;
                        }
                    }

                    if(bulletY == 0 && monsterY == 0){
                        divideY = true;
                        if((bulletX > 0 && monsterX > 0) || (bulletX < 0 && monsterX < 0)) {
                            divideX = true;
                        }
                    }

                    if(((bulletY > 0 && monsterY > 0) || (bulletY < 0 && monsterY < 0)) &&
                            ((bulletX > 0 && monsterX > 0) || (bulletX < 0 && monsterX < 0))){
                        if(monsterX == monsterY && bulletX == bulletY){
                            divideX = true;
                            divideY = true;
                        }
                    }
                }else if(Math.abs(bulletX) <= Math.abs(monsterX) && Math.abs(bulletY) <= Math.abs(monsterY)){
                    if(bulletX != 0 && monsterX != 0) {
                        if (monsterX % bulletX == 0) {
                            divideX = true;
                        }
                    }

                    if(bulletX == 0 && monsterX == 0){
                        divideX = true;
                        if((bulletY > 0 && monsterY > 0) || (bulletY < 0 && monsterY < 0)) {
                            divideY = true;
                        }
                    }

                    if(bulletY != 0 && monsterY != 0) {
                        if (monsterY % bulletY == 0 && bulletY != 1) {
                            divideY = true;
                        }
                    }

                    if(bulletY == 0 && monsterY == 0){
                        divideY = true;
                        if((bulletX > 0 && monsterX > 0) || (bulletX < 0 && monsterX < 0)) {
                            divideX = true;
                        }
                    }

                    if(((bulletY > 0 && monsterY > 0) || (bulletY < 0 && monsterY < 0)) &&
                            ((bulletX > 0 && monsterX > 0) || (bulletX < 0 && monsterX < 0))){
                        if(monsterX == monsterY && bulletX == bulletY){
                            divideX = true;
                            divideY = true;
                        }
                    }
                }

                if(divideX && divideY){

                    boolean isContains = false;
                    for(Monster monster : deadMonsterList){
                        if(monster.x == monsterX && monster.y == monsterY)
                            isContains = true;
                    }

                    if(isContains == false) {
                        if(((bulletY > 0 && monsterY > 0) || (bulletY < 0 && monsterY < 0)) &&
                                ((bulletX > 0 && monsterX > 0) || (bulletX < 0 && monsterX < 0)) ||
                                ((bulletX == 0 && monsterX == 0) ||(bulletY == 0 && monsterY == 0))) {
                            Monster deadMonster = new Monster(monsterX, monsterY);
                            deadMonsterList.add(deadMonster);
                            break;
                        }
                    }else{
                        continue;
                    }
                }
            }
        }

        return deadMonsterList.size();
    }

}
