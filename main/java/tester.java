import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class tester {

    public static void main(String[] args) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(4);
        //El String que mandamos al metodo encode es el password que queremos encriptar.
        System.out.println(bCryptPasswordEncoder.encode("12345"));
    }
}
