package rest;

import org.springframework.web.client.RestTemplate;	

public class GetGitHubUserInfo {

    public static void main(String[] args) {

        RestTemplate restTemplate = new RestTemplate();
        GitHubUser user = restTemplate.getForObject("https://api.github.com/users/srikanthpragada", 
        		                                    GitHubUser.class);
        
        System.out.println("Login   :    " + user.getLogin());
        System.out.println("Email   :    " + user.getEmail());
        System.out.println("Company :    " + user.getCompany());
        System.out.println("Location:    " + user.getLocation());
        System.out.println("Created :    " + user.getCreated_at());
    }

}
