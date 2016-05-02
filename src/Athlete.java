import java.util.ArrayList;
import java.util.List;

/**
 * Created by bearg on 5/1/2016.
 */
public class Athlete {

    public Athlete(int id, String name) {
        mId = id;
        mName = name;
        // mAwards is not set here
    }

    //..elided

    /**
     Lazy initialization is used here; this assumes that awards
     may not always be of interest to the caller,
     and that for some reason it is particularly expensive to
     fetch the List of Awards.
     */

    public List<String> getAwards() {

        if (mAwards == null) {
            List<String> awards = new ArrayList<>();
            awards.add("Gold Medal 2006");
            awards.add("Silver Medal 2002");
            mAwards = awards;
        }

        return mAwards;
    }


    private int mId;
    private String mName;
    private List<String> mAwards;
}
