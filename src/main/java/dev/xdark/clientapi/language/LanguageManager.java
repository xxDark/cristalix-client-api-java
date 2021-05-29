package dev.xdark.clientapi.language;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;

import java.util.SortedSet;

@SidedApi(Side.SERVER)
public interface LanguageManager {

  Language getLanguage(String code);

  boolean isCurrentLanguageBidirectional();

  void setCurrentLanguage(Language language);

  Language getCurrentLanguage();

  SortedSet<Language> getLanguages();

  boolean isCurrentLocaleUnicode();

  Locale getCurrentLocale();
}
