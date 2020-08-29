package hangman.model;

public class OriginalScore implements GameScore {
	private int score;
	public OriginalScore(){
		this.score=100;
	}
	/**
	 * @pre Es el esquema actual, se inicia con 100 puntos.
	 * @pos El puntaje del juego se califica descontando de a 10 puntos cada vez que se equiveque por letra
	 * @param int correctCount
	 * @param int incorrectCount
	 */

	@Override
	public int calculateScore(int correctCount, int incorrectCount) {
		// TODO Auto-generated method stub
		return 0;
	}

}
