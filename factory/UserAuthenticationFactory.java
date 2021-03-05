public class UserAuthenticationFactory {
    private UserAuthenticationFactory() {
    }
    public static UserAuthentication getUserAuthentication(String type) {
        if (type.equalsIgnoreCase("jdbc")) {
            return new JDBCUserAuthentication();
        }
        else if (type.equalsIgnoreCase("ldap")) {
            return new LDAPUserAuthentication();
        }
        else{
            return new JDBCUserAuthentication();
        }
    }
}
