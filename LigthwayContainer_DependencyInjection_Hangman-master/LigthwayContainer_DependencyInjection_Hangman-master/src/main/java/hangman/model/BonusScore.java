package hangman.model;

public class BonusScore implements GameScore{
	public BonusScore() {
		
	}
	/**
	@pre El juego se inicia en 0 puntos
	@pos El resultado al terminar el juego se bonifica con 10 puntos cada letra correcta y se penaliza con 5 puntos cada letra incorrecta
	@param int correctCount 
	@param int incorrectCount
	@throws El puntaje minimo es menor que 0 
	**/
	@Override
	public int calculateScore(int correctCount, int incorrectCount) {
		// TODO Auto-generated method stub
		return 0;
	}

}
