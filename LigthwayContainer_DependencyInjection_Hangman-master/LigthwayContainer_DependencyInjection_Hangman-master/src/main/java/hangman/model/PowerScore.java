package hangman.model;

public class PowerScore implements GameScore {
	private int score;
	public PowerScore() {
		this.score=0;
	}
	/**
	@pre El juego se inicia en 0 puntos
	@pos El resultado al terminar el juego se penaliza con 8 puntos cada letra errada y La $i-�sima$ letra correcta se bonifica con $5^i$ 
	@param int correctCount 
	@param int incorrectCount
	@throws El puntaje minimo es 0
	@throws Si con las reglas anteriores sobrepasa 500 puntos, el puntaje es 500.
	**/
	@Override
	public int calculateScore(int correctCount, int incorrectCount) {
		// TODO Auto-generated method stub
		return 0;
	}

}
