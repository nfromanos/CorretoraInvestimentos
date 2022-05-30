package dominios;


public class Cliente extends Usuario {
    private String name;
    private Profile profile;

    public Cliente(String name, String username, String password, String role, String profile) {
        super(username, password, role);
        this.name = name;
        this.id = generateId();
        this.profile = returnProfile(profile);
    }

    public Profile returnProfile(String profileString) {
        int profileInt = Integer.parseInt(profileString);
        //   Colocar o switch no ENUM;
        if (profileInt == 3) {
            return Profile.AGRESSIVO;
        } else if (profileInt == 2) {
            return Profile.MODERADO;
        } else {
            return Profile.CONSERVADOR;
        }

    }

}