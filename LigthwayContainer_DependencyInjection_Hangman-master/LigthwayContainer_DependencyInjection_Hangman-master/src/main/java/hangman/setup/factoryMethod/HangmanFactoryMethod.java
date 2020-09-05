package hangman.setup.factoryMethod;

import hangman.model.Language;
import hangman.model.GameScore;
import hangman.model.OriginalScore;
import hangman.model.Spanish;
import hangman.model.BonusScore;
import hangman.model.French;
import hangman.model.dictionary.FrenchDictionaryDataSource;
import hangman.model.dictionary.HangmanDictionary;
import hangman.model.dictionary.SpanishDictionaryDataSource;
import hangman.view.*;
import hangman.model.GameScore;
abstract public class HangmanFactoryMethod extends com.google.inject.AbstractModule {
    abstract public Language createLanguage();
    abstract public HangmanDictionary createDictionary();
    abstract public HangmanPanel createHangmanPanel();
   
}
