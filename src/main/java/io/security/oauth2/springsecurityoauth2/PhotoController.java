package io.security.oauth2.springsecurityoauth2;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class PhotoController {

    @GetMapping("/photos/1")
    public Photo photosUrl(){

        Photo photo1 = getPhoto("1", "Photo 1 title", "Photo 1 description");

        return photo1;
    }

    @GetMapping("/photos/2")
//    @PreAuthorize("hasAuthority('SCOPE_photo')")
    public Photo photosMethod(){

        Photo photo2 = getPhoto("2", "Photo 2 title", "Photo 2 description");

        return photo2;
    }
    private Photo getPhoto(String photoId, String photoTitle, String photoDescription) {
        Photo photo = new Photo();
        photo.setUserId("user");
        photo.setPhotoId(photoId);
        photo.setPhotoTitle(photoTitle);
        photo.setPhotoDescription(photoDescription);
        return photo;
    }
}