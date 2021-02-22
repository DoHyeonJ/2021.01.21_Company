package main.company.information;

import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
public class InformationController {

    private final InformationService informationService;

    @GetMapping("/settings")
    public String settings(Model model) {
        model.addAttribute(new InformationForm());
        return "/admin/settings";
    }

    @PostMapping("/settings")
    public String settings(@Valid InformationForm informationForm) {

        Information information = Information.builder()
                .name(informationForm.getName())
                .email(informationForm.getEmail())
                .email(informationForm.getEmail())
                .license(informationForm.getLicense())
                .build();

        Information addInformation = informationService.addSettings(information);

        return "/admin/settings";
    }

}
