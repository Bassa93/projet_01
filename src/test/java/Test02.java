import MiniProjet.PageAccueil;
import MiniProjet.PageProduct;
import commun.CM;
import org.testng.annotations.Test;

public class Test02 extends CM {
    @Test
    public void test02(){
        PageAccueil p =new PageAccueil(driver);
        String val1="standard_user";
        p.saisirlogin(val1);

        String val2="secret_sauce";
        p.saisirMdp(val2);
        p.cliquerBoutonLogin();


    }
}
