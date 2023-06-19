package Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.processing.Processor;

@Controller
public class ControllerProcessor {
    @GetMapping("/")
    public String showInputPage(Model model) {
     //   Model processor = model.addAttribute("processor", new Processor());
        return "input";
    }

    @PostMapping("/submit")
    public String processForm(@RequestParam("processorName") String processorName,
                              @RequestParam("manufacturer") String manufacturer,
                              @RequestParam(value = "windows11Ready", required = false) boolean windows11Ready,
                              Model model) {


      //  Processor processor = new Processor(processorName, manufacturer, windows11Ready);

        // Return Output
        model.addAttribute("processor", processor);
        return "output";
    }
}

