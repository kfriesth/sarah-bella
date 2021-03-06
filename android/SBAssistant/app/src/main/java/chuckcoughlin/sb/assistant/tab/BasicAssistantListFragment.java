package chuckcoughlin.sb.assistant.tab;


import android.os.Bundle;
import android.support.v4.app.ListFragment;

/**
 * This is a base class for all the page fragments that aare lists.
 */

public class BasicAssistantListFragment extends ListFragment implements AssistantFragment {

    /**
     * A no-arg constructor is required.
     */
    public BasicAssistantListFragment() {
        Bundle bundle = new Bundle();
        setArguments(bundle);
    }


    public int getPageNumber() {
        return getArguments().getInt(PAGE_ARG);
    }
    public void setPageNumber(int page) {
        getArguments().putInt(PAGE_ARG, page);
    }
    public String getTitle()   {
        return getArguments().getString(TITLE_ARG);
    }
    public void setTitle(String title)   {
        getArguments().putString(TITLE_ARG, title);
    }

    /**
     * The saved state becomes the fragment's state.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    /**
     * Everything that matters is in the bundle.
     * @param stateToSave dictionary of values to persist
     */
    @Override
    public void onSaveInstanceState(Bundle stateToSave) {
        super.onSaveInstanceState(stateToSave);
    }
}
