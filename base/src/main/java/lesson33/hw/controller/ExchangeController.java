package lesson33.hw.controller;

import lesson33.hw.dto.ResultDtoExchange;
import lesson33.hw.service.ExchangeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import java.io.IOException;

@RestController
@RequiredArgsConstructor
@RequestMapping("/change")
public class ExchangeController {


    private final ExchangeService exchangeService;

    @PostMapping("/countCourse")
    public ResultDtoExchange countCourse
            (@RequestParam("val1") String val1, @RequestParam("val2") String val2, @RequestParam("amount2") Integer amount2)
            throws XPathExpressionException, IOException, ParserConfigurationException, SAXException {
        return new ResultDtoExchange(exchangeService.countingCourse(val1, val2, amount2),
                exchangeService.getNameValute(val1),
                exchangeService.getNameValute(val2),
                exchangeService.getDate());
    }

}
