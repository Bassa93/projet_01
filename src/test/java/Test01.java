import MiniProjet.PageAccueil;
import MiniProjet.PageProduct;
import commun.CM;
import org.testng.annotations.Test;

public class Test01 extends CM {
    @Test
    public void test01(){


        PageAccueil p =new PageAccueil(driver);
        String val1="standard_use";
        p.saisirlogin(val1);

        String val2="secret_sauce";
        p.saisirMdp(val2);


        p.cliquerBoutonLogin();
        p.affichertxt();
    }

}
