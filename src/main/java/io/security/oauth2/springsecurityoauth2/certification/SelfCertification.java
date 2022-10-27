package io.security.oauth2.springsecurityoauth2.certification;

import io.security.oauth2.springsecurityoauth2.model.users.User;
import io.security.oauth2.springsecurityoauth2.model.users.social.ProviderUser;
import io.security.oauth2.springsecurityoauth2.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SelfCertification {

    private final UserRepository userRepository;
    public void checkCertification(ProviderUser providerUser) {
        //ci �� �ҼȾ��̵� ���� ���̺��� ��ȸ
        User user = userRepository.findByUsername(providerUser.getId());
//        if(user != null) {
            // ci �� �ҼȾ��̵� ���� ���̺� �����Ͱ� �����ϴ� ��� �ش� �Ҽ� ���̵�δ� ���������� �� ������ ������
        boolean bool = providerUser.getProvider().equals("none") || providerUser.getProvider().equals("naver");
        providerUser.isCertificated(bool);
//        }
    }

    public void certificate(ProviderUser providerUser) {

    }
}
