import MiniProjet.*;
import commun.CM;
import org.testng.annotations.Test;

public class Test03 extends CM {


    @Test
    public void test04() {
        PageAccueil p = new PageAccueil(driver);
        String val1 = "standard_user";
        p.saisirlogin(val1);

        String val2 = "secret_sauce";
        p.saisirMdp(val2);

        p.cliquerBoutonLogin();

        PageProduct p2 = new PageProduct(driver);
        p2.TitreProduct();
        p2.addtocart();
        p2.ad();

        PageYourCarte p3 = new PageYourCarte(driver);
        p3.TitreYOURCART();
        p3.Presence1();
        p3.Presence2();
        p3.CHEKOUT();


        PageChekout p4 = new PageChekout(driver);
        String nom = "Hannachi";
        p4.saisirnom(nom);

        String prenom = "Basma";
        p4.saisirprenom(prenom);
        String code = "95000";
        p4.codepostal(code);

        p4.CONTINUE();
        // p4.CHECKOUTYOURINFORMATION();


        PageChekoutOV p5 = new PageChekoutOV(driver);
        p5.CHECKOUTOVERVIEW();
        p5.cliquerBoutonFinish();

       // PageThank p6=new PageThank();

       // p6.thankk();
    }
}