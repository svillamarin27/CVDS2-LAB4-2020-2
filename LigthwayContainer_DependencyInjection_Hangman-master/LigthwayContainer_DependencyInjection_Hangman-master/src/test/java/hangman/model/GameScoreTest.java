package hangman.model;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

/**
import static org.junit.Assert.assertTrue;
import org.junit.Assert;
import org.junit.Test;
**/
import hangman.model.BonusScore;
import hangman.model.OriginalScore;
import hangman.model.PowerScore;

public class GameScoreTest 
{
 
    @Test
    public void shouldScoreOriginalOne() throws modelException
    {
		OriginalScore puntaje = new OriginalScore();
		int score = puntaje.calculateScore(0,2);
        Assert.assertEquals(80,puntaje);
    }
	@Test
    public void shouldScoreOriginalTwo() throws modelException
    {
		OriginalScore puntaje = new OriginalScore();
		int score = puntaje.calculateScore(0,8);
        Assert.assertEquals(20,puntaje);
    }
	@Test
    public void shouldScoreBonusOne() throws modelException
    {
		BonusScore puntaje = new BonusScore();
		int score = puntaje.calculateScore(5,2);
        Assert.assertEquals(40,score);
    }
	@Test
    public void shouldScoreBonusTwo() throws modelException
    {
		BonusScore puntaje = new BonusScore();
		int score = puntaje.calculateScore(6,5);
        Assert.assertEquals(35,score);
    }
	
	@Test
    public void shouldScorePowerOne() throws modelException
    {
		PowerScore puntaje = new PowerScore();
		int score = puntaje.calculateScore(3,2);
        Assert.assertEquals(139,score);
    }
	@Test
    public void shouldScorePowerTwo() throws modelException
    {
		PowerScore puntaje = new PowerScore();
		int score = puntaje.calculateScore(2,2);		
        Assert.assertEquals(14,score);
    }
}