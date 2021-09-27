package GameTests;

import alexandria.Game;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameMethodTest {
    @Test
    public void gameSetTitle(){
        Game testGame1 = new Game("Generic Shooter");
        testGame1.setTitle("Valorant");
        assertEquals("Valorant", testGame1.getTitle(), "Wrong game title");
    }
    @Test
    public void gameSetStudio(){
        Game testGame2 = new Game("Generic MOBA");
        testGame2.setStudio("Riot");
        assertEquals("Riot", testGame2.getStudio(),"Wrong studio");
    }
    @Test
    public void gameSetAgeRating(){
        Game testGame3 = new Game("Generic 4X");
        testGame3.setAgeRating(25);
        assertEquals(25, testGame3.getAgeRating(), "Wrong age rating");
    }
    @Test
    public void gameOtherPlayers(){}
}
