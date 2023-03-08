package pages;

import java.util.Map;

public class LoginPage extends Page{
    public LoginPage(Router router) {
        super(router);
    }
    @Override
    public Page run() {
        enum Option {
            SIGN_IN,
            SIGN_UP
        }
        Map<String, Option> options = Map.of(
                "Sign In", Option.SIGN_IN,
                "Sign Up", Option.SIGN_UP
        );
        Option selection = promptInput(options);

        return switch (selection) {
            case SIGN_IN -> this.router.getSignIn();
            case SIGN_UP -> this.router.getSignUp();
        };
    }
}
