package hangman.model;

public class BonusScore implements GameScore{
	private int score;
	public BonusScore() {
		this.score=0;
	}
	/**
	@pre El juego se inicia en 0 puntos
	@pos El resultado al terminar el juego se bonifica con 10 puntos cada letra correcta y se penaliza con 5 puntos cada letra incorrecta
	@param int correctCount 
	@param int incorrectCount
	@throws El score minimo es menor que 0 
	**/
	@Override
	public int calculateScore(int correctCount, int incorrectCount) throws modelException{
		if(correctCount <0 || incorrectCount <0 ){
            throw new modelException("Parametros Invalidos.");
        }
        int respuesta = 0;
        int score = 0;
        respuesta = score - (incorrectCount*5) + (correctCount*10);
        if (respuesta < 0){
            respuesta = 0;
        }
        return respuesta;
    }

}
