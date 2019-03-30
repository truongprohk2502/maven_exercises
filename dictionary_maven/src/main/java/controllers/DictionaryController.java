package controllers;

import models.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import services.DictionaryService;

import java.util.List;

@Controller
public class DictionaryController {
    @Autowired
    private DictionaryService dictionary;

    @GetMapping("/dictionary")
    public String index() {
        return "index";
    }

    @PostMapping("/dictionary")
    public String translate(@RequestParam String english_word, Model model) {
        if (english_word != "") {
            model.addAttribute("english_word", english_word);
            List<Word> words = dictionary.getWords();
            for (Word word : words) {
                if (word.getEnglish().equals(english_word)) {
                    model.addAttribute("vietnamese_word", word.getVietnamese());
                    return "index";
                }
            }

            model.addAttribute("translate_error", "Không tìm thấy từ cần tìm");
        } else {
            model.addAttribute("blank_error", "Vui lòng nhập từ cần dịch");
        }

        return "index";
    }
}
