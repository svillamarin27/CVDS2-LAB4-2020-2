package hangman.model;

public class OriginalScore implements GameScore {
	public OriginalScore(){
		
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
