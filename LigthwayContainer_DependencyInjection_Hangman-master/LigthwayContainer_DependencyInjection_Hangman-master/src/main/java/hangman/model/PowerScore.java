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
	public int calculateScore(int correctCount, int incorrectCount)throws modelException{
        if(correctCount <0 || incorrectCount <0 ){
            throw new modelException("Parametros Invalidos.");
        }
        int respuesta = 0;
        for(int i=0; i<correctCount;i++){
            respuesta += Math.pow(5,i+1);
        }
        respuesta -= incorrectCount*8;
        if (respuesta < 0){
            respuesta = 0;
        }else if(respuesta > 500){
            respuesta = 500;
        }
        return respuesta;
    }
	

}
