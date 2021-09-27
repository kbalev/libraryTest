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
    public void gameOtherPlayers(){
        Game testGame4 = new Game("Generic Multiplayer");
        assertEquals("There does not seem to be anyone around to play with", testGame4.otherPlayers(), "Wrong message when asking for other players");
    }
    @Test
    public void deviceRequiredTest(){
        Game testGame5 = new Game("Star Citizen");
        assertEquals("I require a computer to be viewed", testGame5.requiredDevice(), "Doesn't know it requires a device");
    }
}
