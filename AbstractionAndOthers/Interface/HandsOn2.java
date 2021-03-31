package AbstractionAndOthers.Interface;
import AbstractionAndOthers.Interface.Music.*;
import AbstractionAndOthers.Interface.Music.Wind.Saxophone;
import AbstractionAndOthers.Interface.Music.String.*;
public class HandsOn2 {
    public static void main(String[] arg) {
        Saxophone s=new Saxophone();
        s.play();

        Veena v=new Veena();
        v.play();

        Playable ps=new Saxophone();
        ps.play();

        Playable pv=new Veena();
        pv.play();
    }
}
