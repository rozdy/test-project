package sorry.no.domain.test_project.logic.board;

import android.widget.BaseAdapter;

/**
 * Created by hex on 8/25/2015 in the name of the Emperor!
 */
abstract public class BoardAdapter extends BaseAdapter {
    abstract protected boolean isPositionOnBoard(int position);

    abstract public int getXByPosition(int position) throws InvalidPositionException;

    abstract public int getYByPosition(int position) throws InvalidPositionException;
}
