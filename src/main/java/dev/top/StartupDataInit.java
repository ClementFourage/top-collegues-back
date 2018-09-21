package dev.top;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import dev.top.entities.Collegue;
import dev.top.repos.CollegueRepo;

@Component
public class StartupDataInit {

    @Autowired
    CollegueRepo collegueRepo;

    @EventListener(ContextRefreshedEvent.class)
    public void init() {

        if(this.collegueRepo.count() <= 0) {
            this.collegueRepo.save(new Collegue("Roddy", "Rod", "Stewart", "1600 Pennsylvania Ave NW, Washington, DC", 980 , "https://memegenerator.net/img/images/13248230/old-man-at-computer.jpg"));
            this.collegueRepo.save(new Collegue("Alice36", "Alice", "Bidule", "1350 Goosetown Drive" , 400, "https://thumbs.dreamstime.com/b/young-business-woman-computer-young-business-woman-computer-office-117010995.jpg"));
            this.collegueRepo.save(new Collegue("LeVieux", "Edmond", "Plouc", "2077 James Martin Circle" , -250, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTkAG8-3DH-S_s1Nh6b_hN_AbCRk0H9dvc0FekqPX0KLbpX5wBsjA"));
        }
    }
}
