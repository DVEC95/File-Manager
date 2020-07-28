package com.codeclan.example.FileManager.components;

import com.codeclan.example.FileManager.models.File;
import com.codeclan.example.FileManager.models.Folder;
import com.codeclan.example.FileManager.models.User;
import com.codeclan.example.FileManager.repositories.FileRepository;
import com.codeclan.example.FileManager.repositories.FolderRepository;
import com.codeclan.example.FileManager.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){
        User user = new User("David");
        userRepository.save(user);

        Folder coolStuff = new Folder("Cool Stuff", user);
        folderRepository.save(coolStuff);

        File coolHaiku = new File("Cool Haiku", "txt", 3, coolStuff);
        fileRepository.save(coolHaiku);
    }
}
