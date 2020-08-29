package hangman.model;
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
    public void shouldRestScoreOriginalScoreLetterIncorrect()
    {
		OriginalScore puntaje = new OriginalScore();
		int score = puntaje.calculateScore(0,10);
        Assert.assertEquals(1,score);
    }
	@Test
    public void shouldSumScoreBonusScoreLetterCorrect()
    {
		BonusScore puntaje = new BonusScore();
		int score = puntaje.calculateScore(10,0);
        Assert.assertEquals(1,score);
    }
	@Test
    public void shouldRestBonusScoreLetterIncorrect()
    {
		BonusScore puntaje = new BonusScore();
		int score =puntaje.calculateScore(0,5);
        Assert.assertEquals(1,score);
    }
	@Test
    public void shouldSumScorePowerScoreLetterCorrect()
    {
		PowerScore puntaje = new PowerScore();
		int score = puntaje.calculateScore(5,0);
        Assert.assertEquals(1,score);
    }
	
	@Test
    public void shouldRestPowerScoreLetterIncorrect()
    {
		PowerScore puntaje = new PowerScore();
		int score= puntaje.calculateScore(0,8);
        Assert.assertEquals(1,score);
    }
}