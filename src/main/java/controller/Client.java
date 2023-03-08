package controller;

import pages.*;

public class Client {
    public static void main(String[] args) {

        Router router = new Router();

        LoginPage login = new LoginPage(router);
        SignInPage signIn = new SignInPage(router);
        SignUpPage signUp = new SignUpPage(router);

        router.setLogin(login);
        router.setSignIn(signIn);
        router.setSignUp(signUp);

        Page current = login;
        while (true) {
            current = current.run();
        }
    }
}
