public class FactoryPattern {
    public static void main(String[] args) {
        boolean isAuthorized = false;

        UserAuthentication userAuthentication = UserAuthenticationFactory.getUserAuthentication("jdbc");
        isAuthorized = userAuthentication.authorize();

        if (isAuthorized) {
            System.out.println("Authorized");
        } else {
            System.out.println("Unauthorized");
        }
    }
}
