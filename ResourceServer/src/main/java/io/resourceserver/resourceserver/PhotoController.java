package io.resourceserver.resourceserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class PhotoController {

    @GetMapping("/photos")
    public List<Photo> photos(){

        Photo photo1 = getPhoto("1 ", "title1 ", "Description1 ");
        Photo photo2 = getPhoto("2 ", "title2 ", "Description2 ");

        return Arrays.asList(photo1, photo2);
    }
    private Photo getPhoto(String photoId, String photoTitle, String photoDescription) {
        Photo photo = new Photo();
        photo.setUserId("user ");
        photo.setPhotoId(photoId);
        photo.setPhotoTitle(photoTitle);
        photo.setPhotoDescription(photoDescription);
        return photo;
    }
}