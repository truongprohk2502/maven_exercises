package services;

import models.Word;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("dictionaryService")
public class DictionaryServiceImpl implements DictionaryService {

    @Override
    public List<Word> getWords() {
        List<Word> words = new ArrayList<>();
        words.add(new Word("hello", "xin chào"));
        words.add(new Word("city", "thành phố"));
        words.add(new Word("dog", "con chó"));
        words.add(new Word("yellow", "màu vàng"));
        words.add(new Word("language", "ngôn ngữ"));

        return words;
    }
}
