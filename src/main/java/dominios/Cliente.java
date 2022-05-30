package dominios;


public class Cliente extends User {
    private String name;
    private Profile profile;

    public Cliente(String name, String username, String password, Role role, String profile) {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }
}