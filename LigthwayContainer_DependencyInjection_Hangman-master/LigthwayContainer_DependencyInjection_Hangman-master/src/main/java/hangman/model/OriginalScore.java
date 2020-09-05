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
	public int calculateScore(int correctCount, int incorrectCount)throws modelException {
        if(correctCount <0 || incorrectCount <0 ){
            throw new modelException("Parametros Invalidos.");
        }
        int respuesta = 0;
        respuesta = score - (incorrectCount*10);
        if (respuesta < 0){
            respuesta = 0;
        }
        return respuesta;
    }

}
