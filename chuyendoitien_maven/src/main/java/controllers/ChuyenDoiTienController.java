package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
//commit
@Controller
public class ChuyenDoiTienController {
    private boolean isDouble(String s) {
        try {
            double d = Double.parseDouble(s);
            return true;


        } catch (Exception e) {
            return false;
        }
    }

    @GetMapping("/chuyendoitien")
    public String index() {
        return "index";
    }

    @PostMapping("/chuyendoitien")
    public String chuyenDoiTien(@RequestParam String money, @RequestParam String exchangeRate, Model model) {
        String moneyError = "";
        String rateError = "";
        double soTien = 0;
        double tyGia = 0;
        double tienChuyenDoi;

        if (money != "") {
            if (isDouble(money)) {
                soTien = Double.parseDouble(money);
                model.addAttribute("money", soTien);
            } else {
                moneyError = "Số tiền phải là số";
            }
        } else {
            moneyError = "Số tiền không được trống";
        }

        if (exchangeRate != "") {
            if (isDouble(exchangeRate)) {
                tyGia = Double.parseDouble(exchangeRate);
                model.addAttribute("exchange_rate", tyGia);
            } else {
                rateError = "Tỷ giá phải là số";
            }
        } else {
            rateError = "Tỷ giá không được trống";
        }

        if (isDouble(money) && isDouble(exchangeRate)) {
            tienChuyenDoi = soTien * tyGia;
            model.addAttribute("covert_money", tienChuyenDoi);
        }

        model.addAttribute("money_error", moneyError);
        model.addAttribute("rate_error", rateError);

        return "index";
    }
}
