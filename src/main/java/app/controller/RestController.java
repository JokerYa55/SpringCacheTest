package app.controller;

import app.bean.Token;
import lombok.extern.slf4j.Slf4j;
import org.keycloak.representations.idm.UserRepresentation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@org.springframework.web.bind.annotation.RestController
@RequestMapping(path = "/")
public class RestController {

    @Autowired
    Token token;
    
    @GetMapping(path = "/test", produces = "application/json")
    public ResponseEntity<UserRepresentation> getUserInfo() {

//        token.getToken("10");

//        RestTemplate restTemplate = new RestTemplateBuilder().build();
//        String url = "";
//
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_JSON);
//        headers.add("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJRYjYxcms5Vmt2RkZnREpKMDdrNnotVkQtaWljV0g0bUt3dkZDYlVDRFIwIn0.eyJqdGkiOiI4ZGM1MzEwZS04YTRhLTRkZDEtODU4My1jN2I0ZDllMmU2NWEiLCJleHAiOjE1NzczNDczOTMsIm5iZiI6MCwiaWF0IjoxNTc3MzQ1NTkzLCJpc3MiOiJodHRwOi8vZGV2MXNzb2FwcDEuc291dGgucnQucnU6ODA4MC9hdXRoL3JlYWxtcy9iMmMiLCJhdWQiOiJsa19iMmMiLCJzdWIiOiJmOjBkNGRiNmU2LWYwNWYtNGNkYS04NGM1LThiMzM1Mzg5MjJjOTozIiwidHlwIjoiQmVhcmVyIiwiYXpwIjoibGtfYjJjIiwiYXV0aF90aW1lIjowLCJzZXNzaW9uX3N0YXRlIjoiYTAzNTkzZjQtYzA2Yy00MzNkLWE5ZGMtNzVjNmQ4N2NjYzFhIiwiYWNyIjoiMSIsImFsbG93ZWQtb3JpZ2lucyI6W10sInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJ1bWFfYXV0aG9yaXphdGlvbiJdfSwicmVzb3VyY2VfYWNjZXNzIjp7IndlYl9ydCI6eyJyb2xlcyI6WyJhZG1pbl9yb2xlIl19LCJsa19jYW1lcmFfbGlwZXRzayI6eyJyb2xlcyI6WyJhZG1pbl9yb2xlIl19LCJyZWFsbS1tYW5hZ2VtZW50Ijp7InJvbGVzIjpbInZpZXctaWRlbnRpdHktcHJvdmlkZXJzIiwibWFuYWdlLXVzZXJzIiwidmlldy11c2VycyIsInZpZXctY2xpZW50cyIsInF1ZXJ5LWNsaWVudHMiLCJxdWVyeS1ncm91cHMiLCJxdWVyeS11c2VycyJdfSwibGtfZG1oIjp7InJvbGVzIjpbImFkbWluX3JvbGUiXX0sImFjY291bnRfYjJjIjp7InJvbGVzIjpbImFkbWluX3JvbGUiXX0sImxrX3ZpZGVvX29ic2VydmF0aW9uIjp7InJvbGVzIjpbImFkbWluX3JvbGUiXX0sImxrX3NtYXJ0aG9tZSI6eyJyb2xlcyI6WyJhZG1pbl9yb2xlIl19LCJsa19iMmMiOnsicm9sZXMiOlsiYWRtaW5fcm9sZSJdfSwiYWNjb3VudCI6eyJyb2xlcyI6WyJtYW5hZ2UtYWNjb3VudCIsIm1hbmFnZS1hY2NvdW50LWxpbmtzIiwidmlldy1wcm9maWxlIl19fSwicHJlZmVycmVkX3VzZXJuYW1lIjoiYWRtaW5fYWxsIn0.cNQtokh3RptLT_mbdxhDxaYh5wIvZWrmHgAkoXIDxTZFsakHwuOzjlp_E-dEJ-Mp2GwVe_z7rXgLEsBedSYDshlJbpL1XrDTPjaSfRWCxQ_wUBijE8cTNpxr9AImGi3WLr59dlAH0nFjvO52Yw0IG-6jh5xrgvwExDpsbU4Fl5CzTLLMDDiooo_4yjH5MZkR0fevosONMRfaIDjzZUJbYREPeH6jrlOUdSObl1_frh3xBYr2BeqYMMEqso2NPsZJbpYM3lt1KTKIrrvKCDKoq76jLlJ9pBh5z6Q5iowigLdJaUZyWaateO6g23CL77ras8XG4k5DYf9iFHO9KvsKMg");
//        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
//        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);

        return new ResponseEntity(token.getToken("10"), HttpStatus.OK);

    }

}
