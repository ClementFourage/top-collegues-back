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
            this.collegueRepo.save(new Collegue("Rod", 100, "https://previews.123rf.com/images/nyul/nyul1102/nyul110200249/8748722-rire-vieil-homme-utilisant-un-ordinateur-portable-%C3%A0-la-maison-en-regardant-l-%C3%A9cran-faisant-des-gestes.jpg"));
            this.collegueRepo.save(new Collegue("Alice", 400, "https://images.pexels.com/photos/265036/pexels-photo-265036.jpeg?w=1260&h=750&auto=compress&cs=tinysrgb"));
        }
    }
}
